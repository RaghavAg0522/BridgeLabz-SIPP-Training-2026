public class DiscountAmountPrice {
    static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        double discount = 0.1 * fee;
        double discountFee = fee - discount;
        System.out.println(" The discount amount is INR  " + discount + " and final discounted fee is INR  " + discountFee);
    }
}
