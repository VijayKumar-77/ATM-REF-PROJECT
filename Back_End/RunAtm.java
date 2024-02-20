
import java.util.*;

class RunAtm{
	static int AvailBalance=2000;
	static int AmountWithd=0;
	static int Balance1=0;
	public static  int CheckBalance(int Balance)
	{
		
				return AvailBalance;
				
	}
	public static int CashDeposit(int DepAmount)
	{
		
		
		
		AvailBalance= DepAmount + AvailBalance;
		
		
		return AvailBalance;	
	}
	public static int CashWithDraw(int WithdAmount)
	{
		
		if( AvailBalance>=WithdAmount) {
			int Balance=WithdAmount;
			AvailBalance = AvailBalance -WithdAmount;
			Balance1=AvailBalance;
			
		
		}
		else
		{
			System.out.println("Not Enough Balance");
		}
		return AvailBalance;
	}
}

