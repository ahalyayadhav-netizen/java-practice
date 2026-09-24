import java.util.Scanner;
class Logical {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
String a=scan.nextLine();
String b=scan.nextLine();
int c=scan.nextInt();
if ((a.equals(b))&& c>=70) {
System.out.print("equal");
} else {
System.out.print("not equal");
}
}
}




