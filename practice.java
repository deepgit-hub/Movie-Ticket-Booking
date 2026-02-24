import java.lang.System;
import java.util.Scanner;
class practice1
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    String[] movies={"Leo","Dhurandhar","F1","Sirai","Rapunzel","Vikram","Jailer"};
    int[] screen={1,2,2,3,3,3,3};
    int[] capacity={500,350,350,200,200,200,200};
    int[] price={250,200,200,180,180,180,180};
    boolean running = true;
    System.out.println("-------------------------------------");
    System.out.println("<-----Welcome to Sakthi Cinemas----->");
    System.out.println("-------------------------------------");
        
    while(running)
    {
        System.out.println("============MOVIES RUNNING===========");
        for(int i=0;i<movies.length;i++)
        {
            System.out.println(i+1+" . "+movies[i]);
        }
        System.out.println("-------------------------------------");
        System.out.print("Enter Your Choice--->");
        int choice=scan.nextInt();
        if(choice>movies.length)
        {
        System.out.println("Choose your choice from (1-"+movies.length+")");
        continue;
        }
        int index = choice-1;
        System.out.println("*************MOVIE DETAILS***********");
        System.out.println("Movie Name   : "+movies[index]);
        System.out.println("Ticker Price : "+prices[index]);
        running=false;

    }
}}
