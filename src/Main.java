public class Main {
    public static void main(String[] args) {
        int[] sales ={10, 115, 4, 4,1101};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
