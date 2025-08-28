// public class copy_element_of_one_array_to_anotherArray_inreverseorder {
//     public static void main(String[] args) {
//         int arr[]={1,5,7,8,9,6,3};
//         int brr[]= new int[arr.length];
//         for(int i=0; i<arr.length;i++){
//             brr[i]= arr[(arr.length-1)-i];
//         }
        
//         for(int i=0; i<brr.length;i++){
//             System.out.print(brr[i]+" ");
//         }
//     }
// }

//Without using extra array
public class CopyArrayInReverseOrder {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 8, 9, 6, 3};
        int n = arr.length;

        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
