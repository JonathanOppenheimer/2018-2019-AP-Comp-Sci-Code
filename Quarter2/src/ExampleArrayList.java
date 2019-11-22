import java.util.ArrayList;

public class ExampleArrayList 
{
	public static void main(String[]args)
	{
		ArrayList <String> classroom = new ArrayList<String>(100);
		System.out.println(classroom);
		classroom.add("Jane");
		System.out.println(classroom);
		classroom.add("Amy");
		System.out.println(classroom);
		classroom.add("Katie O'Neil");
		System.out.println(classroom);
		classroom.remove(0);
		System.out.println(classroom);
		System.out.println(classroom.get(1));
		classroom.set(1, "Steve");
		System.out.println(classroom);
		System.out.println(classroom.size());
		classroom.add(1, "Tucker");
		System.out.println(classroom);
		classroom.clear();
		System.out.println(classroom);
		//int - data type
		//String - object 
		//Integer - object 
		ArrayList <Integer> nums = new ArrayList<Integer>(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		//enhanced for loop 
		//for-each loop
		for(int x : nums)
		{
			System.out.println(x);
		}
		
	}
}
