public class Totalpairs_sum_equalto_x {
    public static void main(String[] args) {
        int arr[]={1,5,7,8,9,6,3};
        int x=10;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if((arr[i]+arr[j])==x){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
