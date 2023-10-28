import java.util.Scanner;

class StudentDetails {
	private String name;
	private int age;
	private String education;
	private String position;
	private String location;
	private boolean martialStatus;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(boolean martialStatus) {
		this.martialStatus = martialStatus;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class StudentInfo extends StudentDetails {

	public void StuDetails() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter name: ");
		setName(ip.nextLine());

		System.out.print("Enter Age: ");
		setAge(ip.nextInt());
		ip.nextLine();

		System.out.print("Enter Education: ");
		setEducation(ip.nextLine());

		System.out.print("Enter Position: ");
		setPosition(ip.nextLine());

		System.out.print("Enter Location: ");
		setLocation(ip.nextLine());

		System.out.print("Enter Martial Status: ");
		setMartialStatus(ip.nextBoolean());

	}

	public void showDetails() {

		System.out.println("-------------------You Entered---------------------");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Education: " + getEducation());
		System.out.println("Position: " + getPosition());
		System.out.println("Location: " + getLocation());
		System.out.println("Martial Status: " + isMartialStatus());
	}
}

public class StudentInfoSystem {
	public static void main(String[] args) {

		StudentInfo obj = new StudentInfo();
		obj.StuDetails();
		obj.showDetails();

	}

}