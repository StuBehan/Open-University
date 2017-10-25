public class M250Account
{
    private String accountNum;
    
    public M250Account();
    {
        this.accountNum = "X00000";
    }
    
    int measuredLength = accountNum.length();
    int accountNumberLength = 6;
    
    public boolean isValidLength();
    {
        return measuredLength == accountNumberLength;
    }
    
    char accountStart = accountNum.charAt(0);
    
    public boolean isValidStart()
    {
    
    }
    
    
