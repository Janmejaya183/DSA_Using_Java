import java.util.*;
public class second_largest_element {
    public static void main(String[] args) {
        int arr[]={1,5,7,8,9,6,3};
        int largest = arr[0];
        int second_largest_element=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest_element=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest_element){
                second_largest_element=arr[i];
            }
        }
        System.out.println(second_largest_element);
    }
}
