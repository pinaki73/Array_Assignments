public class second_highest_element {
    public static void main(String[] args) {
        int a;
        int arr[] = new int[]{2, 78, 45, 1, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println("The second Highest element is "+arr[1]);
    }

}


