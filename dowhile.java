import java.lang.System;
import java.util.Scanner;
class dowhile {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
     int a=0;
        do {
            System.out.println("enter the number: ");
             a=scan.nextInt();
            }while(a<=10);
            System.out.println("number that is greater than 10: " +  a);




            
        }
          
}
