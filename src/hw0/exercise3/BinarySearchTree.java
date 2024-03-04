package hw0.exercise3;

import java.util.Random;

public class BinarySearchTree extends BinaryTree {
    public int findMin() {
        Node node = this.root;
        while (node.getLeftChildren() != null) {
            node = node.getLeftChildren();
        }
        return node.getData();
    }

    private Node findMin(Node node) {
        while (node.getLeftChildren() != null) {
            node = node.getLeftChildren();
        }
        return node;
    }

    public Node search(int x, Node root) {
        if (x == root.getData()) return root;
        if (x < root.getData()) {
            if (root.getLeftChildren() != null) {
                return search(x, root.getLeftChildren());
            } else {
                return null;
            }
        } else if (x > root.getData()) {
            if (root.getRightChildren() != null) {
                return search(x, root.getRightChildren());
            } else {
                return null;
            }
        }
        return null;
    }

    public void insert(int x, Node root) {
        if (this.root == null) {
            this.root = root;
        }
        if (x == root.getData()) return;
        Node node = root;
        if (x > node.getData()) {
            if (node.hasRight()) {
                insert(x, node.getRightChildren());
            } else {
                Node newNode = new Node(x);
                node.setRightChildren(newNode);
                newNode.setParent(node);
            }
        }
        if (x < node.getData()) {
            if (node.hasLeft()) {
                insert(x, node.getLeftChildren());
            } else {
                Node newNode = new Node(x);
                node.setLeftChildren(newNode);
                newNode.setParent(node);
            }
        }
    }

    public void delete(int x, Node root) {
        if (x == root.getData()) {
            if (root.hasLeft() && root.hasRight()) {
                Node minNode = findMin(root.getRightChildren());
                if (minNode.hasRight()) {
                    minNode.getParent().setLeftChildren(minNode.getRightChildren());
                    minNode.getRightChildren().setParent(minNode.getParent());
                }
                root.getLeftChildren().setParent(minNode);
                root.getRightChildren().setParent(minNode);
                minNode.setRightChildren(root.getRightChildren());
                minNode.setLeftChildren(root.getLeftChildren());
                this.root = minNode;
                this.root.setParent(null);
            } else if (root.hasRight() && !root.hasLeft()) {
                Node minNode = findMin(root.getRightChildren());
                if (minNode.hasRight()) {
                    minNode.getParent().setLeftChildren(minNode.getLeftChildren());
                    minNode.getRightChildren().setParent(minNode.getParent());
                }
                root.getRightChildren().setParent(minNode);
                minNode.setRightChildren(root.getRightChildren());
                this.root = minNode;
                this.root.setParent(null);
            } else if (!root.hasRight() && root.hasLeft()) {
                this.root = root.getLeftChildren();
                this.root.setParent(null);
            } else {
               this.root = null;
            }
            return;
        }
        Node node = search(x, root);
        if (!node.hasLeft() && !node.hasRight()) {
            if (node == node.getParent().getLeftChildren()) {
                node.getParent().setLeftChildren(null);
            } else {
                node.getParent().setRightChildren(null);
            }
        } else if (node.hasLeft() && !node.hasRight()) {
            node.getParent().setLeftChildren(node.getLeftChildren());
            node.getLeftChildren().setParent(node.getParent());
        } else if (!node.hasLeft() && node.hasRight()) {
            node.getParent().setLeftChildren(node.getRightChildren());
            node.getRightChildren().setParent(node.getParent());
        } else {
            Node minNode = findMin(node.getRightChildren());
            if (minNode.hasRight()) {
                minNode.getParent().setLeftChildren(minNode.getLeftChildren());
                minNode.getRightChildren().setParent(minNode.getParent());
            }
            if (node.getParent().getLeftChildren() ==node) {
                node.getParent().setLeftChildren(minNode);
            }else {
                node.getParent().setRightChildren(minNode);
            }
            node.getLeftChildren().setParent(minNode);
            minNode.setParent(node.getParent());
            minNode.setLeftChildren(node.getLeftChildren());
        }

    }

    public void printTree(Node node, int space) {
        Node tmp = node;
        if (tmp != null) {
            printTree(tmp.getRightChildren(), space + 1);
            if (space != 0) {
                for (int i = 0; i < space - 1; i++) {
                    System.out.print("\t\t");
                }
                System.out.println("\t\t" + tmp.getData());
            } else {
                System.out.print("\t\t" + tmp.getData());
            }
            printTree(tmp.getLeftChildren(), space + 1);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Random random = new Random();
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = new Node(5);
        binarySearchTree.setRoot(root);
//        binarySearchTree.insert(random.nextInt(0,10), root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
        binarySearchTree.insert(3, root);
        binarySearchTree.insert(8, root);
        binarySearchTree.insert(1, root);
        binarySearchTree.insert(4, root);
        binarySearchTree.insert(2, root);
        binarySearchTree.insert(9, root);
        binarySearchTree.insert(6, root);
        binarySearchTree.insert(7, root);
        binarySearchTree.insert(0,root);

//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
//        binarySearchTree.insert(random.nextInt(0,10),root);
        binarySearchTree.printTree(binarySearchTree.root, 1);
//        System.out.println(binarySearchTree.findMin());
        binarySearchTree.delete(5, binarySearchTree.root);
        System.out.println("--------------------------------------------");
        binarySearchTree.printTree(binarySearchTree.root, 1);

    }
}
