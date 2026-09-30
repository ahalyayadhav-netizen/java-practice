public class gardenfunc {
    int apple_price=20;
    int apple_count=5;
    void total_money()
    {
        System.out.println(" apple_price*apple_count " + apple_price*apple_count);
    }
    public static void main(String args[])
    {
        gardenfunc obj = new gardenfunc();
        obj.total_money();
    }
    
}
