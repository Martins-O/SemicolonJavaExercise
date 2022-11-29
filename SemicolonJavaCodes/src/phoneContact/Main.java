package phoneContact;

import electronicStore.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Record record = new Record();
        PhoneContactRecord phoneContactRecord = new PhoneContactRecord();
        Scanner input = new Scanner(System.in);

//        System.out.println("Contact Name: ");
//        String comName = input.nextLine();
//        System.out.println("(optional)Contact Address: ");
//        String add = input.nextLine();
//        System.out.println("Contact Phone Number: ");
//        String num = input.nextLine();
//        System.out.println("(optional)Contact Email Address: ");
//        String mail = input.nextLine();
//        record.setName(comName);
//        record.setEmail(mail);
//        record.setTelephone(num);
//        record.setAddress(add);
//
//        phoneContactRecord.addContact(record);

        int option = 0;
        do {
            phoneContactRecord.menu();
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Contact Name: ");
                    String comName = input.next();
                    System.out.println("(optional)Contact Address: ");
                    String houseNo = input.next();
                    String country = input.next();
                    String street = input.next();
                    String city = input.next();
                    String state = input.next();
                    Address add = new Address(houseNo, country, street, city, state);
                    System.out.println("Contact Phone Number: ");
                    String num = input.next();
                    System.out.println("(optional)Contact Email Address: ");
                    String mail = input.next();
                    record = new Record(comName,add,num,mail);

                    phoneContactRecord.addContact(record);
                    System.out.println(record.toString());
                    break;
                case 2:
                    System.out.println("Enter the contact name: ");
                    String name = input.nextLine();
                    phoneContactRecord.deleteContact(name);
                    break;
                case 3:
                    System.out.println("Enter the contact name: ");
                    name = input.nextLine();
                    phoneContactRecord.updateContact(name, input);
                case 4:
                    System.out.println("Enter the contact name: ");
                    name = input.next();
                    if (!phoneContactRecord.findContact(name)){
                        System.out.println("Information not exist");
                    }break;
                case 5:
                    phoneContactRecord.display();
                    break;
                case 99:
                    System.out.println("Good Bye for now, WE LOVE YOU");
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        while (option != 99);
    }
}
