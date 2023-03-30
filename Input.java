import java.util.*;
import java.io.*;
public class Input
{
    String name[],type[];// stores names
    int num,acn[],inmoney[],age[],time[];
    long phone[];
    public Input()throws myexception
    {
        try
        {
            num=Data_file.counter();
        FileInputStream a=new FileInputStream("Bank_D.dat");
        DataInputStream b=new DataInputStream(a);
        name=new String[num];
        type=new String[num];
        acn=new int[num];
        inmoney=new int[num];
        age=new int[num];
        time=new int[num];
        phone=new long[num];
        for(int i=0;i<num;i++)
        {
            name[i]=b.readUTF();
            age[i]=b.readInt();
            
            phone[i]=b.readLong();
            type[i]=b.readUTF();
            
            inmoney[i]=(int)(b.readDouble());
            time[i]=b.readInt();
            acn[i]=b.readInt();
            System.out.println(inmoney[i]);
        }
        b.close();
        }
        catch(IOException e)
        {
        }
    }
    protected static void mainIn()throws myexception
    {
        Input ob=new Input();
    }
}