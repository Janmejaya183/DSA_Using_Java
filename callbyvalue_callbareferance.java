public class callbyvalue_callbareferance {
    public static void update(int arr[],int n){
        n=10;
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] ={56,78,96};
        int n=5;
        update(marks, n);
        System.out.println(n);
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
