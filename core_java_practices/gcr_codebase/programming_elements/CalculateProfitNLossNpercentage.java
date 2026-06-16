public class CalculateProfitNLossNpercentage {
    static void main(String[] args) {
        int cost_price = 129;
        int selling_price = 191;
        double profit = selling_price-cost_price;
        double profiitPercent=(profit/cost_price)*100;
        System.out.println("The Cost Price is INR  "+cost_price +"and Selling Price is INR "+selling_price);
        System.out.println("The Profit is INR "+ profit+" and the Profit Percentage is "+profiitPercent);
    }
}
