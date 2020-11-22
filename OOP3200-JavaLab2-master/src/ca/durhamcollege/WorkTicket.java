/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;

import java.time.LocalDate;

public class WorkTicket
{
    // Private data members
    private int ticketNumber;
    private String clientID;
    private LocalDate ticketDate;
    private String issueDescription;

    //Constructors
    //Default
    public WorkTicket()
    {
        this.ticketNumber = 0;
        this.clientID = null;
        this.ticketDate = null;
        this.issueDescription = null;
    }

    //Parameterized
    public WorkTicket(int ticketNumber, String clientID, int year, int month, int day, String issueDescription)
    {
        setWorkTicket(ticketNumber, clientID, year, month, day, issueDescription);
    }

    // ACCESSORS & MUTATORS
    //Get Ticket Number
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    //Set Ticket Number
    public void setTicketNumber(int ticketNumber)
    {
        try
        {
            //If ticket number is less than 0, throws an exception
            if (ticketNumber < 0)
            {
                throw new IllegalArgumentException();
            }
            //Ticket is valid
            else
            {
                this.ticketNumber = ticketNumber;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.print("\nThe work ticket number entered is invalid.");
        }
    }

    //Get Client ID
    public String getClientID()
    {
        return clientID;
    }
    //Set Client ID
    public void setClientID(String clientID)
    {
        try
        {
            //If Client Id's length is less/equal to 1, throw an exception
            if (clientID.length() <= 1)
            {
                throw new IllegalArgumentException();
            }
            //Client Id is valid
            else
            {
                this.clientID = clientID;
            }
        }
        catch(IllegalArgumentException ex)
        {
            System.out.print("\nThe Client ID entered is invalid.");
        }
    }

    //Get Ticket Date
    public LocalDate getTicketDate()
    {
        return ticketDate;
    }
    //Set Ticket Date --Validations go in here--
    public void setTicketDate(int year, int month, int day)
    {
        final int MIN_YEAR = 2000;
        final int MAX_YEAR = 2099;
        final int MIN_MONTH = 1;
        final int MAX_MONTH = 12;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        try
        {
            if (year < MIN_YEAR || year > MAX_YEAR || month < MIN_MONTH || month > MAX_MONTH || day < MIN_DAY || day > MAX_DAY)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                LocalDate ticketDate = LocalDate.of(year, month, day);
                this.ticketDate = ticketDate;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("\nThe date entered is invalid.");
        }
    }

    //Get Issue Description
    public String getIssueDescription()
    {
        return issueDescription;
    }

    //Set Issue Description
    public void setIssueDescription(String issueDescription)
    {
        try
        {
            //If Issue Description length is less/equal to 1, throw an exception
            if (issueDescription.length() <= 1)
            {
                throw new IllegalArgumentException();
            }
            //Issue Description is valid
            else
            {
                this.issueDescription = issueDescription;
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.print("\nThe issue description entered is invalid.");
        }

    }

    boolean setWorkTicket(int ticketNumber, String clientId, int year, int month, int day, String issueDescription)
    {
        boolean validInput = true;

        setTicketNumber(ticketNumber);
        setClientID(clientId);
        setTicketDate(year, month, day);
        setIssueDescription(issueDescription);

        if (this.ticketNumber != ticketNumber || this.clientID != clientId || this.ticketDate != ticketDate ||
                this.issueDescription != issueDescription)
        {
            validInput = false;
        }
        return validInput;
    }

    // Functions
    @Override
    public String toString() {
        return "WorkTicket #: " + ticketNumber + "\n" +
                "ClientID:    " + clientID + "\n" +
                "Date:        " + ticketDate + "\n" +
                "Description: " + issueDescription + "\n";
    }
}
