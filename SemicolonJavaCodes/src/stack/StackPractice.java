package stack;

import java.util.Iterator;
import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<>();
		list.add(34);
		list.push(23);
		list.add(25);
		list.add(2,45);
		System.out.println(list.size());
		System.out.println(list.stream().parallel());
		System.out.println(list.capacity());
		System.out.println(list.pop());
		System.out.println(list.search(1));
		System.out.println(list.peek());
		System.out.println(list.empty());
		System.out.println(list);
		//todo iterating using Iterator
		Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		//todo iterating using forEach
		System.out.println("for each");
		list.forEach(System.out :: println);
	}
}
