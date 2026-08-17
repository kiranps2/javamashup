package helloworld;

public class CW8 {
	interface Animal{
		public void makeSound();
		public void move();
	}
	static class bird implements Animal{
		public void makeSound() {
			System.out.println("Chirp");		
			}
		public void move() {
			System.out.println("fly");
		}
	}
	static class dog implements Animal{
		public void makeSound() {
			System.out.println("Bark");		
			}
		public void move() {
			System.out.println("Run");
		}
	}
	public class Zoo{
		
	public static void main(String[] args) {
		
			bird b=new bird();
			dog d=new dog();
			b.makeSound();
			b.move();
			d.makeSound();
			d.move();
		}
	}

}
