package ObjectWithMethod;

public class test {
	public static void main(String[] args) {
		
		
		test t = new test();
		
		// t.printStudentData(s) ====>>> to print with object as paar
		
		//Student s = t.getData();
		//t.printStudentData(s);
		
		
		Student sdata[] = t.get3data();
		for(Student s : sdata) {
			 System.out.println("First Name: "+s.getFname());
			System.out.println("Last Name: "+s.getLname());
			System.out.println("Age: "+s.getAge());
			System.out.println("College: "+s.getCollege());
			System.out.println("City: "+s.getCity());
			
		System.out.println("================");
		}
		
		
		
		
	}
	
	// Object as parameter
	
	void printStudentData(Student s) {
		System.out.println("Id: "+s.getId());
		System.out.println("First Name: "+s.getFname());
		System.out.println("Last Name: "+s.getLname());
		System.out.println("Age: "+s.getAge());
		System.out.println("College: "+s.getCollege());
		System.out.println("City: "+s.getCity());
	}
	
	// Object as return type
	
	Student getData() {
		Student s = new Student();
		s.setId(115);
		s.setFname("Pawan");
		s.setLname("Thapa");
		s.setAge(25);
		s.setCollege("Trinity International College");
		s.setCity("Kathmandu");
		return s;
	}
	
	
	Student[] get3data() {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setId(100);
		s1.setAge(25);
		s1.setFname("Hari");
		s1.setLname("Thapa");
		s1.setCity("Syangja");
		s1.setCollege("TIA");
		
		s2.setId(101);
		s2.setAge(24);
		s2.setFname("Pawan");
		s2.setLname("Thapa");
		s2.setCity("KTM");
		s2.setCollege("TIC");
		
		s3.setId(102);
		s3.setAge(23);
		s3.setFname("Shanta");
		s3.setLname("Thapa");
		s3.setCity("BYRGR");
		s3.setCollege("TAC");
		
		Student sdata[] = new Student[3];
		sdata [0] = s1;
		sdata[1] = s2;
		sdata[2] = s3;
		
		return sdata;
		
		
	}
}
