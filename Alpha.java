import java.util.Scanner;
class Alpha {
public static void main(String args[]) {
int num1=20;
int num2=15;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the alpha:");
String alpha=scan.nextLine();
if(alpha.equals("a")) {
System.out.println(num1 + alpha + num2 + "=" + (num1+num2));
} else if(alpha.equals("s")) {
System.out.println(num1 + alpha + num2 + "=" + (num1-num2));
} else if(alpha.equals("m")) {
System.out.println(num1 + alpha + num2 + "=" + (num1*num2));
} else if(alpha.equals("d")) {
System.out.println(num1 + alpha + num2 + "=" + (num1/num2));
} else if(alpha.equals("u")) {
System.out.println(num1 + alpha + num2 + "=" + (num1%num2));
} else {
System.out.println("invalid");
}
}
}


