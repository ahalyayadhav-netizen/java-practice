
import java.lang.System;
import java.util.Scanner;
class Arq3 {
    public static void main(String args[])
     {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[10];
        for(int i=0;i<=9;i++)
        {
            marks[i]=scan.nextInt();
        }
        for(int i=0;i<=9;i++)
        {
            System.out.println(marks[i]);
        }
       
        
    }


    
}
