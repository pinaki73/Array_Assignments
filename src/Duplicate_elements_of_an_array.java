public class Duplicate_elements_of_an_array {
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,6,7,4,4,3,7,3,6,2};
        System.out.println("The duplicate nos in this array are");
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
                }

            }
        }

    }

