import java.io.*;
import java.util.*;

  public class Multiple{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Some Integer:");
    int value=sc.nextInt();
    
      if(value!=0)
      {
      for(int i=1;i<=5;i++)
        {
          System.out.println("-> "+(i*value));
        }
      }
      else
      {
      System.out.println("0 is not a valid input!!!");
      }
  }
}  
