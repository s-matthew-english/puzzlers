class Dog {
	private static int woofCounter;
	public Dog() {}
	public static int woofCount() {return woofCounter;}
	public void woof() {woofCounter++;}
}
class Cat {
	private static int meowCounter;
	public Cat() {}
	public static int meowCount() {return meowCounter;}
	public void meow() {meowCounter++;}
}
public class RuckusRedux {
	public static void main(String... args) {
		Dog[] dogs = {new Dog(), new Dog()};
		for(int i = 0; i < dogs.length; i++) {
			dogs[i].woof();
		}
		Cat[] cats = {new Cat(), new Cat(), new Cat()};
		for(int i = 0; i < cats.length; i++) {
			cats[i].meow();
		}
		System.out.println(Dog.woofCount() + " woofs, ");
		System.out.println(Cat.meowCount() + " meows");
	}
}