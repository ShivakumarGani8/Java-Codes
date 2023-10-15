import java.util.SequencedCollection;
import java.util.ArrayList;

class SequencedCollectionDriver{
	public static void main(String[] ar){

		SequencedCollection<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println("Initial List");
		System.out.println(list); //[1, 2]
		System.out.println();
		System.out.println("Adding a first element: ");
		list.addFirst(10); // Method adds an element as a first element of the list
		System.out.println(list); //[10, 1, 2]
		System.out.println();
		System.out.println("Adding a last element: ");
		list.addLast(3); // Method adds an element as a last element of the list
		System.out.println(list); //[10, 1, 2, 3]
		System.out.println();
		System.out.println("Get first element from the list: "+list.getFirst()); //10: reads first element from the list
		System.out.println("Get last element from the list: "+list.getLast());//3: reads last element from the list
		System.out.println();
		System.out.println("Remove first element from the list: "+list.removeFirst());//10: removes and returns first element from the list
		System.out.println("After removing first element: ");
		System.out.println(list); //[1, 2, 3]
		System.out.println();
		System.out.println("Remove last element from the list"+list.removeLast());//3: removes and returns first element from the list
		System.out.println("After removing last element: ");
		System.out.println(list); //[1, 2]

	}
}