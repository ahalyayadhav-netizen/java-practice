import java.util.Scanner;
import java.util.Stack;
public class main {
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);
        Stack<Integer>Stack = new Stack<>();
        int q = sc.nextInt();
        for(int i=0;i<=q;i++) {
            String Operations=sc.next();
            switch(Operations) {
                 case"ENTER":
                    int token = sc.nextInt();
                    Stack.push(token);
                break;
                 case"EXIT":
                    if(!Stack.isEmpty()){
                        System.out.println(Stack.pop());
                 }else{
                        System.out.println(" Stack underflow");
                }
                 break;
                 case"PEEK
                 
            ":
                    if(!Stack.isEmpty()){
                         System.out.print(Stack.peek());

                    }else{
                         System.out.print("Stack Empty");
                    }
                    break;
                 case "DISPLAY":
                        if(!Stack.isEmpty()) {
                        for(int j = Stack.size()-1;j>=0;j--) {
                             System.out.print(Stack.get(j) + " ");
                        }
                        System.out.println();
                        }else{
                            System.out.print("Stack Empty");
                        }
                        break;
                 default:
                        System.out.println("invalid Operation");
                    }
                }
                sc.close();
            }
        }



