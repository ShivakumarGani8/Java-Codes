import java.util.SequencedSet;
import java.util.LinkedHashSet;

class SequencedSetDriver{
	public static void main(String[] args){
		SequencedSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10); set.add(9); set.add(11); set.add(3); set.add(3); set.add(22);
		
		System.out.println("Initial Set");
		System.out.println(set); //[10, 9, 11, 3, 22]
		System.out.println();
		System.out.println("Adding first & last elements: ");
		set.addFirst(18);//Method adds element as a first element to the set
		set.addLast(67);//Method adds element as a last element to the set
		System.out.println(set);//[18, 10, 9, 11, 3, 22, 67]
		System.out.println();
		System.out.println("Removing last & first elements: ");
		set.removeLast();//Method removes last element from the set
		set.removeFirst();////Method removes first element from the set
		set.removeLast();
		System.out.println(set);//[10, 9, 11, 3]
		System.out.println();
		System.out.println("First element in the set: "+set.getFirst()+"   Last element: "+set.getLast());

		System.out.println("Prints set in reverse order: ");//Not going to reverse the set permanently
		System.out.println(set.reversed());//[5, 4, 3, 2, 1]
		System.out.println();

		System.out.println("Original set: "+set);//[5, 4, 3, 2, 1]
	}
}