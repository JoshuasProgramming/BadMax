public class Main {
    public static void main(String[] args) {
        
        BadMax bm = new BadMax();

        int arr[] = {34,54,23,44,5,6,12};

        System.out.println(bm.max(arr));
        System.out.println(bm.orderedArray(15));
        System.out.println(bm.reverseArray(15));

    }
}
