public class Star8 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=1;j--) // imp
            {
                if(i>=j) // imp
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
o/p:

   *
  **
 ***
****

 */
