package java_classes;

public class Professor extends Employee{ //sub class Professor with super class Employee
	Course []course;
	Exam []exam;
	Professor(String name,int eID,int deptID){
		super(name,deptID);
		this.course=new Course[0];
		this.exam=new Exam[0];
		}
	public void addNewCourse(String name, int cap,String ersteF,int maxValue) {
		Course example= new Course(name,cap);
		Exam ersteKlausur=new Exam(example,ersteF,maxValue);
		example.addExam(ersteKlausur);       /* one-to-many Association with 1..* multiplicity as the many side(Course has Exam) 
		                                     Jeder Course hat bei Erstellung ein Exam, es können aber noch weitere hinzugefügt werden (vgl Course addExam)*/
		
		courseHinzufuegen(example);         /*one-to-many Association with 0..* multiplicity as the many side (Professor manages Course)
	                                         Da der Professor keinen Course haben muss, jedoch jeder Course bei der Erstellung einen Professor zugewiesen bekommt*/
		examHinzufuegen(ersteKlausur); 
	}
	public void courseHinzufuegen(Course course) {
		Course[]uebergangs=new Course[this.course.length+1];
	    for(int counter=0;counter<this.course.length;counter++) {
			uebergangs[counter]=this.course[counter];
		}
		uebergangs[this.course.length]=course;
		this.course=uebergangs;
		
	}
	public void examHinzufuegen(Exam exam) { /*many-to-many Association with 0..* multiplicity on both sides(Professor manages Exam)
	                                          Ein Professor muss kein Exam zugewiesen haben und jedes Exam kann mehreren Professoren zugewiesen werden*/
		Exam[]uebergang=new Exam[this.exam.length+1];
	    for(int counter=0;counter<this.exam.length;counter++) {
			uebergang[counter]=this.exam[counter];
		}
		uebergang[this.exam.length]=exam;
		this.exam=uebergang;
		
	}
}
