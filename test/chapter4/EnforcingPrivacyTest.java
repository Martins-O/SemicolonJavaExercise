package chapter4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EnforcingPrivacyTest {
    private EnforcingPrivacy enforcingPrivacy;

    @BeforeEach
    public void setUp(){

    }

    @Test
    public void encrypt(){
        String encryptedCode = EnforcingPrivacy.encrypt(4132);
        String expected = "0918";
        assertEquals(expected,encryptedCode);


    }

}