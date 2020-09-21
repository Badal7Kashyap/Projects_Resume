import java.util.*;
public class pasta implements parent
{
	Scanner s=new Scanner(System.in);

        int price_1=8;
        int price_2=15;
        int price_more_than_2=7;


	public void rates()
	{
		 System.out.println("--Pasta Pack Rates And Offers--");
        System.out.println("Quantity-1Large Price: 8AUD \n|||||\nQuantity-2Large Price: 15AUD \n|||||\nQuantity More Than-2Large Price: 7AUD per Pasta \n");

	}

	public void offer()
	{
		 System.out.println("Offer Available----- Buy More Than 2 Pasta & Get 1: 1.25 ltr Soft Drink Free On Every Third Pasta\n");	
	}
	
 	
      public int bill(int amount)
      {
       
               int Total_Payable_Amount=0;
               if(amount==1)
                        Total_Payable_Amount=price_1;
               else if(amount==2)
                        Total_Payable_Amount=price_2;
               else{
                        Total_Payable_Amount=price_more_than_2*amount;
                        int soft_drink_count=amount/3;
                        System.out.println("----- Offer Congrats You Got :"+soft_drink_count+": 1.25 ltrs Soft Drinks Bottle -----\n");

                   }

	      return Total_Payable_Amount;

      }


	
      public int quantity(int amount)
      {
               
		char choice;	
                if(amount<0)
                        System.out.println("You Entered An Invalid Amount try Again");
                else
                {

                System.out.print("Press Y to Confirm & generate Bill Otherwise press N: ");

		try{
                choice=s.next().charAt(0);
		}
		catch(Exception e)
		{
			System.out.println(" ! Wrong Input");
			return 0;
		}
                if((choice=='y')||(choice=='Y'))
                {
                        pasta pa=new pasta();
                        return pa.bill(amount);
                }
                else if((choice=='n')||(choice=='N'))
		{
                        System.out.println("Thanks for Visiting....");
		}
		
		else
			System.out.println(" ! Wrong Input");
		
                }

		return 0;

      }
	

}
