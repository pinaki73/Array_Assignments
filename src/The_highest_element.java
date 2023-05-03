public class The_highest_element {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 67, 87, 5, 90};
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum)
                maximum = arr[i];
        }
        System.out.println("the highest element is " + maximum);
    }
}
