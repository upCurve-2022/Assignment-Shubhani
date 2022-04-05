package challenges;

public class q03 {
    public static void main(String[] args) {
        int cost=50, discount=12;
        int costInRs = cost*75;
        int discountPrice = costInRs*discount/100;
        int sellingPrice = costInRs - discountPrice;

        double discountPriceInDollar = discountPrice/75;
        double sellingPriceInDollar = sellingPrice/75;

        System.out.println("Discount Amount: Rs."+ discountPrice);
        System.out.println("Selling Price: Rs."+ sellingPrice);
        System.out.println("Discount Amount in Dollars: $"+ discountPriceInDollar);
        System.out.println("Selling Price in Dollars: $"+ sellingPriceInDollar);
    }
}
