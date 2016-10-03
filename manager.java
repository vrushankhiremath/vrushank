package kletech.ac.in;

import java.util.Scanner;

public class manager extends employee implements company{
	 int ID;
	 String Name;
	 int Age;
	 int salary;
	 double gsal;
	 double TA;
	 double TAX;
	 double NETSAL;
	  public	void read(){
		    
		  System.out.println("enter ID\n");
			Scanner s=new Scanner(System.in);
			int ID=s.nextInt();
			System.out.println("\nenter name\n");
			Scanner sc=new Scanner(System.in);
			String Name=sc.nextLine();
			System.out.println("\nenter age\n");
			Scanner c=new Scanner(System.in);
			int age=sc.nextInt();
			System.out.println("\nenter salary\n");
			Scanner cs=new Scanner(System.in);
			int salary=cs.nextInt();
		}
		
		public void calculate(){
			 TA=salary*0.05;
			 TAX=salary*0.1;
			 gsal=salary+TA;
			 NETSAL=gsal-TAX;
			 
		}
		public void display(){
			 System.out.println("\nID :"+ID);
			 System.out.println("\nNAME :"+Name);
			 System.out.println("\nAGE :"+Age);
			 System.out.println("\nNET SALARY:Rs."+NETSAL);
			 
		}
 
	

}
