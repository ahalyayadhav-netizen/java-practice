public class chocolatepara {
    void getchocolate(int money)
    {
        System.out.println(money);
        System.out.println("chocolate purchased");
    }
    void getpowder(int money)
    {
        System.out.println(money);
        System.out.println("powder purchased");
    }
    public static void main(String args[])
    {
        chocolatepara obj = new chocolatepara();
        obj.getchocolate(50);
        obj.getpowder(100);
    }
}
