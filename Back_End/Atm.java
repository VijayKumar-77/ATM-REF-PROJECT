import java.util.*;

public class Atm extends RunAtm {
	
public static boolean CheckPin(int pin,int enteredPin) {
	    System.out.println("Enter Your 4 digit pin");
		Scanner sc=new Scanner(System.in);
		enteredPin=sc.nextInt();
		 return(pin==enteredPin);

		}
	
	
	
	public static void main(String[] args) {
		int FinalBalance=0,result=0;
		Scanner sc=new Scanner(System.in);
         AtmUser U1=new AtmUser();
         System.out.println("Please Set your Pin");
		U1.setPin(sc.nextInt());
		U1.setAtmPin(0);
		
		

	
			
		
while(true){
	
	System.out.println("Enter your option 1:checkBalance");
	System.out.println("Enter your option 2:Deposit");
	System.out.println("Enter your option 3:Withdraw");
	System.out.println("Enter your option 4:TransactionHistory");
	System.out.println("Enter your option 5:ChangePin");
	System.out.println("Enter your option 6:Exit");
	System.out.println("Enter your option :");
			int opt= sc.nextInt();
			
		
			if(CheckPin(U1.getPin(),U1.getAtmPin())) {

			
		if(opt==1)
		{
			
			
			 result=CheckBalance(U1.getAvailBalance());
			 System.out.println(result);
			
			
			
		}
		
		else if(opt==2)
		{
			System.out.println("Enter an amount to Deposit: ");
			U1.setDeposit(sc.nextInt());
			int a=CashDeposit(U1.getDeposit());
			System.out.println("Your current Balance is : ");
			System.out.println(a);
			
			result=a;
		
		}
		
		else if(opt==3)
		{
			

			System.out.println("Enter an amount to WITHDRAW: ");
			U1.setWithdraw(sc.nextInt());
			int c=U1.getWithdraw();
			int b=CashWithDraw(U1.getWithdraw());
			System.out.println("Your current Balance is : ");
			System.out.println(b);
			result=b;
		}
			
		else if(opt==4)
		{
			System.out.println("Your last transactioin history : ");
			System.out.println("Last time added desposited : "+U1.getDeposit());
			System.out.println("Last time added withdrawal : "+U1.getWithdraw());
			System.out.println("Your current Balance is : "+result );
		}
		else if(opt==5)
		{
			System.out.println("Please enter Your New Pin");
			U1.setPin(sc.nextInt());
		}
		else if(opt==6)
		{
	System.out.println("Thanks for Visiting!! \n");
			break;
		}
			else
		{
	
			System.out.println("Enter valid Option!!");
		}
		
		System.out.println("Want to continue :");
		String s=sc.next();
			if(s.equalsIgnoreCase("YES"))
			{
				
			}
			
			else if(s.equalsIgnoreCase("NO"))
			{
				System.out.println("THANK YOU FOR VISITING!");
				
				break;
			}
			else {
				break;
			}
			}
		  else 
			{
				System.out.println("Enter valid Pin");
				
				
			}
		
	}
}
}


		
		
//int Balance = U1.getAvailBalance();
//int Deposit = U1.getDeposit();
//int Withdraw = U1.getWithdraw();
//
//int pin=U1.getPin();
//int AtmPin=U1.getAtmPin();


