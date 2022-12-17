package tV;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

	private Television television;
	@BeforeEach
	void setUp() {
		television = new Television();
	}

	@Test
	public void testThatTvIsOn(){
		assertTrue(television.isOn());
	}

	@Test
	public void testThatICanOffTv(){
		assertFalse(television.isOff());
	}

	@Test
	public void testThatiCanIncreaseChannel(){
		assertTrue(television.isOn());
		television.increaseChannel();
		assertEquals(1, television.getChannel());
	}

	@Test
	public void testThatICanDecreaseChannel(){
		assertTrue(television.isOn());
		television.increaseChannel();
		assertEquals(1, television.getChannel());
		television.setChannel(50);
		television.decreaseChannel();
		assertEquals(49,television.getChannel());
	}

	@Test
	public void testThatICanIncreaseVolume(){
		assertTrue(television.isOn());
		television.setVolumeLevel(99);
		television.increaseVolume();
		assertEquals(100, television.getVolumeLevel());
	}

	@Test
	public void testThatICanDecreaseVolume(){
		assertTrue(television.isOn());
		television.setVolumeLevel(99);
		television.increaseVolume();
		assertEquals(100, television.getVolumeLevel());
		television.setVolumeLevel(100);
		television.decreaseVolume();
		assertEquals(99, television.getVolumeLevel());
	}
}