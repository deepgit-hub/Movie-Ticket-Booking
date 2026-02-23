import java.lang.System;
import java.util.Scanner;
class practice
{
    int movie;
    int tickets;
    int price;
    String showtime;
    void display()
    {
        System.out.println("--------------------------------------");
        System.out.println("<-----Welcome to SAKTHI CINEMAS------>");
        System.out.println("--------------------------------------");
        System.out.println(".............Movies Running...........");
        System.out.println("......................................");
        System.out.println("-.-.-.-.-.-.-. SCREEN 1 .-.-.-.-.-.-.-");
        System.out.println("--------------->1.LEO<----------------");
        System.out.println("-.-.-.-.-.-.-. SCREEN 2 .-.-.-.-.-.-.-");
        System.out.println("--------------->2.JAILER<-------------");
        System.out.println("--------------->3.VIKRAM<-------------");
        System.out.println("-.-.-.-.-.-.-. SCREEN 3 .-.-.-.-.-.-.-");
        System.out.println("--------------->4.DHURANDHAR<---------");
        System.out.println("--------------->5.SIRAI<--------------");
        System.out.println("--------------->6.F1<-----------------");
        System.out.println("--------------->7.RAPUNZEL<-----------");
        System.out.print("Enter which movie you wants to  watch : ");
        moive = scan.nextInt();
        switch(moive)
        {
            case 1 : 
                String moviename="Leo";
                leo();
                break;
            case 2 : 
                String moviename="Jailer";
                jailer();
                break;
            case 3 : 
                String moviename="Vikram";
                vikram();
                break;
            case 4 : 
                String moviename="Dhurandhar";
                dhurandhar();
                break;
            case 5 : 
                String moviename="Sirai";
                sirai();
                break;
            case 6 : 
                String moviename="F1";
                f1();
                break;                    
            case 7 : 
                String moviename="Rapunzel";
                rapunzel();
                break;    
            default :
                System.out.print("Invalid Movie Entered!!!");    
        }

    }
    void leo()
    {
        System.out.println("SCREEN 1")
        System.out.println("Ticket Price 200");
        System.out.println("Show 1 Timing : 09.00 AM");
        System.out.println("Show 2 Timing : 14.00 PM");
        System.out.println("Show 3 Timing : 18.00 PM");
        System.out.println("Show 4 Timing : 22.00 PM");
        System.out.print("Choose Timing by Selecting Show number (1-4)");
        time = scan.nextInt();
        if(time==1)
        {
            showtime="09.00 AM";
        }
        else if(time==2)
        {
            showtime="14.00 PM";
        }
        else if(time==3)
        {
            showtime="18.00 PM";
        }
        else if(time==4)
        {
            showtime="22.00 PM";
        }
        void bookleo()
        {
        System.out.print("Enter how many Seats you want (press '0' if you want to go back): ");
        tickets=scan.nextInt();
        if(tickets==0)
        {
            display();
        }
        else if(tickets<501)
        {
            price = tickets*200;
        }   
        else
        {
            System.out.print("The Maximum seat capacity is only 500!!!");
            bookleo();
        }
        }
        System.out.println("======Booking Summary======");
        System.out.println("Movie       : "+moviename);
        System.out.println("Timing      : "+showtime);
        System.out.println("Tickets     : "+tickets);
        System.out.println("Total Price : "+price);
        System.out.println("===========================");

    }
    void vikram()
    {
        System.out.println("SCREEN 2")
        System.out.println("Ticket Price ");
        System.out.println("Show 1 Timing : 09.00 AM");
        System.out.println("Show 3 Timing : 18.00 PM");
        System.out.print("Choose Timing by Selecting Show number (1 & 3)");
        time = scan.nextInt();
        if(time==1)
        {
            showtime="09.00 AM";
        }
        else if(time==3)
        {
            showtime="18.00 PM";
        }
        
        void bookvikram()
        {
        System.out.print("Enter how many Seats you want (press '0' if you want to go back): ");
        tickets=scan.nextInt();
        if(tickets==0)
        {
            display();
        }
        else if(tickets<351)
        {
            price = tickets*180;
        }   
        else
        {
            System.out.print("The Maximum seat capacity is only 350!!!");
            bookvikram();
        }
        }
        System.out.println("======Booking Summary======");
        System.out.println("Movie       : "+moive);
        System.out.println("Timing      : "+showtime);
        System.out.println("Tickets     : "+tickets);
        System.out.println("Total Price : "+price);
        System.out.println("===========================");

    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        public static void main(String args[])
        {
            display();
        }
    }
}
