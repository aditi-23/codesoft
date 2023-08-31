import java.util.*;
public class atmmachine
{
    int pin=2345;
    double balance=400000;
    public void checkpin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the pin");
        int enterpin=sc.nextInt();
        if(pin==enterpin)
        {
            menu();
        }
        else
        {
            System.out.println("Invalid pin");
        }
        }
    public void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("choice 1:Withdraw money");
        System.out.println("choice 2:Deposit money");
        System.out.println("choice 3:check balance");
        int choice=sc.nextInt();
        switch(choice) 
        {
         case 1:
         withdrawn();
         break;
         case 2:
         deposits();
         break;
         case 3:
         checkbalance();
         break;
         } 
         }
       public void withdrawn()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the amount to be withdrawn");
         double with=sc.nextDouble();
         if(balance>with)
         {
            System.out.println("collect your amount please");
            balance=balance-with;
            System.out.println("Total amount now :"+balance);
         }
         else
         {
            System.out.println("insufficient balance");
            withdrawn();
         }
       }
       public void checkbalance()
       {
        System.out.println("check your total balance");
        System.out.println("Current Balance : " +balance);
       }
       public void deposits()
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount to be deposisted");
        double deposit=sc.nextDouble();
        balance = balance + deposit;
        System.out.println("Your Money has been successfully deposited");
        System.out.println("total amount :"+balance);
        menu();
       }}