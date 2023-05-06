package chapter6;
/*(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
the charge for each customer.*/

import java.util.Date;
import java.util.Scanner;

public class ParkingCharges {
    Scanner input = new Scanner(System.in);
    double hoursParked;
    String customerID;


    public double getHoursParked() {
        System.out.println("Enter Hour parking: ");
        hoursParked = input.nextDouble();
        return hoursParked;
    }

    public void setHoursParked(double hoursParked) {
        this.hoursParked = hoursParked;
    }

    public String getCustomerID() {
        System.out.println("Enter the customer ID");
        customerID = input.nextLine();
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public double calculateParkingCharges(double hoursParked){
        double chargesFees;
        double excessHour = 0;

        if (hoursParked == 3) {
            chargesFees = 2.00;
        }else if (hoursParked > 3) {
            excessHour = hoursParked - 3;
            double excessUsedHour = excessHour % 10;
            chargesFees = 2.00 + (0.5*excessUsedHour);
        }else if (hoursParked == 24) {
            chargesFees = 10.00;
        }else {
            chargesFees = 2.5 ;
        }
        return chargesFees;
    }

    public void displayCharges(String customerID, double chargesfees){
        long oneDay = (long) 1000.0 * 60 * 60 * 24;
        Date yesterday = new Date(System.currentTimeMillis() - oneDay);
        System.out.println("-- Parking fees calculation System --");
        System.out.printf("| Date: %s |", yesterday);
        System.out.printf("\n| Customer ID: %s |", customerID);
        System.out.printf("\n Total Parking fees: %.2f |\n", chargesfees);
        System.out.println("--------|--------------------------------|");
    }


    public static void main(String[] args) {
        ParkingCharges parkingCharges  = new ParkingCharges();
        parkingCharges.getCustomerID();
        parkingCharges.getHoursParked();
        parkingCharges.calculateParkingCharges(parkingCharges.hoursParked);
        parkingCharges.displayCharges(parkingCharges.customerID, parkingCharges.calculateParkingCharges(parkingCharges.hoursParked));

    }
}
