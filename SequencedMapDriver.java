import java.util.SequencedMap;
import java.util.TreeMap;
import java.util.Set;

class SequencedMapDriver{
	public static void main(String a[]){
		SequencedMap<Integer,String> seqMap=new TreeMap<>();
		System.out.println();
		seqMap.put(1,"One"); seqMap.put(2,"Two"); seqMap.put(3,"Three"); seqMap.put(4,"Four"); seqMap.put(5,"Five");
		System.out.println(seqMap); //Original map
		System.out.println("First Entry: "+seqMap.firstEntry()); //1=one: Returns first entry
		System.out.println("Last Entry: "+seqMap.lastEntry()); //5=Five: Returns last entry
		System.out.println();
		Set<Integer> set= seqMap.sequencedKeySet(); //Returns keyset
		System.out.println("Key set: "+set); //[1, 2, 3, 4, 5]
		System.out.println("Values: "+seqMap.sequencedValues()); //[One, Two, Three, Four, Five]: Returns values
		Set entrySet=seqMap.sequencedEntrySet(); // Returns entries in set view
		System.out.println("Entry set: "+entrySet); //[1=One, 2=Two, 3=Three, 4=Four, 5=Five]
		System.out.println();
		System.out.println("Remove first entry: "+seqMap.pollFirstEntry()); //1=One: Removes and return first entry
		System.out.println("Remove last entry: "+seqMap.pollLastEntry()); //5=Five: Removes and returns last entry
		System.out.println();
		System.out.println("Final map: ");
		System.out.println(seqMap);
	}
 
}