package java_classes;

public class Employee {
	protected static int idcount=0;
    String name;
    int e_ID;
    int deptID;
    Employee(String name,int deptID){
    	this.name=name;
    	this.e_ID=idcount++;
    	this.deptID=deptID;
    }
    public String getName() 
        {return name;}
    public int getE_ID() 
        {return e_ID;}
    public int getDeptID() 
        {return deptID;}
}
