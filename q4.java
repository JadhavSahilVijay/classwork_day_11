package classwork_day_11;
class Person{
	private String name;
	private int age;
	private String country;
	public void getName() {
		System.out.println(" name is : "+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getAge() {
		System.out.println(" Age is : "+age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getCountry() {
		System.out.println(" Country is : "+country);
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
public class q4 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Sahil");
		p.setAge(20);
		p.setCountry("India");
		p.getName();
		p.getAge();
		p.getCountry();
	}

}
