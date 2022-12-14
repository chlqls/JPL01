
public class Dog2 {
	
	private int size;
	private String name;
	
	public void bark() {
		System.out.println("Ruff! Ruff!");
	}
	
//	void bark() {
//		
//			if(size > 40)
//				System.out.println("Woof! Woof!");
//			else if(size > 20)
//				System.out.println("Ruff! Ruff!");
//			else
//				System.out.println("Yip! Yip!");
//	}
	
	public void run() {
		System.out.println(name + " is running");
	}
	
	public void setSize(int sz) {
		if(sz > 10)
			size = sz;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void tryToChange(int intSize) {
		System.out.println("\n === tryToChange() start ===");
		System.out.println("   Before Assign : intSize = " + intSize);
		
		intSize = this.size;
		
		System.out.println("   After Assign : intSize = " + intSize);
		System.out.println(" === tryToChange() end === \n");
		
	}
	
	public void tryToReplace(Dog2 otherDog) {
		System.out.println("\n === tryToReplace() start ===");
		System.out.println("   Before Assign otherDog run");
		otherDog.run();
		
		otherDog = this;
		
		System.out.println("   After Assign Assign otherDog run");
		otherDog.run();
		System.out.println(" === tryToReplace() end === \n");
	}
	
	public void change(Dog2 otherDog) {
		System.out.println("\n === change() start ===");
		System.out.println("   Before change otherDog run");
		otherDog.run();
		
		otherDog.name = this.name;
		otherDog.size = this.size;
		
		System.out.println("   After change otherDog run");
		otherDog.run();
		System.out.println(" === change() end === \n");
	}
	
	public Dog2 bornNewDog(Dog2 father)  {
		System.out.println("\n === bornNewDog() start ===");
		Dog2 babyDog = new Dog2();
		
		String babyName = father.getName() + "_" + this.name + "_Baby";
		int babySize = 10;
		
		babyDog.setName(babyName);
		babyDog.setSize(babySize);
		
		babyDog.run();
		babyDog.bark();
		System.out.println(" === bornNewDog() end === \n");
		
		return (babyDog);
	}
	
	
}
