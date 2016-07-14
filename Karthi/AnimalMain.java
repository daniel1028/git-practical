

class AnimalEncap {
	public String animalName;
	public String animalType;
	public int height;
	public String color;

	public AnimalEncap(String animalName, String animalType) {
		this.animalName = animalName;
		this.animalType = animalType;
	}
}

class Animal {
	private String animalName;
	private String animalType;
	private int height;
	private String color;

	public Animal(String animalName, String animalType) {
		this.animalName = animalName;
		this.animalType = animalType;
	}

	public void hunt() {
		// implementation of hunt
	}

	public void run() {
		// implementation of run
	}

	public void mate() {
		// implementation of mate
	}

	// encapsulation is not about having getter/setters
	public String getAnimalName() {

		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class AnimalMain {
	public static void main(String args[]) {
		Animal animal = new Animal("Tiger", "Carnivores");
		//String animalNameVar = Animal.animalName;
		String animalName = animal.getAnimalName();
		AnimalEncap animal2 = new AnimalEncap("Lion", "Carnivores");
		String animalNameEncap = animal2.animalName;
		System.out.println("Animal Name using Encap : " + animalName);
		System.out.println("Animal Name not using Encap : " + animalNameEncap);
	}
}
