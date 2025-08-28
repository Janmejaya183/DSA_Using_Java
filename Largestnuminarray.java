import java.util.*;
public class Largestnuminarray {
    public static int Largestelement(int arr[]){
        // int a =arr[0];
        int a =Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>a){
                a =arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of  an array;");
        for(int i=0; i<arr.length;i++){
            System.out.print("Enter the element"+(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int le = Largestelement(arr);
        System.out.println("Largest element of an array is "+le);

    }
}
