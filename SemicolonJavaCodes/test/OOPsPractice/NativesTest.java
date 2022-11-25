package OOPsPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativesTest {

    @Test
    void nativesConstruction(){
        Human human = new Human();
        human.setFirstName("Martins");
        human.setEmailAddress("Martins@gmail.com");
        human.setPhoneNumber("53462423221");

        Natives mart = new Natives(human);
        assertEquals("Martins", mart.getFirstName());
        assertEquals("Martins@gmail.com", mart.getEmailAddress());
    }

}