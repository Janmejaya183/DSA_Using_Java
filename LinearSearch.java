// import java.util.Scanner;
// public class LinearSearch {
//     public static int Linearsearch(int numbers[],int key){
//         for(int i =0;i<numbers.length; i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the key what you want to find:");
//         int a = sc.nextInt();
//         int numbers[] ={4,7,8,9,5,6,2};
//         int index = Linearsearch(numbers,a);
//         if(index == -1){
//             System.out.println("Not Found");
//         }
//         else{
//             System.out.println("Key is at index "+index);
//         }
//     }
// }




import java.util.Scanner;
public class LinearSearch {
    public static int Linearsearch(String menu[],String item){
        for(int i =0;i<menu.length; i++){
            if(menu[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the food item what you want:");
        String item = sc.nextLine();
        String menu[] ={"Idli","Dosa","Sambar","Chatni","Samosa","Vada","Alu paratha"};
        int index = Linearsearch(menu,item);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index "+index);
        }
    }
}




