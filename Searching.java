public class Searching extends basic 
{
    int l,u,m,pos;
    public Searching()
    {
        l=0;
        m=0;
        u=0;
        pos=-1;
    }
    public int imp(String a[],String n)
    {
        boolean lolin=false,uplin=false,bin=false;
        u=a.length;
        while(!(lolin||uplin||bin)&&u>=l)
        {
            bin=Binary(a,n);
            uplin=upperlimit(a,n);
            lolin=lowerlimit(a,n);
        }
        return pos;
    }
    public boolean Binary(String a[],String n)
    {
        m=(u+l)/2;
        if(a[m].equals(n))
        {pos=m;return true;}
        else if(a[m].compareTo(n)<0)
        {
            l=m+1;
            return false;
        }
        else
        {
            u=m-1;
            return false;
        }
    }
    public boolean lowerlimit(String a[],String n)
    {
        boolean z=false;
        for(int i=l;i<l+5;i++)
        {
            if(a[i].equals(n))
            {
                pos=i;
                z=true;
                break;
            }
        }
        return z;
    }
    public boolean upperlimit(String a[],String n)
    {
        boolean z=false;
        for(int i=u-1;i>u-5;i--)
        {
            try
            {
            if(a[i].equalsIgnoreCase(n))
            {
                pos=i;
                z=true;
                break;
            }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
            System.out.println("Name not found");
            }
        }
        return z;
    }
    public static int main(String a[],String n)
    {
        Searching ob=new Searching();
        return(ob.imp(a,n));
    }
}