import java.util.*;
public class Smallestnuminarray  {
    public static int Smallestnum(int arr[]){
        // int a =arr[0];
        int a =Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<a){
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
        int le = Smallestnum(arr);
        System.out.println("Smallest element of an array is "+le);

    }
}
