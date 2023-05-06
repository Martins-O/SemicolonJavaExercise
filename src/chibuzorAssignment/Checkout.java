package chibuzorAssignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {

        Scanner check = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<Double> priceList = new ArrayList<>();

        System.out.println("Enter the customer's name--> ");
        String fullName = check.nextLine();

        while (true) {
            System.out.println("Enter item bought--> ");
            String item = check.next();
            itemList.add(item);

            System.out.println("Enter the quantity--> ");
            int quantity = check.nextInt();
            quantityList.add(quantity);

            System.out.println("Enter the price of the items--> ");
            double amount = check.nextDouble();
            priceList.add(amount);
            double total = getTotal(quantityList, priceList);
            System.out.println("Add more item (yes or no)--> ");
            String option = check.next();

            if (!option.equals("yes")){
                printTitles(fullName);
                printHeaders();
                printRows(itemList,quantityList,priceList);
//                subTotal = amount * quantity;
                total = getTotal(quantityList,priceList);
                printResult(total);
//                System.out.println(total+" "+subTotal);
                break;
            }
        }
    }
        public static double getTotal(ArrayList<Integer> quantityList, ArrayList<Double> priceList ) {
            double totalPrice = 0;
            for (int index = 0; index < priceList.size(); index++) {
                totalPrice += quantityList.get(index) * priceList.get(index);
            }
            return totalPrice;
        }
    public static void printTitles(String fullName){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.print("_______________________________________");
        System.out.print("\n\t\t\tInvoice 1\n");
        System.out.println(formatter.format(date));
        System.out.printf("NAME: %s",fullName);
    }

    public static void printHeaders(){
        System.out.print("\n---------------------------------------");
        System.out.print("\n| ITEM |\tQUANTITY\t|\tPRICE\t |\tTOTAL\t|");
        System.out.print("\n---------------------------------------");
    }

    public static void printRows(ArrayList<String> itemList,ArrayList<Integer> quantityList,ArrayList<Double> priceList) {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.printf("\n| %s | \t%.10s\t| \t%,.2f\t|\t %.2f\t", itemList.get(i), quantityList.get(i), priceList.get(i), quantityList.get(i) * priceList.get(i));
            System.out.print("\n---------------------------------------");
        }

    }

    public static void printResult(double total) {
        System.out.print("\n----------------------------------------------");
        System.out.printf("\n|\t   Total\t\t\t\t   %,4f|", total);
        System.out.print("\n----------------------------------------------");
        System.out.print("\n\t\t\t\tTHANK YOU!");
        System.out.print("\n______________________________________________");
    }
}
