package Inheritance;

public class Programmer extends Employee{

	String ProLang;
	String projectName;
	int bonus;
	
	public static void main(String[] args) {
		Programmer P = new Programmer();
		P.fname = "Pawan";
		P.lname = "Thapa";
		P.age = 25;
		P.bonus = 25000;
		P.company = "SAGA";
		P.id = 115;
		P.projectName = "KIST Hospital";
		P.ProLang = "C,C++,JAVA,Python,JavaScript";
		P.salary = 250000;
		
		System.out.println(P);
		
		
	}

	@Override
	public String toString() {
		return "Programmer [ProLang=" + ProLang + ", projectName=" + projectName + ", bonus=" + bonus + ", id=" + id
				+ ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", salary=" + salary + ", company="
				+ company + "]";
	}
	
}
