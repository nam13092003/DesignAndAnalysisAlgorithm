package hw1.exercise3;

public class Node {
    private int data;
    private Node parent;
    private Node leftChildren;
    private Node rightChildren;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getParent() {
        return parent;
    }

    public Node getLeftChildren() {
        return leftChildren;
    }

    public Node getRightChildren() {
        return rightChildren;
    }

    public boolean hasRight() {
        return rightChildren != null;
    }

    public boolean hasLeft() {
        return leftChildren != null;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeftChildren(Node leftChildren) {
        this.leftChildren = leftChildren;
    }

    public void setRightChildren(Node rightChildren) {
        this.rightChildren = rightChildren;
    }
}

