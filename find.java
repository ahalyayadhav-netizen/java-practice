//  public class find {
//     void evenorodd (int num)
//     {
//          int number= num;
//         if (number%2==0) {
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//         }
//  public static void main(String args[])
//     {
//         find obj = new find();
//           obj.evenorodd(2500);
         
//     }
//  }
import java.lang.System;
import java.util.Scanner;

  public class find {
    void evenorodd (int num)
    {
         int number= num;
        if (number%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        }
 public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        find obj = new find();
          obj.evenorodd(num);
         
    }
 }
