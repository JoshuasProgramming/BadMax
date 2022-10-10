public class Main {
    public static void main(String[] args) {
        
        BadMax bm = new BadMax();

        int arr[] = {34,54,23,44,5,6,12};

        System.out.println(bm.max(arr));
        System.out.println("Ordered array: " + bm.orderedArray(15));
        System.out.println("Reverse array: " + BadMax.reverseArray(15));

        System.out.println("Modified BadMax on inputted: " + bm.modifiedBadMax(arr, 0));

        System.out.println("Modified BadMax on Random Array (largest value in array above): " + bm.modifiedBadMax(bm.randomArray(5), 0));

    }
}
