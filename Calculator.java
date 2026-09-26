import java.util.Scanner;
class Calculator {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter a:");
int a = scan.nextInt();
System.out.print("Enter b:");
int b = scan.nextInt();
scan.nextLine();
System.out.print("Enter the operand:");
String operand=scan.next();
if(operand.equals("+")) {
System.out.println(a+b);
} else if(operand.equals("-")) {
System.out.println(a-b);
} else if(operand.equals("*")){
System.out.println(a*b); 
} else if (operand.equals("%")) {
System.out.println(a%b);
} else {
System.out.println(a/b);
}  
}
}




