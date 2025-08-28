public class Difference_bw_odd_and_even_index {
    public static void main(String[] args) {
        int arr[]={1,5,7,8,9,6,3};
        int evensum=0;
        int oddsum =0;
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                evensum = evensum+arr[i];
            }else{
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println(oddsum-evensum);
    }
}

