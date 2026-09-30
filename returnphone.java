public class returnphone {
    long getphone(long number)
    {
        long callnumber = number;
        return callnumber ;

    }
    public static void main(String args[]) {
        returnphone obj = new returnphone();
        long phonenumber=obj.getphone(7032038593L);
        System.out.println(phonenumber);
    }
}
