import java.util.*;
public class NewAccount
{
    public static void main(int count,int num,Print ob) throws myexception
    {
        Scanner sc=new Scanner(System.in);
        num=num+count;
        String named[]=ob.name;
        ob.name=new String[num];
        int acnd[]=ob.acn;
        ob.acn=new int[num];
        double tamd[]=ob.tam;
        ob.tam=new double[num];
        int moneyd[]=ob.inmoney;
        ob.inmoney=new int[num];
        int aged[]=ob.age;
        ob.age=new int[num];
        int timed[]=ob.time;
        ob.time=new int[num];
        String typed[]=ob.type;
        ob.type=new String[num];
        long phoned[]=ob.phone;
        ob.phone=new long[num];
        int i=0;
        for( i=0;i<num-count;i++)
        {
            ob.name[i]=named[i];
            ob.acn[i]=acnd[i];
            ob.tam[i]=tamd[i];
            ob.inmoney[i]=moneyd[i];
            ob.age[i]=aged[i];
            ob.type[i]=typed[i];
            ob.phone[i]=phoned[i];
        }
        while(i<num)
        {System.out.println("Customer "+(i+1)+"\nEnter customer\'s name(omit use of numbers and shortforms):");
        ob.name[i]=sc.nextLine();
        myexception.words_only(ob.name[i]);
        System.out.println("Enter age:");
        ob.age[i]=sc.nextInt();
        sc.nextLine();
        myexception.age(ob.age[i]);
        System.out.println("Enter your mobile number(avoid country code):");
        ob.phone[i]=sc.nextLong();
        sc.nextLine();
        if(!(ob.phone[i]>=1000000000l&&ob.phone[i]<10000000000l))
        throw new myexception("INVALID PHONE NUMBER");
        System.out.println("Enter type of account:");
        ob.type[i]=sc.nextLine();
        myexception.words_only(ob.type[i]);
        while(!(ob.type[i].equalsIgnoreCase("savings")||ob.type[i].equalsIgnoreCase("fix deposit")||ob.type[i].equalsIgnoreCase("recurring deposit")))
        {
            if("savings".startsWith(ob.type[i]))
            {
                System.out.println("Did you mean Savings account:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    ob.type[i]="savings";
                    else
                    {System.out.println("So please re-enter type of account:");
                    ob.type[i]=sc.nextLine();}
                }
                else if("fix deposit".startsWith(ob.type[i]))
                {
                    System.out.println("Did you mean Fix Deposit:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    ob.type[i]="fix deposit";
                    else
                    {System.out.println("So please re-enter type of account:");
                    ob.type[i]=sc.nextLine();}
                }
                else if("recurring deposit".startsWith(ob.type[i]))
                {
                    System.out.println("Did you mean Recurring Deposit:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    ob.type[i]="recurring deposit";
                    else
                    {System.out.println("So please re-enter type of account:");
                    ob.type[i]=sc.nextLine();}
                }
                else
                {
                    System.out.println("IT DIDN'T MATCH ANY OF THE MATCHING CASES\n So please re-enter type of account:");
                    ob.type[i]=sc.nextLine();
                }
            }
        System.out.println("Enter amount of money deposited:");
        ob.inmoney[i]=sc.nextInt();
        sc.nextLine();
        myexception.negative_exc(ob.inmoney[i]);
        System.out.println("Enter time period:");
        ob.time[i]=sc.nextInt();
        sc.nextLine();
        myexception.negative_exc(ob.time[i]);
        ob.acn[i]=(int)(Math.random()*10000000);
        ob.tam[i]=calc(ob.inmoney[i],ob.type[i],ob.time[i]);
        i++;
        }
        System.out.println("Account number\tName\tType\t\t\tBalance");
        for(i=0;i<num;i++)
        {
            if(ob.type[i].equalsIgnoreCase("savings"))
            System.out.println(ob.acn[i]+"\t\t"+ob.name[i]+"\t"+ob.type[i]+"\t\t\t"+ob.tam[i]);
            else
            System.out.println(ob.acn[i]+"\t\t"+ob.name[i]+"\t"+ob.type[i]+"\t\t"+ob.tam[i]);
        }
    }
    public static double calc(int inmoney,String type,int time)
    {
        if(type.equalsIgnoreCase("savings"))
        {
            return(inmoney*Math.pow(1+(7/100.0),time));
        }
        else if(type.equalsIgnoreCase("fix deposit"))
        {
            return(inmoney*Math.pow(1+(11/100.0),time));
        }
        else if(type.equalsIgnoreCase("recurring deposit"))
        {
            return(inmoney*time*12.0+inmoney*time*12*(time*12+1)*5.0/2400.0);
        }
        else
        return 0;
    }
}