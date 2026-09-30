public class laptop {
    int num=0;
    String name="";
    String processor="";
    int ram=0;
    public static void main(String args[]){
        laptop nanna=new laptop();
        nanna.num=1;
        nanna.name="buji";
        nanna.processor="maa";
        nanna.ram=250;

        laptop alya=new laptop();
        alya.num=2;
        alya.name="mani";
        alya.processor="podugu";
        alya.ram=150;
        System.out.println(alya.name);
        System.out.println(nanna.name);
        System.out.println(alya.num);
        System.out.println(nanna.ram);
        System.out.println(alya.processor);

}
    
}
