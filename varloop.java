import java.lang.System;

public class varloop {
    public static void main(String args[]){
        String num[] = { "apple","ball","cat","dog"};
        for ( int i=0;i<4;i++) 
            {
            System.out.println(num[i]);
        }
        for (String var: num)
        {
            System.out.print(var);
        }
    }
    
}
