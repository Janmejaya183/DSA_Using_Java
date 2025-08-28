//Brute force method

// import java.util.*;

// public class MaxSubArraySum {
//     public static void main(String[] args){
//         int arr[]={1,5,-3,2,-4};
//         int sum =Integer.MIN_VALUE;
        
//         for(int i=0; i<arr.length;i++){
//             for(int j=i; j<arr.length;j++){
//                 int newsum=0;
//                 for(int k =i; k<=j; k++){
//                     System.out.print(arr[k]+" ");
//                     newsum =newsum+arr[k];

//                 }
//                 if(sum<newsum){
//                     sum=newsum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println(sum);
//     }
// }


// Time complexity = O(n^3);

// method-2 Prefix Array method
import java.util.*;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1, 5, -3, 2, -4};

        int sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // Calculate prefix sum
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Find max subarray sum using prefix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum;
                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }
                if (currentSum > sum) {
                    sum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum: " + sum);
    }
}

// m1thod-3 Kadanes lgorithm;

public class MaxSubArraySum{
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int sum = Integer.MIN_VALUE;
        int currentsum =0;
        for(int i=0; i<arr.length; i++){
            currentsum = currentsum+arr[i];
            if(currentsum<0){
            currentsum =0;
        }
        if(currentsum>sum){
            sum=currentsum;
        }
        }
        System.out.println(sum);
    }
    
}


// kadanse algorith give 0 when all the element in an array is negative;
// special case
// public class MaxSubArraySum{
//     public static void main(String[] args) {
//         int arr[]={-2,-3,-4,-1,-2,-1,-5,-3};
//         int sum = Integer.MIN_VALUE;
//         int small = Integer.MIN_VALUE;
//         int currentsum =0;
//         for(int i=0; i<arr.length; i++){
//             currentsum = currentsum+arr[i];
//             if(arr[i]>small){
//                 small=arr[i];
//             }
//             if(currentsum<0){
//             currentsum =0;
//         }
//         if(currentsum>sum){
//             sum=currentsum;
//         }
//         }
//         if(small<0){
//             System.out.println(small);
//         }else{
//             System.out.println(sum);
//         }
        
//     }
    
// }
