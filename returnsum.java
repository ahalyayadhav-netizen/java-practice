public class returnsum {
    int sum(int num1,int num2)

    {
        int extra=70;
        int total=num1+num2+extra;
        return total;

    }
    public static void main(String args[])
    {
        returnsum obj = new returnsum();
        int finaltotal = obj.sum(10,20);
        System.out.println(finaltotal);

    }
    
}
