package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;

import prog2.exercise4.flight.booking.system.FlightBooking.TripDestination;
import prog2.exercise4.flight.booking.system.FlightBooking.TripSource;



public class Main 
{
    private static final LocalDate depart = null;
    private static final LocalDate returnDate = null;
    
    public static void main( String[] args)
    {  
        FlightBooking fb = new FlightBooking("null", depart, returnDate, 2, 3 );
    
        Scanner sc1 =new Scanner(System.in);
        System.out.println("请选择想要的机票类型：");
        System.out.println("1.	First");
        System.out.println("2.	Business");
        System.out.println("3.	Economy");
        int m = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请选择单向还是返回：");
        System.out.println("1.	One way");
        System.out.println("2.	Return");
        int n = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请选择想去的地方：");
        System.out.println("1.	Nanjing");
        System.out.println("2.	Beijing");
        System.out.println("3.	Oulu");
        System.out.println("4.	Helsinki");
        int k = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("请选择想回去的地方：");
        System.out.println("1.	Nanjing");
        System.out.println("2.	Beijing");
        System.out.println("3.	Oulu");
        System.out.println("4.	Helsinki");
        int h = sc4.nextInt();

       
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
        String str ;
        switch(m){
        case 1:
        str = "1";fb.setBookingClass(str);fb.getBookingClass();break;
        case 2:
        str = "2";fb.setBookingClass(str);fb.getBookingClass();break;
        case 3:
        str = "3";fb.setBookingClass(str);fb.getBookingClass();break;
        }
        
        String str2;
        switch(n){
        case 1:
        str2 = "1";fb.setTripType(str2);fb.getTripType();break;
        case 2:
        str2 = "2";fb.setTripType(str2);fb.getTripType();break;
        }
        fb.setpo(n);
        
        String str3;
        switch(k){
        case 1:
        str3 = "1";fb.setTripSource(str3);fb.setyy(str3);fb.getTripSource();break;
        case 2:
        str3 = "2";fb.setTripSource(str3);fb.setyy(str3);fb.getTripSource();break;
        case 3:
        str3 = "3";fb.setTripSource(str3);fb.setyy(str3);fb.getTripSource();break;
        case 4:
        str3 = "4";fb.setTripSource(str3);fb.setyy(str3);fb.getTripSource();break;

        }
       
        TripSource Source = fb.getTripSource();
        String bh = fb.getyy();
        String str4;
        switch(h){
            case 1:
            str4 = "1";fb.setTripDestination(bh,str4);fb.getTripDestination();break;
            case 2:
            str4 = "2";fb.setTripDestination(bh,str4);fb.getTripSource();break;
            case 3:
            str4 = "3";fb.setTripDestination(bh,str4);fb.getTripSource();break;
            case 4:
            str4 = "4";fb.setTripDestination(bh,str4);fb.getTripSource();break;
    
            }
        TripDestination destination = fb.getTripDestination();
        
        
        
        String Date = "2023-03-04";
        LocalDate sskk3 = LocalDate.parse(Date);
        fb.setDepartureDate(sskk3);
        LocalDate departureDate = fb.getDepartingDate();
        String Date1 = "2023-03-04";
        LocalDate sskk4 = LocalDate.parse(Date1);
        fb.setReturnDate(sskk4);
       

        
         
       

        String company = fb.getFlightCompany();
        String ticketNumber = fb.getTicketNumber();
        LocalDate returningDate = fb.getReturnDate();
        fb.setTotalPassengers(2,5);
        int totalPassengers = fb.getTotalPassengers();
        fb.setDepartingTicketPrice(2,5);
       
        fb.setReturnTicketPrice();
        
       
        fb.setTotalTicketPrice();
        
        double totalTicketPrice = fb.getTotalTicketPrice();
        
           
          System.out.println(". Thank you for booking your flight with " + 
          company + ". Following are the details of your booking and the trip:" + "\n" + 
          "Ticket Number: " + ticketNumber + "\n" + 
          "From " + Source + " to " + destination + "\n" +
          "Date of departure: " + departureDate + "\n" +
          "Date of return: " + returningDate + "\n" +
          "Total passengers: " + totalPassengers + "\n" +
          "Total ticket price in Euros: " + totalTicketPrice);
           
    }

      
        

    
    
   

   
        }
        
