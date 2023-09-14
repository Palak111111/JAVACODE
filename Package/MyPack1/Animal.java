package MyPack1;
	public class Animal
	{
		String breed, nutrition,colour;
		double weight;
		public Animal()
		{
		
		}
		 public Animal(String breed,String nutrition,String colour,double weight)
		 {
		   this.breed=breed;
		   this.nutrition=nutrition;
		   this.colour=colour;
		   this.weight=weight;
		 }
		 
		 public String breed()
		 {
		  return breed;
		 }
          public String nutrition()
		 {
		  return nutrition;
		 }

		public String colour()
		 {
		  return colour;
		 }
		 public double weight()
		 {
		  return weight;
		 }


    }