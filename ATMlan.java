import java.util.Scanner;

public class ATMlan 
{
	//OUR INSTANCE VARIABLE
	int pin;
	int hw;
	int minAmount = 500;
	int a=5000;
	int engwithdraw;
	int engpin;
	int withdrawprocess;
	int chooseopt;
	int balance=5000;
	int engdeposit;
	int hindioption;

	//METHOD USED FOR LANGUAGE
	public void language()
    {
    	int lan;
    	System.out.println("Select Your Language");
    	System.out.println("1.Hindi");
    	System.out.println("2.English");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Your Language");
    	lan=sc.nextInt();
    	//START HERE SWITCH STATEMENT
    	switch(lan)
    	{
    	//STARTING HERE HINDI LANGUAGE PROCESS
    	case 1:System.out.println("Hindi"); 
    	String hindi="अपना एटीएम पिन दर्ज करें";
    	System.out.println(hindi);
    
    	Scanner s=new Scanner(System.in);
    	pin= s.nextInt();
    	System.out.println("पैसे निकालने के लिए चुनें");
    	System.out.println("1.नकदी वापिस लेना/Cash Withdraw");
    	System.out.println("2.पैसा जमा करने के लिए");
    	System.out.println("अपना विकल्प चुनें");
    	hindioption=sc.nextInt();
    	switch(hindioption)
    	{
    	case 1:System.out.println("1.नकदी वापिस लेना/Cash Withdraw\"");
        System.out.println("अपनी राशि दर्ज करें");
        engwithdraw=sc.nextInt();
       
    	 if ( engwithdraw>= minAmount && engwithdraw <= a) 
    		if (engwithdraw <= balance) 
    		{
    			 balance -= engwithdraw;
               System.out.println("निकासी सफल! आपने वापस ले लिया है: : " + engwithdraw);
               System.out.println("शेष पैसा: " + balance);
    		}
    		else 
    		{
              System.out.println("अपर्याप्त शेषराशि। आपका वर्तमान शेष है: " + balance);
    		}
    	 else 
    	 {
          System.out.println("अमान्य राशि. आपकी राशि अपर्याप्त है.");
      }
    	 
      
    	 System.out.println("धन्यवाद.");
    	 break;
    	
    	//WORK HERE FOR DEPOSIT
    	case 2:System.out.println("2.पैसा जमा करने के लिए");
        System.out.println("अपनी राशि दर्ज करें");
        engdeposit=sc.nextInt();
       
    	 if ( engdeposit>= minAmount && engdeposit <= a) 
    		if (engdeposit <= balance) 
    		{
    			 balance += engdeposit;
               System.out.println("जमा सफल! आपके पास जमा राशि है: " + engdeposit);
               System.out.println("कुल पैसा: " + balance);
    		}
    		else 
    		{
              System.out.println("अपर्याप्त शेषराशि। आपका वर्तमान शेष है: " + balance);
    		}
    	 else 
    	 {
          System.out.println("अमान्य राशि! आपकी राशि अपर्याप्त है.");
      }
      
    	 System.out.println("धन्यवाद.");
        break;
   	 //START HERE DEFAULT LANGUAGE
        default:System.out.println("Invalid Language");
    	   break;
    	}
    	break;
    	 
    	 //START HERE ENGLISH LANGUAGE
    	case 2:System.out.println("English");
    	Scanner en=new Scanner(System.in);
    	System.out.println("Enter Your ATM PIN.");
    	engpin=en.nextInt();
    	System.out.println("Choose to withdraw Money");
    	System.out.println("1.Cash Withdraw");
    	System.out.println("2.Deposit Amount");
    	System.out.println("Select Your Option");
        chooseopt=en.nextInt();
        switch(chooseopt) 
        {
           //HERE WORK ONLY CASH WITH DRAW
           case 1:System.out.println("1.Cash Withdraw");
           System.out.println("Enter Your Amount");
           engwithdraw=en.nextInt();
          
       	 if ( engwithdraw>= minAmount && engwithdraw <= a) 
       		if (engwithdraw <= balance) 
       		{
       			 balance -= engwithdraw;
                  System.out.println("Withdrawal successful! You have withdrawn: " + engwithdraw);
                  System.out.println("Remaining balance: " + balance);
       		}
       		else 
       		{
                 System.out.println("Insufficient balance. Your current balance is: " + balance);
       		}
       	 else 
       	 {
             System.out.println("Invalid Amount.Your Withdraw Amount more than 500.");
         }
         
       	 System.out.println("Thank You.");
      	 break;
      	 //WORK HERE DEPOSIT AMOUNT
           case 2:System.out.println("2.Deposit Amount");
           System.out.println("Enter Your Amount");
           engdeposit=en.nextInt();
          
       	 if ( engdeposit>= minAmount && engdeposit <= a) 
       		if (engdeposit <= balance) 
       		{
       			 balance += engdeposit;
                  System.out.println("Deposit successful! You have deposit: " + engdeposit);
                  System.out.println("Remaining balance: " + balance);
       		}
       		else 
       		{
                 System.out.println("Insufficient balance. Your current balance is: " + balance);
       		}
       	 else 
       	 {
             System.out.println("Invalid Amount.Your Deposit Amount more than 500.");
         }
         
       	 System.out.println("Thank You.");
           break;
      	 //START HERE DEFAULT LANGUAGE
           default:System.out.println("Invalid Language");
       	   break;
       	
        }
    
        
    	}
         sc.close();
    }
    }

