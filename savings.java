public class savings implements Account
{
    public double INTEREST_VALUE(int n,int t)
    {
        return TOTAL_AMOUNT(n,t)-n;
    }
    public double TOTAL_AMOUNT(int n,int t)
    {
        return n*Math.pow(1+(7/100.0),t);
    }
}