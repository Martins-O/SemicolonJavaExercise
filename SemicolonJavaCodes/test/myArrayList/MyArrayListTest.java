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
		myArrayList.add("45");
		myArrayList.add("55");
		myArrayList.add("12");
		myArrayList.add("");
		myArrayList.add("");
		myArrayList.add("");
		myArrayList.add("");
		myArrayList.add("");
		myArrayList.add("");
		myArrayList.set(0,"45");
		assertEquals("45", myArrayList.get(0));
		assertEquals("33",myArrayList.get(1));
		assertEquals(11, myArrayList.size());
		myArrayList.remove("33");
		assertEquals(1, myArrayList.size());
	}

	@Test
	public void addAllTest(){
		MyArrayList myArrayList1 = new MyArrayList();

		myArrayList1.add("apple");
		myArrayList1.add("banana");

		MyArrayList arrayList = new MyArrayList();
		arrayList.add("orange");
		arrayList.add("mango");

		int size = MyArrayList.addAll(myArrayList1, arrayList);
		assertEquals(4, size);

	}

}