package java_classes;

public class Exam {
    int max_value;
    Course[]course;
    Question[]question;
    private static int questions=1;
        Exam(Course course,String ersteF, int maxValue){
        	this.course=new Course[1];
        	this.course[0]=course;
        	this.question=new Question[1];
        	Question Frageeins=new Question(ersteF,maxValue);
        	question[1]=Frageeins; 
        }
        public void setMaxValue(int max){
        	this.max_value=max;
        }
        public void addQuestion(String task,int maxValue) {    //composition; Question existiert nur im Zusammenhang mit Exam
        	Question Frage=new Question(task,maxValue);
        	questions++;
        	Question[]uebergan=new Question[questions];
    		for(int counter=0;counter<this.question.length;counter++) {
    			uebergan[counter]=this.question[counter];
    		}
    		uebergan[this.question.length]=Frage;
    		this.question=uebergan;
        	
        }
        public int getQuestionCount() {return question.length;}
}
