package Section6Problem2;

public class TestAnimal {
	
	public static void main(String args[]) {

		// Using subclasses
		Cat cat1 = new Cat();
		cat1.greeting(); 
		
		Dog dog1 = new Dog(); 
		dog1.greeting(); 
		
		BigDog bigDog1 = new BigDog();
		bigDog1.greeting(); 
		
		
		// Using polymorphism.  
		/**
		 * While the type of animal1, animal2, and animal3 are still Animal by type,
		 * they are treated as different animals.
		 */
		Animal animal1 = new Cat(); // Animal is currently a cat.  
		animal1.greeting(); 
		
		Animal animal2 = new Dog(); // Animal is currently a dog.  
		animal2.greeting(); 

		Animal animal3 = new BigDog(); // Animal is currently a big dog.  
		animal3.greeting();
		
		/** Cannot instantiate the object with abstract class.  */
		// Animal animal4 = new Animal();
		
		
		// Downcast
		/** Downcast animal2 (Animal) to dog2 (Dog).  */
		Dog dog2 = (Dog) animal2; 
		
		/** Downcast animal3 (Animal) to bigDog2 (BigDog).  */
		BigDog bigDog2 = (BigDog) animal3; 

		/**
		 * Downcast animal3 (Animal) to dog3 (Dog). Note that animal3 was treated as
		 * big dog and not dog before. However, Dog and BigDog are superclass and
		 * subclass, so animal3 can still be downcasted to Dog.  However, dog3 will 
		 * be treated as a BigDog object when it calls methods.  
		 */
		Dog dog3 = (Dog) animal3; 
		
		/** animal2 is dog, it cannot be downcast to cat, as they are not related.  */
		// Cat cat2 = (Cat) animal2; 
		
		/** dog2, a Dog object calls the greeting method, so it prints out woof.  */
		dog2.greeting(dog3); 

		/**
		 * dog3, a Dog object calls the greeting method. However, it's treated as BigDog
		 * because animal3 originally was Animal type but polymorphed to be treated as a
		 * BigDog object. So it prints out woow.
		 */
		dog3.greeting(dog2); 

		/** dog2, a Dog object calls the greeting method, so it prints out woof.  */
		dog2.greeting(bigDog2); 
		
		/** bigDog2, a BigDog object calls the greeting method, so it prints out woow.  */
		bigDog2.greeting(dog2); 
		
		/** bigDog2, a BigDog object calls the greeting method, so it prints out woow.  */
		bigDog2.greeting(bigDog1); 
	
	}
	
}
