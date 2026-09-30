public class parameters {
    void display()
    {
        System.out.println("nanna");
    }
    void display(int a,int b)
    {
        System.out.println(a+b);
    }
    void display(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[]) {
        parameters obj = new parameters();
        obj.display(12,1,1);

    }
   
    
}
