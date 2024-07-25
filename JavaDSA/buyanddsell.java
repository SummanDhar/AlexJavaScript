public class buyanddsell {
    public static int BestTimeToBuyAndSellStock(int[] price){
        //method1
        // int buy = price[0];
        // int profit = 0;

        // for(int i =0 ; i<price.length; i++){
        //     if(price[i] < buy){
        //         buy = price[i];
        //     }else if(price[i] - buy > profit){
        //         profit = price[i] - buy;
        //     }
        // }
        // return profit;


        //method2
        int profit = 0;
        for(int i = 1 ; i<price.length;i++){
            if(price[i] > price[i-1]){
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.print(BestTimeToBuyAndSellStock(price));
        System.out.println();
    }

}
