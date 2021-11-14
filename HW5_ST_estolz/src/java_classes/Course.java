package java_classes;

public class Course {
	private static int counter=0;
	String name;
	int id;
	int cap;
	String[] students;
	Exam[]exam;
	Course(String name,int cap){
		this.cap=cap;
		this.name=name;
		this.id=counter++;
		this.exam=new Exam[0];
	}
	public void addExam(Exam exam) {
		Exam[]uebergan=new Exam[this.exam.length];
		for(int counter=0;counter<this.exam.length;counter++) {
			uebergan[counter]=this.exam[counter];
		}
		uebergan[this.exam.length]=exam;
		this.exam=uebergan;
	}
	public String getName() 
	    {return name;}
	public int getID() 
	    {return id;}
	

}
