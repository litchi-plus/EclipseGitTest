package reflect;

public class persion implements myInterface {
	private String name;
	private int age;
	public int id;
	public void speak() {
		System.out.println("hello");
	}
	private void Sing() {
		System.out.println("You are beautiful");
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public persion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public persion() {
	}
	private persion(int age) {
		this.age = age;
	}
	public persion(String name) {
		this.name = name;
	}
	public static void staticmethod() {
		System.out.println("staticmethod...");
	}
	protected void protectesMethod() {
		System.out.println("protectedMethod...");
	}
	@Override
	public String toString() {
		return "persion [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	


}
