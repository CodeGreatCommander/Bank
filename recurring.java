public class recurring implements Account
{
    public double INTEREST_VALUE(int n,int t)
    {
        return n*t*12*(t*12+1)*5.0/2400.0;
    }
    public double TOTAL_AMOUNT(int n,int t)
    {
        return n*t*12.0+INTEREST_VALUE(n,t);
    }
}