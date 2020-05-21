package Section4Problem2;

public class PackageDemo {

	public static void main(String args[]) {
		
		Person janitor = new Person("Vale Howard", "25 Norland St., Apt. 301");
		System.out.println(janitor);
		
		Student student = new Student("Brock Smith", "331 Warrior St.", "Computer Science", 2020, 2550.85); 
		System.out.println(student); 
		
		Staff professor = new Staff("Quinn Ryan", "881 Lucky St.", "Minton College", 45931.25);
		System.out.println(professor); 
		
	}
	
}
