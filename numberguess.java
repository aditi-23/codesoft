import java.util.*;
class numberg
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("You have 5 chances");
    System.out.println("enter the number between 1&100");
     int  a=(int)(100*Math.random());
    int k=5,i;
    for(i=0;i<k;i++)
    {
    int n=sc.nextInt();
    if(n<a)
    {
    System.out.println("too low increase a bit");
    }
    else if(n>a)
    {
    System.out.println("too high decrease a bit");
    }
    else
    {
    System.out.println("you have guessed it right");
    break;
    }
    }
     if(i==k)
     {
     System.out.println("try your luck next Time.");
     System.out.println("number is :"+a);
    }}}
