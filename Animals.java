package animal_model;

public class Animals {
	
	public String name;
	public int age;
	public String specises;
	public static int totalCount = 0;
	
	public void display(){
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Species : " + specises + "\n");
	}
}
