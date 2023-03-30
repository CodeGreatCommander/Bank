import java.util.*;
import java.io.*;
public class Main
{
    public static void main()
    {
        try
        {
            File checkers=new File("Bank_D.dat");
            if(!checkers.exists())
            Data_file.create();
            Print ob=new Print();
            Scanner sc=new Scanner(System.in);
            ob.store();
            System.out.println("Customer or Official:");
            String pro=sc.nextLine();
            if(pro.equalsIgnoreCase("customer"))
            {
                System.out.println("Enter your name:");
                String a=sc.nextLine();
                myexception.check(ob.name,a);
                basic.stringSorting(ob.acn,ob.age,ob.tam,ob.time,ob.name,ob.type,ob.phone);
                int d=Searching.main(ob.name,a);
                basic.numSorting(ob.acn,ob.inmoney,ob.age,ob.time,ob.name,ob.type,ob.phone);
                ob.acninput(d,a);
                ob.Exaggerate();
                System.out.println("Please enter your choice:");
                int flag=Integer.parseInt(sc.nextLine());
                do
                {
                    if(flag==1)
                    {
                        System.out.println("Enter person's name whose account number you want to know");
                        String z=sc.nextLine();
                        ob.acNo(z);
                    }
                    else if(flag==2)
                    {
                        System.out.println("Your Account Number:");
                        int b=Integer.parseInt(sc.nextLine());
                        ob.information(a,b,ob.tam[d]);
                    }
                    else if(flag==3)
                    {
                        System.out.println("To whom you want to create a draft:");
                        String b=sc.nextLine();
                        System.out.println("Amount you want to transact:");
                        int c=Integer.parseInt(sc.nextLine());
                        myexception.negative_exc(c);
                        if(ob.tam[d]<c+10000)
                        throw new myexception("INSUFFICIENT MONEY");
                        ob.tam[d]-=c;
                        ob.inmoney[d]-=c;
                        Draft.main(c,b,a);
                        System.out.println();
                    }
                    else if(flag==4)
                    {
                        System.out.println("Enter the amount you want to loan:");
                        int b=Integer.parseInt(sc.nextLine());
                        myexception.negative_exc(b);
                        if(b<=0.5*ob.sum)
                        {
                            System.out.println("CONGRATS!!!YOUR LOAN HAS BEEN GRANTED");
                            ob.tam[d]+=b;
                        }
                        else
                        System.out.println("SORRY YOUR LOAN CAN'T BE GRANTED DUE TO  INSUFFICIENT DEPOSITS IN BANK");
                    }
                    else if(flag==5)
                    {
                        System.out.println("To whom you want to transact:");
                        String b=sc.nextLine();
                        myexception.check(ob.name,b);
                        System.out.println("Amount you want to transact:");
                        int c=sc.nextInt();
                        sc.nextLine();
                        ob.tam[d]-=c;
                        ob.inmoney[d]-=c;
                        myexception.negative_exc(ob.tam[Searching.main(ob.name,a)]);
                        ob.tam[Searching.main(ob.name,b)]+=c;
                        ob.inmoney[Searching.main(ob.name,b)]-=c;
                    }
                    else if(flag==6)
                    {
                        System.out.println("Please explain how can we help you:");
                        String c=sc.nextLine();
                        System.out.println("We will try our BEST TO HELP YOU");
                    }
                    else
                    {
                        throw new myexception("INVALID INPUT");
                    }
                    System.out.println("Anything else:");
                    if(!sc.hasNextInt())
                    break;
                    flag=Integer.parseInt(sc.nextLine());
                }
                while(flag>0&&flag<7);
                Data_file.updater(ob);
            }
            else if("official".equalsIgnoreCase(pro))
            {
                System.out.println("Enter Password:");
                if(sc.nextLine().equals("docksiroy"))
                {
                    basic.numSorting(ob.acn,ob.inmoney,ob.age,ob.time,ob.name,ob.type,ob.phone);
                    ob.display();
                String a=sc.nextLine();
                if(a.equals("new"))
                {
                    System.out.println("Enter number of new accounts:");
                    int z=sc.nextInt();
                    sc.nextLine();
                    NewAccount.main(z,ob.num,ob);
                    Data_file.updater(ob);
                }
                else if(a.equals("newsort"))
                {
                    basic.stringSorting(ob.acn,ob.age,ob.tam,ob.time,ob.name,ob.type,ob.phone);
                    ob.display();
                }
                }
                
            }
            else
            {
                throw new myexception("INVALID INPUT");
            }
            

        }
        catch(Exception e)
        {
            System.out.println("INVALID INPUT");
        }
        
    }
}