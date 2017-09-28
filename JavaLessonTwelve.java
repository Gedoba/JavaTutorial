package JavaTutorial;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class JavaLessonTwelve {
	
	public static void main (String []  args ){
		
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Tomek Nawrocki");
		names.add("Olivier Piotrowski");
		
		names.addLast("Nathan Martin");
		
		names.addFirst("Josh");
		
		names.add(0, "Noah");
		
		names.set(2,  "Paul");
		
		names.remove(4);
		names.remove("Noah");
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("\nFirst Index: " + names.get(0));
		System.out.println("\nFirst Index: " + names.getLast());
	
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println("\nnameCopy: " + nameCopy);
		
		if(names.contains("Noah"))
			System.out.println("\nNoahs Here");
		
		if(names.containsAll(nameCopy))
			System.out.println("\nCollection's the same");
		
		//System.out.println("\nJosh's Index: " + names.indexOf("Josh"));
		//System.out.println("\nList Empty " + names.isEmpty());
		//System.out.println("\nHow many: " + names.size());
		//System.out.println("\nLook without Error: " + names.peek());
		//System.out.println("\nRemove first element: " + nameCopy.poll());
		//System.out.println("\nRemove first element: " + nameCopy.pollLast());
		
		nameCopy.push("Noah");
		nameCopy.pop();
		
		for(String name: nameCopy)
		{
			System.out.println(name);
		}
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		
		
	}
	
}