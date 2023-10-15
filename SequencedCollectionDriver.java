import java.util.SequencedCollection;
import java.util.ArrayList;

class SequencedCollectionDriver{
	public static void main(String[] ar){

		SequencedCollection<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println("Initial List");
		System.out.println(list);
		System.out.println();
		System.out.println("Adding a first element: ");
		list.addFirst(10);
		System.out.println(list);
		System.out.println();
		System.out.println("Adding a last element: ");
		list.addLast(3);
		System.out.println(list);
		System.out.println();
		System.out.println("Get first element from the list: "+list.getFirst());
		System.out.println("Get last element from the list: "+list.getLast());
		System.out.println();
		System.out.println("Remove first element from the list: "+list.removeFirst());
		System.out.println("After removing first element: ");
		System.out.println(list);
		System.out.println();
		System.out.println("Remove last element from the list"+list.removeLast());
		System.out.println("After removing last element: ");
		System.out.println(list);

	}
}