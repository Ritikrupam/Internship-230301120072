package ConstructorInjection;

public class Student {
	private int Id;
	private String Name;
	private String Address;
	public Student(int id, String name, String address) {
		super();
		Id = id;
		Name = name;
		Address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
	}
}
