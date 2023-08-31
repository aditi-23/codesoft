import java.util.*;
public class wordcounter 
{
 public static void main(String args[]) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  a text to get the count of word");
    String word=sc.nextLine();
    int c=0,i,j;
    String s[]=word.split(" ");
    for( i=0;i<s.length;i++)
    {
        System.out.println(s[i]);
        c++; }

    System.out.println("number of words in an sentence are :"+c);
}}
