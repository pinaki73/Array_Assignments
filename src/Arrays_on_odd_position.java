public class Arrays_on_odd_position {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 6, 8, 3, 5};
        System.out.println("The elements on odd position are ");
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}