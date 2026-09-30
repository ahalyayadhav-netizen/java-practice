public class returnexample {
    String getname(String name)
    {
        String extraname= "devarala";
        String fullname = extraname  +    name;
        return fullname;

    }
    String nannaname(String namdo)
    {
        return "Manikanta";
    }
    public static void main(String args[])
    {
        returnexample obj = new returnexample();
         String peru=obj.getname("ahalya");
        System.out.println(peru);
        String namdon=obj.nannaname("alya");
        System.out.println(namdon);
    }

    
}
