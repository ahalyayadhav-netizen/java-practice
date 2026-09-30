import java.lang.System;
import java.util.Scanner;
class avg {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
          int b = scan.nextInt();
            int c = scan.nextInt();
              int d = scan.nextInt();
                int e = scan.nextInt();
                int y = (a+b+c+d+e/5);
                if(y<35)
                {
                    System.out.print("additional class is required");
                }
                else {
                    System.out.print("you are good to go");
                }
    }

}