import java.lang.System;
import java.util.Random;
class whileloop {
    public static void main(String args[])
    {
        Random rand = new Random();
       // newnum=0 for initialization
        int newnum=0;

    while(newnum!=19){
        newnum = rand.nextInt(20);
        System.out.println(newnum);
}
    }
    
}
