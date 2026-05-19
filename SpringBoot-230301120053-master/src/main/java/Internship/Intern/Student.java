package Internship.Intern;

public class Student {
	private int Id;
	private String Name;
	private String Address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Student(int id, String name, String address) {
		super();
		this.Id = id;
		this.Name = name;
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + Id + ", name=" + Name + ", Address=" + Address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
