package phoneContact;

import electronicStore.Address;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class PhoneContactRecord {

    LinkedList<Record> list;

    public PhoneContactRecord() {
        list = new LinkedList<>();
    }

    public void addContact(Record record){
        if (!findContact(record.getName())){
            list.add(record);
        }else {
            System.out.println("Record Already exist");
        }
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

    public void deleteContact(String name){
        Record delete = null;
        for (Record eliminate: list) {
            if (!Objects.equals(eliminate.getName(), name)) {
                continue;
            }
            delete = eliminate;
        }if (delete == null) {
            System.out.println("Invalid contact input!");
        }else {
            list.remove(delete);
            System.out.println("Successfully deleted contact");
        }

    }

    public Record findRecord(String name){
        for (Record find : list){
            if (find.getName().equals(name)){
                return find;
            }
        }
        return null;
    }

    public void updateContact(String name, Scanner input){
        if (findContact(name)) {
            input(name, input);
        }
        else System.out.println("Record Not Found");

    }

    private void input(String name, Scanner input) {
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
        System.out.println("Record updated successfully");
    }

    public void display(){
        if (list.isEmpty()){
            System.out.println("The list has no records");
        }else {
            for (Record rec: list) {
                System.out.println(rec.toString());
            }
        }
    }

    public void menu(){
        System.out.println("""
                MENU
                \t1. Add contact
                \t2. delete contact
                \t3. update contact
                \t4. search contact
                \t5. display contacts
                \t99. exit program
                \tEnter your selection.""");
    }
}
