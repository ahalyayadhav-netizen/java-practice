import java.util.Scanner;
class rainwater {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
String rain=scan.nextLine();
String water=scan.nextLine();
if( (rain.equals("True")) &&  (water.equals("False"))) {
System.out.print("super");
} else {
System.out.print("not super");
}
}
}