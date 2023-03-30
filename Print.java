import java.util.Scanner;
public class Print extends Calculate
{
    public Print()throws myexception
    {
        super();
    }
    public void display()
    {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Account number\tName\tType\t\t\tBalance");
        for(int i=0;i<num;i++)
        {
            if(type[i].equalsIgnoreCase("saving"))
            {
                System.out.println(acn[i]+"\t\t"+name[i]+"\t"+type[i]+"\t");
                System.out.println("\t\t"+tam[i]);
            }
            else
            System.out.println(acn[i]+"\t\t"+name[i]+"\t"+type[i]+"\t"+tam[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }
    protected static void mainPr()throws myexception
    {
        Print ob=new Print();
        basic.numSorting(ob.acn,ob.age,ob.inmoney,ob.time,ob.name,ob.type,ob.phone);
        ob.display();
    }
    public void Exaggerate()
    {
        System.out.println("\t\t\t\t\t\t----------\n\t\t\t\t\t\tBOIBR BANK\n\t\t\t\t\t\t----------");
        System.out.println("Welcome to INDIA'S MOST FAVOURITE PRIVATE BANK!!!\n");
        System.out.println("We can help you with:\n 1-Inquire Account Number\t\t2-Know Account details\n 3-create a draft\t\t\t4-Loan");
        System.out.println(" 5-Transfer Money\t\t\t6-Anything else");
    }
    public void acninput(int d,String a)throws myexception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account number(IF FORGOTTEN OR NOT RECEIVED ENTER \"GIVE\"):");
        String z=sc.next();
        sc.nextLine();
        if(z.equalsIgnoreCase("GIVE"))
        {
            System.out.println("Your phone number:");
            long b=Long.parseLong(sc.nextLine());
            acNo(a,b);
        }
        else if(Integer.parseInt(z)==acn[d])
        {
            return;
        }
        else
        throw new myexception("");
    }
} 