public class Arrays_on_even_position {
    public static void main(String[] args) {
        int arr[] = new int[]{4,6,8,3,5,7};
        System.out.println("The elements in even position are");
        for (int i =1; i < arr.length; i=i+2){
            System.out.println(arr[i]);
        }

    }
}
