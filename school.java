import java.lang.System;
import java.util.Scanner;

public class school {
    String passorfail (int  marks)
    {
        if(marks>=35) {
            return "pass";
            
        } else {
            return "fail";
        }

    }
public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    int marks = scan.nextInt();
    school obj = new school();
     String result=obj.passorfail(marks);
     System.out.println(result);
}
           
}
       //code 2
// public class school {
//     void passorfail(int num)
//     {
//         if(num>=35) {
//             System.out.println("pass");
//         } else {
//             System.out.println("fail");
//         }

//     }
//     public static void main(String args[]) {
//         school obj = new school();
//         obj.passorfail(4);
//     }
// }
      //  code 3
    //   public class school {
    //     String passorfail (int score)
    //     {
    //         return "pass";
    //     }
    //     public static void main(String args[])
    //     {
    //         school obj = new school();
    //         String totalscore =  obj.passorfail(22);
    //         System.out.println(totalscore);
    //     }
    //   }