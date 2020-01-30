import java.util.*;


public class Zoo {
	
	public static void main(String[] args) {
		
		//Create a list that will contain all animals
		ArrayList<Animals> allAnimals = new ArrayList<Animals>(16);
		
		//Declare animals and add them to the list
		Animals r1 = new Rhino("raakel");
		Animals r2 = new Rhino("raini");
		allAnimals.add(r1);
		allAnimals.add(r2);
		
		Animals h1 = new Hippo("henry");
		Animals h2 = new Hippo("hector");
		allAnimals.add(h1);
		allAnimals.add(h2);
		
		Animals e1 = new Elephant("ezra");
		Animals e2 = new Elephant("evan");
		allAnimals.add(e1);
		allAnimals.add(e2);
		
		Animals t1 = new Tiger("theodore");
		Animals t2 = new Tiger("tucker");
		allAnimals.add(t1);
		allAnimals.add(t2);
		
		Animals l1 = new Lion("liam");
		Animals l2 = new Lion("leo");
		allAnimals.add(l1);
		allAnimals.add(l2);
		
		Animals c1 = new Cat("caleb");
		Animals c2 = new Cat("chase");
		allAnimals.add(c1);
		allAnimals.add(c2);
		
		Animals w1 = new Wolf("wyatt");
		Animals w2 = new Wolf("wade");
		allAnimals.add(w1);
		allAnimals.add(w2);
		
		Animals d1 = new Dog("diego");
		Animals d2 = new Dog("declan");
		allAnimals.add(d1);
		allAnimals.add(d2);
		
		
		
		//Zookeeper object
		Zookeeper zoey = new Zookeeper();
		
		
		//Zoey is waking the animals
		zoey.wakeAnimals();
		
		//All animals are waking up
		for(int i=0; i<allAnimals.size();i++) {
			allAnimals.get(i).wakeUp();				//get(i) method gets the element i inside the array
		}
		
		//Zoey is rolling the call
		zoey.rollCall();
		
		for(int i=0; i<allAnimals.size();i++) {
			allAnimals.get(i).makeNoise();
		}
		
		//Zoey is feeding the animals
		zoey.feedAnimals();
		
		for(int i=0; i<allAnimals.size();i++) {
			allAnimals.get(i).eat();
		}
		
		//Zoey is giving the animals exercises
		zoey.exerciseAnimals();
		for(int i=0; i<allAnimals.size();i++) {
			allAnimals.get(i).roam();
		}
		
		//Zoey is shutting down the zoo and the animals should go to sleep
		zoey.shutDown();
		for(int i=0; i<allAnimals.size();i++) {
			allAnimals.get(i).sleep();
		}
	}

}
