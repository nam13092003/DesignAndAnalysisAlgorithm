package hw0.exercise1;

public class Sortee {
    private Sort sortee;

    public void setSortee(Sort sortee) {
        this.sortee = sortee;
    }

    public void sort(int[] data){
        System.out.println(sortee.getName() +":");
        sortee.setCanPrint();
        sortee.setData(data);
        sortee.sort();
        System.out.println("countSwap: "+ sortee.getCountSwap());
        System.out.println("countComparisions: "+ sortee.getCountComparisions());
    }
}
