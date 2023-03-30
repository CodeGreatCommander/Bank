public class basic
{
    //it converts number to text
    static String a[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen",
    "sixteen","seventeen","eighteen","nineteen"},b[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"}
    ,c[]={"hundred","thousand","lakh","crore","arab"};
    public static void numSorting(int a[],int b[],int c[],int d[],String e[],String f[],long g[])
    {
        int small,pos,u;
        String z;
        long q;
        for(int i=0;i<a.length-1;i++)
        {
            small=a[i];
            pos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<small)
                {
                    small=a[j];
                    pos=j;
                }
            }
            u=a[i];
            a[i]=a[pos];
            a[pos]=u;
            u=b[i];
            b[i]=b[pos];
            b[pos]=u;
            u=c[i];
            c[i]=c[pos];
            c[pos]=u;
            u=d[i];
            d[i]=d[pos];
            d[pos]=u;
            z=e[i];
            e[i]=e[pos];
            e[pos]=z;
            z=f[i];
            f[i]=f[pos];
            f[pos]=z;
            q=g[i];
            g[i]=g[pos];
            g[pos]=q;
        }
    }
    public static void stringSorting(int a[],int b[],double c[],int d[],String e[],String f[],long g[])
    {
        int pos,u;
        String z,small;
        long q;
        for(int i=0;i<e.length-1;i++)
        {
            small=e[i];
            pos=i;
            for(int j=i+1;j<e.length;j++)
            {
                if(e[j].compareTo(small)<0)
                {
                    small=e[j];
                    pos=j;
                }
            }
            u=a[i];
            a[i]=a[pos];
            a[pos]=u;
            u=b[i];
            b[i]=b[pos];
            b[pos]=u;
            double U=c[i];
            c[i]=c[pos];
            c[pos]=U;
            u=d[i];
            d[i]=d[pos];
            d[pos]=u;
            z=e[i];
            e[i]=e[pos];
            e[pos]=z;
            z=f[i];
            f[i]=f[pos];
            f[pos]=z;
            q=g[i];
            g[i]=g[pos];
            g[pos]=q;
        }
    }
    public static String abc(int d)//used with convertor
    {
        if(d==0)
        return("");
        else if(d<20)
        return(a[d-1]);
        else if(d%10==0)
        return(b[d/10-2]);
        else
        return(b[d/10-2]+" "+a[d%10-1]);
    }
    public static void convertor(int n)
    {
        String d=String.valueOf(n);
        int l=d.length(),e=n%1000,f;
        n/=1000;
        String g=String.valueOf(e);
        if(l>0)
        {
        for(int i=0;l>3;i+=1)
        {
          f=Integer.parseInt(d.substring(i,i+2));
          if(f!=0)
          {if(l%2==0)
          {System.out.print(abc(f/10)+" "+c[l/2-1]+" ");
          l--;
          }
          else
          {
              System.out.print(abc(f)+" "+c[(l-1)/2-1]+" ");
              l-=2;
              
          }
          }
        }
        }
        if(g.charAt(0)!='0')
        {
            f=Integer.parseInt(String.valueOf(g.charAt(0)));
            System.out.print(a[f-1]+" hundred ");
        }
        if(g.length()>=2&&g.charAt(1)!='0')
        {
            f=Integer.parseInt(String.valueOf(g.charAt(1)));
            System.out.print(b[f-2]+" ");
        }
        if(g.length()==3&&g.charAt(2)!='0')
        {
            f=Integer.parseInt(String.valueOf(g.charAt(2)));
            System.out.println(a[f-1]);
        }
    }
    public static void checkDateFor(String a)throws myexception
    {
        boolean b=false;
        int m=0,d=0,y=0;
        try
        {   
            m=Integer.parseInt(a.substring(3,5));
            d=Integer.parseInt(a.substring(0,2));
            y=Integer.parseInt(a.substring(6));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Unable to process data because of wrong format");
        }
        if(m<=12&&a.length()==10&&a.charAt(2)=='/'&&a.charAt(5)=='/')
        {
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
            {
                if(d<=31)
                b=true;
            }
            if(m==2||m==4||m==6||m==9||m==11)
            {
                if(d<=30)
                b=true;
            }
        }
        if(b==false)
        throw new myexception("");
    }
}