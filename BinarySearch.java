import java.util.*;
public class BinarySearch {
    public static int findelement(int arr[],int key){
        int start =0;
        int end=(arr.length)-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
                
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key element which you want to search in an array:");
        int key = sc.nextInt();
        int arr[] ={2,4,6,8,10,12,14};
        int index = findelement(arr, key);
        if(index == -1){
            System.out.println("Key is nut found");
        }
        else{
            System.out.println(key+" is present at index "+index);
        }
    }
}
