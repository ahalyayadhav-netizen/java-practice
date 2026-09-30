import java.lang.System;
import java.util.Scanner;
public class laptopscanner {
     
    int num=0;
    String name="";
    String processor=""; 
    int ram=0;

    +
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
laptop nanna = new laptop();
        nanna.num=scan.nextInt();
        scan.nextLine();
        nanna.name=scan.nextLine();
        nanna.processor=scan.nextLine();
        nanna.ram=scan.nextInt();
        scan.nextLine();

        laptop alya=new laptop();
        alya.num=scan.nextInt();
        scan.nextLine();
        alya.name=scan.nextLine();
        alya.processor=scan.nextLine();
        alya.ram=scan.nextInt(); 
        System.out.println(alya.name);
        System.out.println(nanna.name);
        System.out.println(alya.num);
        System.out.println(nanna.ram);
        System.out.println("name of alya processor:" + alya.processor);


}
}

    

