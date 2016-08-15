// This class discounts prices by 10%
public class DebugFour4
{
   public static void main(String args[])
   {
      final double DISCOUNT_RATE = 0.90;
      int price = 100;
      double price2 = 100.00;
      tenPercentOffint(price, DISCOUNT_RATE);
      tenPercentOffdouble(price2, DISCOUNT_RATE);
   }
   public static void tenPercentOffint(int p, double DISCOUNT_RATE)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off " + p);
      System.out.println("New price is " + newPrice);
   }
   public static void tenPercentOffdouble(double p, double DISCOUNT_RATE)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off " + p);
      System.out.println("New price is " + newPrice);
   }
}
