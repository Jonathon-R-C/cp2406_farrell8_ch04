public class DebugBox
{
   public static class FixDebugBox {
      private int length = 1;
      private int width = 1;
      private int height = 1;

      public void showData() {
         System.out.println("Width: " + width + "  Length: " +
                 length + "  Height: " + height);
      }

      public double getVolume() {
         double vol = length * width * height;
         return vol;
      }
   }
}