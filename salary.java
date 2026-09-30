import java.lang.System;
import java.util.Scanner;

class salary  {
    public static void main(String args[])
    {
        Scanner scan =  new Scanner(System.in);
        System.out.print("what is your salary");
        int salary = scan.nextInt();
        System.out.print("what is your age");
        int  age = scan.nextInt();
        System.out.print("how much do you want");
        int loan = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.println("get input for required loan amount");

        }else {
            System.out.println("you are not eligible for loan");
        }
        if (loan<=50000)
        {
            System.out.println("you are eligible for loan");
        }
        if (loan>50000)
        {
            System.out.println("maximun loan amount is 50000");
        }
    }
    
}
