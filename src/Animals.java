import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public abstract class Animals {
	
String name;		//All classes will have names

	// getClass().getSimpleName() is a method that returns the type of the object
	// Like Rhino or Tiger
	public void wakeUp() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " woke up");
	}
	public void makeNoise() {}
	public void eat() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is eating");
	}
	public void roam() {}
	public void sleep() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is sleeping");
	}
	
	// All classes will inherit these methods. Some of them will be overridden
	

}


class Pachyderm extends Animals{
	
	public void roam() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is jumping");
	}
	
		
}

class Rhino extends Pachyderm{
	
	//Constructor to initialize the name
	Rhino(String name){
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is growling");
	}
	
}

class Hippo extends Pachyderm{
	
	//Constructor to initialize the name
	Hippo(String name){
		this.name = name;
	}
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is grunting");
	}
	
}

class Elephant extends Pachyderm{
	
	//Constructor to initialize the name
	Elephant(String name){
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is trumpeting");
	}
}

class Feline extends Animals{
	
	public void roam() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is running around");
	}
}

class Tiger extends Feline{
	
	//Constructor to initialize the name
	Tiger(String name){
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is chuffing");
	}
}

class Lion extends Feline{
	
	//Constructor to initialize the name
	Lion(String name){
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is moaning");
	}
}

class Cat extends Feline{
	
	//Create a list of actions a cat might do instead of sleeping
	ArrayList<String> randomStuff = new ArrayList<String>(3);
	
	//Create a Random object from to give a random action
	Random r = new Random();
	
	//Constructor to initialize the name and the ArrayList
	Cat(String name){
		this.name = name;
		
		//Add random actions in a list
		randomStuff.add(this.name + " the " + this.getClass().getSimpleName() + " is sleeping");
		randomStuff.add(this.name + " the " + this.getClass().getSimpleName() + " is mewoing");
		randomStuff.add(this.name + " the " + this.getClass().getSimpleName() + " is running around");
	}
	 
	public void sleep() {
		//Picks a random action instead of sleep
		System.out.println(randomStuff.get(r.nextInt(randomStuff.size())));
	}
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is mewoing");
	}
}

class Canine extends Animals{
	
	public void roam() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is seeking something");
	}
}

class Wolf extends Canine{
	
	//Constructor to initialize the name
	Wolf(String name){
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is bark-howling");
	}
}

class Dog extends Canine{
	
	//Constructor to initialize the name
	Dog(String name){
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println(name + " the " + this.getClass().getSimpleName() + " is barking");
	}
}
