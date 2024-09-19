public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 99.22;
        double salesTax = 4.961;
        final double TAX_RATE = .05;

        salesTax = purchasePrice * TAX_RATE;

        System.out.println("The sales tax on a purchase of" + purchasePrice + " is " + salesTax);

    }
}