public class Ascending_order {
    public static void main(String[] args) {
        int x;
        int arr[] = new int[]{2,78,4,65,23};
        for (int i = 0; i < arr.length; i ++){
        for (int j = i+1; j < arr.length; j++){
            if (arr[i] > arr[j]){
                x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }

    }
        System.out.println(" The elements in ascending order are ");
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}
