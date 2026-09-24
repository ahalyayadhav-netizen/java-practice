import java.util.Scanner;
class Comparision {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
int a=scan.nextInt();
if (a<=30) {
System.out.print("ok");
} else if (a<=50) {
System.out.print("good");
} else if (a<=80) {
System.out.print("better");
} else if (a<=90) {
System.out.print("excellent");
} else {
System.out.print("invalid");
}


}
}