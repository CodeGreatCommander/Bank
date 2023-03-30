public class Calculate extends Input 
{
    static double tam[],sum;
    public Calculate()throws myexception
    {
        super();
        tam=new double[num];
        sum=0;
    }
    public void store()
    {
        for(int i=0;i<num;i++)
        {
            if(type[i].equalsIgnoreCase("savings"))
            {
                tam[i]=inmoney[i]*Math.pow(1+(7/100.0),time[i]);
            }
            else if(type[i].equalsIgnoreCase("fix deposit"))
            {
                tam[i]=inmoney[i]*Math.pow(1+(11/100.0),time[i]);
            }
            else if(type[i].equalsIgnoreCase("recurring deposit"))
            {
                tam[i]=inmoney[i]*time[i]*12.0+inmoney[i]*time[i]*12*(time[i]*12+1)*5.0/2400.0;
            }
            sum+=tam[i];
        }
    }
    public void acNo(String a,long b)throws myexception
    {
        boolean flag=false;
        int i=0;
        OUTER_LOOP:
        for(i=0;i<num;i++)
        {
            if(name[i].equalsIgnoreCase(a))
            {
                flag=true;
                break OUTER_LOOP;
            }
        }
        if(flag==true&&phone[i]!=b)
        throw new myexception("wrong details");
        else if(flag==false)
        throw new myexception("name not found");
        System.out.println("Account number="+acn[i]);
    }
    public void acNo(String a)throws myexception
    {
        boolean flag=false;
        int i=0;
        OUTER_LOOP:
        for(i=0;i<num;i++)
        {
            if(name[i].equalsIgnoreCase(a))
            {
                flag=true;
                break OUTER_LOOP;
            }
        }
        System.out.println("Account number="+acn[i]);
    }
    public void information(String a,int b,double tam)throws myexception
    {
        boolean flag=false;
        int i=0;
        OUTER_LOOP:
        for(i=0;i<num;i++)
        {
            if(name[i].equalsIgnoreCase(a))
            {
                flag=true;
                break OUTER_LOOP;
            }
        }
        if(flag==true&&acn[i]!=b)
        throw new myexception("name not found");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Name:"+name[i]+"\nAccount Number:"+b+"\nCurrent Balance:"+tam);
        System.out.println("--------------------------------------------------------------------------------------");
    }
    protected static void mainCal()throws myexception
    {
        Calculate ob=new Calculate();
        ob.store();
    }
}