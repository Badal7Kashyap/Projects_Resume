import java.util.*;
public class pizza implements parent
{
      Scanner s=new Scanner(System.in);
 
      int price_1=12;
      int price_2=22;
      int price_more_than_2=10;
      

      public void rates()
      {
		System.out.println("--Pizza Pack Rates And Offers--");
        System.out.println("Quantity-1Large Price: 12AUD \n|||||\nQuantity-2Large Price: 22AUD \n|||||\nQuantity More Than-2Large Price: 10AUD per Pizza \n");
      }

      public void offer()
      {
		System.out.println("Offer Available----- Buy More Than 2 Pizzas & Get 1 Garlic Bread Free On Every Third Pizza\n");

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
			int garlic_bread_count=amount/3;
			System.out.println("----- Offer Congrats You Got :"+garlic_bread_count+" Galic Breads -----\n");
			

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
			System.out.println(" ! Wrong Input Try Again");
			return 0;
		}

		if((choice=='y')||(choice=='Y'))
	       	{	
			pizza pz=new pizza();
			return pz.bill(amount);
		}

		else if((choice=='n')||(choice=='N')) 
		{
			System.out.println("Thanks for Visiting....");
		}

		
		else
			System.out.println(" ! Wrong Input Try Again");

		}
		return 0;
		
      }

      
}
