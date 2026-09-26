import java.util.Scanner;
class Divisible {
public static void main(String args[]) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
if((a+b)%2==0) {
System.out.println("divisible by 2");
} else {
System.out.println("not divisible");
}
}
}