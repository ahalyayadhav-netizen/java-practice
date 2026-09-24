import java.util.Scanner;
class Remainder {
public static void main(String args[]) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter num1:");
int a = scan.nextInt();
System.out.println("Enter num2:");
int b = scan.nextInt();
int c=a+b;
int d= c/2;
int rem= c%2;
System.out.println("addition of 2 numbers:"+c);
System.out.println(" quotient of this:"+d);
System.out.println("remainder:"+ rem);
}
}


