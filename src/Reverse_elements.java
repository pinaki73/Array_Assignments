public class Reverse_elements {
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,6,3,7,4};
        System.out.println("The elements in reverse order are so ");
        for(int i= arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
