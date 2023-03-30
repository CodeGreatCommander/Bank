import java.util.Calendar;
public class Draft
{
    public static void main(int n,String pay,String payee)
    {
        for(int i=0;i<100;i++)
        {
            System.out.print('*');
        }
        Calendar a=Calendar.getInstance();
        System.out.println();
        System.out.println("*A\\C\t ACCOUNT\t\tBOIBR BANK");
        System.out.print("*\n*\t\t\t\t\t\t\t\t\t\tDATE:"+a.get(Calendar.DATE)+"/"+(a.get(Calendar.MONTH)+1)+"/"+a.get(Calendar.YEAR)+"\n*\n*PAY:"+pay.toUpperCase()+"\n*\n*AMOUNT:");
        basic.convertor(n);
        System.out.println("*\n*\t\t\t\t\t\t\t\t\t\tCASH:Rs"+n+"\n*\n*\t\t\t\t\t\t\t\t\t\t"+payee.toUpperCase());
        for(int i=0;i<100;i++)
        {
            System.out.print('*');
        }
    }
}