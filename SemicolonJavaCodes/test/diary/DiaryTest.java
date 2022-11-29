package diary;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void setUp(){
        diary = new Diary("password", "Martins");
    }


    @Test
    @DisplayName("Diary class")
    public void diaryExistTest(){
        assertNotNull(diary);
    }

    @Test
    @DisplayName("Locked")
    public void lockDiaryTest(){
        assertTrue(diary.isLocked());
    }

    @Test
    @DisplayName("Unlocked")
    public void lockedDiaryCanBeUnlocked(){
        assertTrue(diary.isLocked());
        diary.unLockWith("password");
        assertFalse(diary.isLocked());
    }
    @Test
    @DisplayName("Wrong password")
    public void wrongPasswordCannotUnlockItTest(){
        assertTrue(diary.isLocked());
        diary.unLockWith("wrongPassword");
        assertTrue(diary.isLocked());
    }

    @Test
    public void dairyCanBeUnlockedTest(){
        diary.unLockWith("password");
        assertFalse(diary.isLocked());

        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void happeingsCanBeAddedToTheDairy(){
        diary.unLockWith("password");
        assertFalse(diary.isLocked());

        diary.write("Hallelujah");
        assertEquals(1, diary.numberOfHappenings());
    }
}
