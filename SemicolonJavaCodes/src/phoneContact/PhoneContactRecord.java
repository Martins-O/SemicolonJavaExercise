package phoneContact;

import electronicStore.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneContactRecord {

    private ArrayList<Record> list;

    public PhoneContactRecord() {
        list = new ArrayList<>();
    }

    public Record addContact(Record record){
        if (!findContact(record.getName())){
            list.add(record);
        }else {
            System.out.println("Record Already exist");
        }
        return record;
    }

    public boolean findContact(String name){
        for (Record phone: list) {
            if (phone.getName().equals(name)) {
                System.out.println(phone);
                return true;
            }
        }
        return false;
    }

    public String deleteContact(String name){
        Record delete = null;
        for (Record eliminate: list) {
            if (eliminate.getName() == null){
                System.out.println("Invalid contact");
            }else {
                list.remove(null);
                System.out.println("Successfully deleted");
            }
        }
        return name;
    }

    public Record findRecord(String name){
        for (Record find : list){
            if (find.getName().equals(name)){
                return find;
            }
        }
        return null;
    }

    public String updateContact(String name, Scanner input){
        if (findContact(name)) {
            Record rec = findRecord(name);
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
            rec.setName(comName);
            rec.setAddress(add);
            rec.setTelephone(num);
            rec.setEmail(mail);
        }

        System.out.println("Record updated successfully");
        //else //System.out.println("Record Not Found");
        return name;
    }

    public boolean display(){
        if (list.isEmpty()){
            System.out.println("The list has no records");
            return true;
        }else {
            for (Record rec: list) {
                System.out.println(rec.toString());
            }
        }
        return false;
    }

    public void menu(){
        System.out.println("MENU\n" +
                "\t1. Add contact\n" +
                "\t2. delete contact\n" +
                "\t3. update contact\n" +
                "\t4. search contact\n" +
                "\t5. display contacts\n" +
                "\t99. exit program\n" +
                "\tEnter your selection.");
    }
}
