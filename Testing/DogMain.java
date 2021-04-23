public class DogMain 
{
	public static void main(String[]args)
	{
		int Stride1 = 0;
		int Stride2 = 0;
		
		Dog dog1 = new Dog(15, "Greyhound");
		Dog dog2 = new Dog(16, "Doberman");

		System.out.println(dog1);
		System.out.println(dog2);
		
		
		System.out.println("Dog 1 went " + dog1.distanceRan() + " feet.");
		Stride1 = dog1.returnStride();
		System.out.println("Dog 2 went " + dog2.distanceRan() + " feet.");
		Stride2 = dog2.returnStride();
		if(Stride1 < Stride2)
		{
			System.out.println("Dog 1 won, reaching 600 feet at stride #" + Stride1);
		}
		else
		{
			System.out.println("Dog 2 won, reaching 600 feet at stride #" + Stride2);
		}
		
		
	}
}
 