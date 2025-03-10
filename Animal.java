package mainProject;

public class Animal {

	// Animal Class attributes (needs implementation of 
	
	public String animalName;
	
	private String species;
	
	private int age;
	
	// Creating a static attribute that belongs to the Animal class.
	
	public static int numOfAnimals = 0;
	
	// Animal class constructors.
	
	public Animal(String name, String aSpecies, int anAge) {
		System.out.println("\n A new Animal object was created.\n");
		
		// Creating initial values for the class attributes.
		animalName = name;
		species = aSpecies;
		age = anAge;
		numOfAnimals++;
	}
	
	public Animal() {
		System.out.println("\n A new Animal object was created.\n");
		numOfAnimals++;
	}
	
	// Getters and Setters for each attribute
	public String getName() {
		return animalName;
	}
	
	public void setName(String name) {
		this.animalName = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void getSpecies(String species) {
		this.species = species;
	}
	
	
}


