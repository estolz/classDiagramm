package java_classes;

public class Question {
	private static int count =0;
    String task;
    int maxValue;
    int q_id;
    Question(String task,int maxValue){
    	this.q_id=count++;
    	this.task=task;
    	this.maxValue=maxValue;
    	
    }
    public String getTask() 
        {return task;}
    public int getMaxValue() 
        {return maxValue;}
    public int getq_id() 
        {return q_id;}
  
}
