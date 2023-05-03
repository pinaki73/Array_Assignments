public class The_smallest_element {
    public static void main(String[] args) {
        int arr[] = new int[]{4,67,45,3,8,9};
        int minimum = arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i] < minimum)
                minimum=arr[i];
        }
        System.out.println("The smallest element is "+minimum);
    }
}
