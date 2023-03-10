package entity;

public class Student {

	private int id;
	private String surname;
	private String name;
	private String middlename;
	
	public Student() {

	}

	public Student(int id, String surname, String name, String middlename) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.middlename = middlename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", surname=" + surname + ", name=" + name + ", middlename=" + middlename + "]";
	}
	
}
