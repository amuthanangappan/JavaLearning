package myclass;

import java.awt.List;
import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		name.add("joy");
		name.add("kumar");
		name.add("ram");
		name.add("ravi");
		System.out.println(name.size());
		
		Iterator<String> itr = name.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		//while (itr.hasPrevious)
		
		

	}

}
