public class PalindromicArray {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 9, 8, 7};  // test array
        boolean isPalindrome = true;
        int i=0;
        int j= arr.length-1;
            while(i<j){  // only check half
            if(arr[i] != arr[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome){
            System.out.println("Array is palindromic array");
        } else {
            System.out.println("Array is not palindromic array");
        }
    }
}
