public class Star7 {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--) // imp
        {
            for(int j=1;j<=4;j++)
            {
                if(i>=j)
                {
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
/*
o/p:

 *  *  *  *
 *  *  *
 *  *
 *

 */
