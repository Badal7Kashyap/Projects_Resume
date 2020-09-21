import java.util.*;
public class food
{
	
	public
        static int total_amount_pizza=0;
        static int total_amount_pasta=0;

	static int total_pizza_sold=0;
	static int total_pasta_sold=0;

	static int amount;


	public int fun_pizza()
	{
		int choice,quantity,choice_2;
                Scanner s=new Scanner(System.in);
                

		pizza pz=new pizza();
                pz.rates();                
 		pz.offer();

        System.out.print("Press 1-To Enter Quantity 2-Go back To Main Menu: ");
	try{
        choice_2=s.nextInt();}
	catch(Exception e)
	{ System.out.println(" ! Wrong Input"); return 0; }



                                        if(choice_2==1)
                                        {
						System.out.print("Please Enter Quantity: ");
						try{
				                amount=s.nextInt();}
						catch(Exception e)
					        { System.out.println(" ! Wrong Input"); return 0; }


                                                int temp_bill=pz.quantity(amount);
                                                total_amount_pizza+=temp_bill;

                                              

						if(temp_bill!=0)
						{	total_pizza_sold+=amount;
							return temp_bill; }

                                        }	
		
					return 0;
	}
	//end of fun_pizza()
	
	public int fun_pasta()
	{
		int choice,quantity,choice_2;
                Scanner s=new Scanner(System.in);
              
		
		pasta pa=new pasta();
                pa.rates();
                pa.offer();

        System.out.print("Press 1-To Enter Quantity 2-Go back To Main Menu: ");
	try{
        choice_2=s.nextInt();}
	catch(Exception e)
        { System.out.println(" ! Wrong Input"); return 0; }





                                        if(choice_2==1)
                                        {
						System.out.print("Please Enter Quantity: ");
						try{
        				        amount=s.nextInt();}
						catch(Exception e)
					        { System.out.println(" ! Wrong Input"); return 0; }

	
                                                int temp_bill=pa.quantity(amount);
                                                total_amount_pasta+=temp_bill;
				
                                             
					       
						if(temp_bill!=0)
						{	total_pasta_sold+=amount;
							return temp_bill; }
                                        }
					
					return 0;
		
	}
	//end of fun_pasta()
	


	public static void main(String args[])
	{

		System.out.println("*************************     CONSOLE APPLICATION     ************************");
		
		char choice='0'; int quantity;
		Scanner s=new Scanner(System.in);
		char choice_3,choice_2; 
		
	
		int bill=0;
		

		while(true)
		{
			
			System.out.print("\nPress 1-Place Order || 2-Exit: ");	

			
			choice_2=s.next().charAt(0); 

			
			if(choice_2=='1')
			{
				System.out.println("\n||||| Select Item |||||\n");
				
				System.out.print("Press 1-For Pizza || 2-For Pasta || 3-For All Items: "); 
				try{
				choice=s.next().charAt(0);}
				catch(Exception e)
			        { System.out.println(" ! Wrong Input");  }


			        if((choice=='1')||(choice=='2')||(choice=='3'))
				{
				switch(choice)
				{
					case '1':
						food object=new food();
						int value=object.fun_pizza();
						if(value==0)
							continue;
						System.out.println("----Total Payable Amount: "+value+" AUD ----");
						break;
					//end for pizza

					case '2':
						object=new food();
						value=object.fun_pasta();
						if(value==0)
							continue;
						System.out.println("----Total Payable Amount: "+value+" AUD ----");
						break;
					//end for pasta

					case '3':
					System.out.println("\n|||| Special Offer For Every 3 Pizzas & 3 Pasta Get A Small Box Of Baklava In Addition||||\n");
					System.out.print("\nPress Y TO Continue Otherwise Press N To Get Back To Main menu: ");
					try{
					choice_3=s.next().charAt(0);}
					catch(Exception e)
				        { System.out.println(" ! Wrong Input"); continue; }


					if((choice_3=='y')||(choice_3=='Y'))
				        {

					int no_item_1,no_item_2;

					System.out.println("\n|||| Order for Pizza ||||\n");
					object=new food();
					value=object.fun_pizza();
					
					if(value==0)
						continue;

					no_item_1=amount;
					bill+=value;

					System.out.println("\n|||| Order for Pasta ||||\n");
					object=new food();
					value=object.fun_pasta();

					if(value==0)
						continue;

					no_item_2=amount;
					bill+=value;

                                        if(no_item_1<=no_item_2)
					{
						int d=(no_item_1)/3;
						if(d>0)
							System.out.println("----- Special Offer You Got "+d+" Baklava Desert Box -----\n\n");
					}					
					else if(no_item_1>no_item_2)
					{
						int d=(no_item_2)/3;
						if(d>0)
							System.out.println("----- Special Offer You Got "+d+" Baklava Desert Box -----\n\n");

					}
					
					System.out.println("----Total Payable Amount: "+bill+" AUD ----");
					bill=0;
					}
					else if((choice_3=='n')||(choice_3=='N'))
						continue;
					else
					    {   System.out.println(" ! Wrong Input Try Again");
                                        	continue; }


					break;
					//end for more items

					default:
						System.out.println("Sorry You Have Pressed A Wrong Key");

				}//end of switch

				}//end of if

				else 
				{   System.out.println(" ! Wrong Input Try Again");
                                        continue; }



			}//end of if

			else if(choice_2=='2')
			{ 	
				System.out.print("|||| To View Session Transaction ||||\n\n Press 1-For YES || 2-For NO: ");
				
				choice=s.next().charAt(0);


				if(choice=='1')
				{
				System.out.println("[---------- SESSION TRANSACTION RECORD ----------]\n\n");
				System.out.println("Total Amount Collection For Pizzas : "+total_amount_pizza+" AUD\n");
		                System.out.println("Total Amount Collection For Pasta : "+total_amount_pasta+" AUD\n");
				
				System.out.println("Total No Of Pizzas Sold: "+total_pizza_sold+" pcs\n");
                                System.out.println("Total No Of Pasta Sold: "+total_pasta_sold+" pcs\n");

				System.out.println("[---------- SESSION OVER ----------]\n\n");
				}
				else if(choice=='2')	
				System.exit(0);

				else 
				{	System.out.println(" ! Wrong Input Try Again");
					continue; }
			}
			else
                             {   System.out.println(" ! Wrong Input Try Again");
                                        continue; }


		}//end of while

		
	}//end of main

}//end of main_class
