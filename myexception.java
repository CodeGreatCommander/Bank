public class myexception  extends Exception
{
    public myexception(String a)
    {
        super(a);
    }
    public static void negative_exc(int n)throws myexception
    {
        if(n<0)
        throw new myexception("Data cannot be negative"); 
    }
    public static void negative_exc(double n)throws myexception
    {
        if(n<0)
        throw new myexception("Data cannot be negative"); 
    }
    public static void words_only(String str)throws myexception
    {
        char ch;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                throw new myexception("Data cannot have numbers");
            }
        }
    }
    public static void age(int n)throws myexception
    {
        if(n<18)
        throw new myexception("Too young exception"); 
    }
    public static void check(String a[],String b)throws myexception
    {
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equalsIgnoreCase(b))
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
        throw new myexception("NOT PRESENT");
    }
}