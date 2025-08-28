import java.util.*;
public class BuyingStack {
    public static int FindMaxProfite(int price[]){
        int buyingPrice=Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0; i<price.length;i++){
            int sellingPrice =price[i];
            if(buyingPrice<sellingPrice){
                int profit = sellingPrice-buyingPrice;
                if(profit>Maxprofit){
                    Maxprofit = profit;
                }
            }else{
                buyingPrice = sellingPrice;
            }
        }
        return Maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(FindMaxProfite(price));
    }
}
