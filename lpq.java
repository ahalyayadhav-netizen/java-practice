import java.lang.System;
import java.util.Scanner;
class lpq {
    public static void main(String args[])
    {

    
    Scanner scan = new Scanner(System.in);
    System.out.println("number1");
    int a = scan.nextInt();
    System.out.println("number 2");
    int b = scan.nextInt();
    for( int i=a; i>=b; i--) {
        System.out.println(i);

    }

    }
}


