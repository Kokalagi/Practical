class Unary_operatorminus

{
    public static void main(String args[])
    {
        int a=10;
        int b=10;
        System.out.println(a++); //increamenting by 1 postfix  10 (11)
        System.out.println(++a); //increamenting by 1 prefix    12
        System.out.println(a--); //decrementing by 1 postfix    12 (11)
        System.out.println(--a); //decrementing by 1 prefix     10
        
        System.out.println((a++) + (++b)); //10   11  
        System.out.println(++a + a++);
        System.out.println(b++ + ++a);
        
        System.out.println("Next One");
        
        int c=10;
        int d=10;
        System.out.println((c--) + (--d)); //10   11  
        System.out.println(--c + c--);
        System.out.println(c-- + --d);
        
        
        
    }
}