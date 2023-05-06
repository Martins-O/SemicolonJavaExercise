//package phoneContact;
//
//import electronicStore.Address;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class RecordTest {
//
//    private Record record;
//    private PhoneContactRecord phoneContactRecord;
//
//    @BeforeEach
//    public void setUp(){
//        record = new Record();
//        phoneContactRecord = new PhoneContactRecord();
//        record.setName("Martins");
//        Address add = new Address("13", "Yaba", "Lagos", "Lagos", "Nigeria");
//        record.setAddress(add);
//        record.setTelephone("+2348146587069");
//        record.setEmail("Jojololamartins686@gmail.com");
//        record = new Record(record.getName(),record.getAddress(), record.getEmail(),record.getTelephone());
//    }
//
//    @Test
//    public void testThatCanAddContact(){
//        assertEquals(record, phoneContactRecord.addContact(record));
//    }
//
//    @Test
//    public void testThatCanDisplayContact(){
//        assertEquals(record, phoneContactRecord.display());
//    }
//
//    @Test
//    public void testThatCanUpdateContact(){
//        Scanner input = new Scanner(System.in);
//        String expected = phoneContactRecord.updateContact("seun", input );
//        assertEquals("seun",expected);
//    }
//
//    @Test
//    public void testThatCanDeleteContact(){
//        String expected = phoneContactRecord.deleteContact("Martins");
//        assertEquals(expected, expected);
//    }
//}