

// code1
// public class returnco12 {
//     int get_soap(int money)
// {
//     return 100;

// }
// public static void main(String args[])
// {
//     returnco12 obj = new returnco12();
//     int remainder  = obj.get_soap(20);
//     System.out.println(remainder);
// }
// }
 
//code 2
public class returnco12 {
    int get_soap(int money) 
    {
        int soap_price=20;
        int rem=money-soap_price;
        return rem;

    }
    public static void main(String args[])
    {
        returnco12 obj = new returnco12();
        int remainder = obj.get_soap(33);
        System.out.println(remainder);
    }


}