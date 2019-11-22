public class Dog 
{
	private int stride;
	private String breed; 
	int keepStride;
	public Dog(int stride, String breed) 
	{
		this.stride = stride;
		this.breed = breed; 
	}
	public String toString()
	{
		return "Breed: " + breed + " Maximum stride: " + stride;
	}
	private int eachStride()
	{ 
		return (int)(Math.random()*stride+1); 
	}
	//run 100 strides
	public int distanceRan()
	{
		int totalDistance = 0;
		for(int i = 0; i<100; i++)
		{
			totalDistance = totalDistance + eachStride();
			if(totalDistance<600)
			{
				keepStride = i; 
			}
		}
		return totalDistance; 
	}
	public int returnStride()
	{
		return keepStride; 
	}
}
