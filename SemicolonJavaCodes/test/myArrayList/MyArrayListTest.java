package myArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {
	private MyArrayList myArrayList;

	@BeforeEach
	public void atSetUp(){
		myArrayList = new MyArrayList();
	}

	@Test
	public void addElementTest(){
		myArrayList.add("34");
		myArrayList.add("33");
		myArrayList.set(0,"45");
		assertEquals("45", myArrayList.get(0));
		assertEquals("33",myArrayList.get(1));
		assertEquals(2, myArrayList.size());
		myArrayList.remove("33");
		assertEquals(1, myArrayList.size());
	}

	@Test
	public void addAllTest(){
		myArrayList.add("apple");
		myArrayList.add("banana");

		MyArrayList arrayList = new MyArrayList();
		arrayList.add("orange");
		arrayList.add("mango");

		myArrayList.addAll(arrayList);
		assertEquals(4, myArrayList.size());

	}

}