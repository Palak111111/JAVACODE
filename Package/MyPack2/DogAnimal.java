package MyPack2;
import MyPack1.Animal;
	public class DogAnimal extends Animal
	{
		String quality;
		public DogAnimal()
		{
		
		}
		 public DogAnimal(String breed,String nutrition,String colour,double weight,String quality)
		 {
		   super(breed,nutrition,colour,weight);
		   this.quality=quality;
		 }
		 
		 public String qualityD()
		 {
		  return quality;
		 }
	
	}