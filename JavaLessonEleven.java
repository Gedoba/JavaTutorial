package JavaTutorial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonEleven{
	
	public static void main(String[] args){
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John Smith");
		names.add("Olivier Piotrowski");
		names.add("Tomek Nawrocki");
		
		names.add(2, "Jack Ryan");
		names.set(0, "John Adams");
		
		names.remove(3);
		
		for(int i=0; i<names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		//names.removeRange(0, 1);
		
		System.out.println(names);
		
		for(String i : names)
		{
			
			System.out.println(i);
		}
		
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext())
		{
			
			System.out.println(indivItems.next());
			
			
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		String paulYoung = "Paul Young";
		
		names.add(paulYoung);
		
		if(names.contains(paulYoung))
		{
			System.out.println("Paul is here");
		}
		
		if (names.containsAll(nameCopy))
		{
			System.out.println("Everything in nameCopy is in names");
		}
		
		names.clear();
		
		if(names.isEmpty())
		{
			System.out.println("ArrayList is Empty");
		}
		
		Object[] moreNames = new Object [4];
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
		
		
	}
	
	
	
}