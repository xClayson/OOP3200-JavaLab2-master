/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;
import java.util.Scanner;

//driver class
public class Main {

    public static void main(String[] args)
    {
        int ticketNumber = 0;
        String clientID = "";
        int year = 0;
        int month = 0;
        int day = 0;
        String issueDescription = "";

        WorkTicket ticket;

        //Display Default Constructor
        ticket = new WorkTicket();
        System.out.println("\nDefault Constructor\n-------------------\n" + ticket.toString());

        //Display Parameterized Constructor
        ticket = new WorkTicket(1479, "Seasonal", 2014, 9, 2, "I have an issue. Plz help!");
        System.out.println("\nParameterized Constructor\n-------------------------\n" + ticket.toString());

        //Display an Error Parameterized Constructor
        ticket = new WorkTicket(-1, "Seasonal", 2100, 9, 2, "I have an issue. Plz help!");
        System.out.println("\nParameterized Constructor (with some errors)\n--------------------------------------------\n" + ticket.toString());

        //Display Using Setters/Getters
        System.out.println("\nSetters/Getters Ex.\n-------------------");
        ticket.setTicketNumber(12345);
        ticket.setClientID("OOP3200");
        ticket.setTicketDate(2000, 1, 1);
        ticket.setIssueDescription("Programming Issue");
        //Output
        System.out.println("WorkTicket #: " + ticket.getTicketNumber());
        System.out.println("ClientID:     " + ticket.getClientID());
        System.out.println("Date:         " + ticket.getTicketDate());
        System.out.println("Description:  " + ticket.getIssueDescription() + "\n");

        //Display an Error Using Setters/Getters
        ticket = new WorkTicket();
        System.out.println("\nSetters/Getters Error!\n-----------------------");
        ticket.setTicketNumber(100);
        ticket.setClientID("");
        ticket.setTicketDate(2000, 1, 1);
        ticket.setIssueDescription("");
        //Output
        System.out.println("\nWorkTicket #: " + ticket.getTicketNumber());
        System.out.println("ClientID:     " + ticket.getClientID());
        System.out.println("Date:         " + ticket.getTicketDate());
        System.out.println("Description:  " + ticket.getIssueDescription() + "\n");

        Scanner keyboard = new Scanner(System.in);


        //Default constructor - stores input in variables then passes it into the setWorkTicket function to set the object
        //WorkTicket ticket = new WorkTicket();
        System.out.print("Enter the ticket number: ");
        ticketNumber = keyboard.nextInt();
        System.out.print("Enter the client ID: ");
        clientID = keyboard.nextLine();
        System.out.println("Enter the ticket date:");
        System.out.print("\tDay: ");
        day = keyboard.nextInt();
        System.out.print("\tMonth: ");
        month = keyboard.nextInt();
        System.out.print("\tYear: ");
        year = keyboard.nextInt();
        System.out.print("Enter the issue description: ");
        issueDescription = keyboard.nextLine();
        ticket.setWorkTicket(ticketNumber, clientID, year, month, day, issueDescription);
        ticket.toString();
    }
}
