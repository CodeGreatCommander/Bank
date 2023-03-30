import java.io.*;
import java.util.*; 
public class Data_file
{
    public static void create()throws myexception
    {
        try
        {
        Scanner sc=new Scanner(System.in);
        Calendar ob=Calendar.getInstance();
        FileOutputStream a=new FileOutputStream("Bank_D.dat");
        DataOutputStream dos=new DataOutputStream(a);
        int i=0;
        while(sc.nextLine().equals(""))
        {
            System.out.println("Customer "+(i+1)+"\nEnter customer\'s name(omit use of numbers and shortforms):");
            String name=sc.nextLine();
            myexception.words_only(name);
            dos.writeUTF(name);
            System.out.println("Enter age:");
            int age=sc.nextInt();
            sc.nextLine();
            myexception.age(age);
            dos.writeInt(age);
            System.out.println("Enter your mobile number(avoid country code):");
            Long phone=sc.nextLong();
            sc.nextLine();
            if(!(phone>=1000000000l&&phone<10000000000l))
            throw new myexception("INVALID PHONE NUMBER");
            dos.writeLong(phone);
            System.out.println("Enter type of account:");
            String type=sc.nextLine();
            myexception.words_only(type);
            while(!(type.equalsIgnoreCase("savings")||type.equalsIgnoreCase("fix deposit")||type.equalsIgnoreCase("recurring deposit")))
            {
                if("savings".startsWith(type))
                {
                    System.out.println("Did you mean Savings account:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    type="savings";
                    else
                    {System.out.println("So please re-enter type of account:");
                    type=sc.nextLine();}
                }
                else if("fix deposit".startsWith(type))
                {
                    System.out.println("Did you mean Fix Deposit:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    type="fix deposit";
                    else
                    {System.out.println("So please re-enter type of account:");
                    type=sc.nextLine();}
                }
                else if("recurring deposit".startsWith(type))
                {
                    System.out.println("Did you mean Recurring Deposit:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    type="recurring deposit";
                    else
                    {System.out.println("So please re-enter type of account:");
                    type=sc.nextLine();}
                }
                else
                {
                    System.out.println("IT DIDN'T MATCH ANY OF THE MATCHING CASES\n So please re-enter type of account:");
                    type=sc.nextLine();
                }
            }
            dos.writeUTF(type);
            System.out.println("Enter amount of money deposited:");
            int inmoney=sc.nextInt();
            sc.nextLine();
            myexception.negative_exc(inmoney);
            dos.writeDouble(inmoney);
            System.out.println("Enter date on which account was created(Format:DD/MM/YYYY):"); 
            String date=sc.next();
            basic.checkDateFor(date);
            int time=ob.get(Calendar.YEAR)-(Integer.parseInt(date.substring(1+date.lastIndexOf('/')))+1);
            myexception.negative_exc(time);
            dos.writeInt(time);
            dos.writeInt((int)(Math.random()*10000000));
            i++;sc.nextLine();
        }
        dos.close();
        }
        catch(Exception e)
        {
           File b=new File("Bank_D.dat");
           b.delete();
        }
    }
    public void append()throws myexception
    {
        try
        {
        Scanner sc=new Scanner(System.in);
        Calendar ob=Calendar.getInstance();
        FileOutputStream a=new FileOutputStream("Bank_D.dat",true);
        DataOutputStream dos=new DataOutputStream(a);
        int i=0;
        while(sc.nextLine().equals(""))
        {
            System.out.println("Customer "+(i+1)+"\nEnter customer\'s name(omit use of numbers and shortforms):");
            String name=sc.nextLine();
            myexception.words_only(name);
            dos.writeUTF(name);
            System.out.println("Enter age:");
            int age=sc.nextInt();
            sc.nextLine();
            myexception.age(age);
            dos.writeInt(age);
            System.out.println("Enter your mobile number(avoid country code):");
            Long phone=sc.nextLong();
            sc.nextLine();
            if(!(phone>=1000000000l&&phone<10000000000l))
            throw new myexception("INVALID PHONE NUMBER");
            dos.writeLong(phone);
            System.out.println("Enter type of account:");
            String type=sc.nextLine();
            myexception.words_only(type);
            while(!(type.equalsIgnoreCase("savings")||type.equalsIgnoreCase("fix deposit")||type.equalsIgnoreCase("recurring deposit")))
            {
                if("savings".startsWith(type))
                {
                    System.out.println("Did you mean Savings account:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    type="savings";
                    else
                    {System.out.println("So please re-enter type of account:");
                    type=sc.nextLine();}
                }
                else if("fix deposit".startsWith(type))
                {
                    System.out.println("Did you mean Fix Deposit:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    type="fix deposit";
                    else
                    {System.out.println("So please re-enter type of account:");
                    type=sc.nextLine();}
                }
                else if("recurring deposit".startsWith(type))
                {
                    System.out.println("Did you mean Recurring Deposit:");
                    if(sc.nextLine().equalsIgnoreCase("yes"))
                    type="recurring deposit";
                    else
                    {System.out.println("So please re-enter type of account:");
                    type=sc.nextLine();}
                }
                else
                {
                    System.out.println("IT DIDN'T MATCH ANY OF THE MATCHING CASES\n So please re-enter type of account:");
                    type=sc.nextLine();
                }
            }
            dos.writeUTF(type);
            System.out.println("Enter amount of money deposited:");
            int inmoney=sc.nextInt();
            sc.nextLine();
            myexception.negative_exc(inmoney);
            dos.writeDouble(inmoney);
            System.out.println("Enter date on which account was sreated(Format:DD/MM/YYYY):"); 
            String date=sc.next();
            basic.checkDateFor(date);
            int time=ob.get(Calendar.YEAR)-(Integer.parseInt(date.substring(1+date.lastIndexOf('/')))+1);
            myexception.negative_exc(time);
            dos.writeInt(time);
            dos.writeInt((int)(Math.random()*10000000));
            i++;sc.nextLine();
        }
        dos.close();
        }
        catch(Exception e)
        {
           File b=new File("Bank_D.dat");
           b.delete();
        }
    }
    public  static int counter()throws IOException
    {
        FileInputStream a=new FileInputStream("Bank_D.dat");
        DataInputStream b=new DataInputStream(a);
        int c=0;
        while(true)
        {
        try
        {
            b.readUTF();
            b.readInt();
            b.readLong();
            b.readUTF();
            b.readDouble();
            b.readInt();
            b.readInt();
            c++;
        }
        catch(Exception e)
        {
            break;
        }
        }
        b.close();
        return c;
    }
    public  static void updater(Print ob)throws IOException
    {
        File f=new File("Bank_D.dat");
        f.delete();
        FileOutputStream a=new FileOutputStream("Bank_D.dat");
        DataOutputStream b=new DataOutputStream(a);
        for(int i=0;i<ob.num;i++)
        {
            b.writeUTF(ob.name[i]);
            b.writeInt(ob.age[i]);
            b.writeLong(ob.phone[i]);
            b.writeUTF(ob.type[i]);
            b.writeDouble(ob.inmoney[i]);
            b.writeInt(ob.time[i]);
            b.writeInt(ob.acn[i]);
        }
        b.close();
    }
} 