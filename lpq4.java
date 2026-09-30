 class lpq4 {
    public static void main(String args[])
    {
        int evencount = 0;
        for(int i= 0; i<=10; i++) {

        
            if(i%2==0)
            {
                evencount = evencount + 1;
                System.out.println(i);
            }
        }
        System.out.println(evencount);
    }
}
