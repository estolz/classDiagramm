package java_classes;

public class Department {
	int dept_id;
    private static int zaehler=0;
    String name;
    Professor[]chair;
    Employee []employee;
    Department(String name,Professor chair){
    	dept_id=zaehler++;
    	this.name=name;
    	this.chair=new Professor[1];
    	this.chair[1]=chair;
    	this.employee=new Employee[0];
    	}
        public void newEmployee(String name) { // Aggregation: Employee ist bei Erstellung einem dept zugewiesen
        	Employee neu=new Employee(name,this.dept_id);
        	Employee[]uebergang=new Employee[this.employee.length];
    		for(int counter=0;counter<this.employee.length;counter++) {
    			uebergang[counter]=this.employee[counter];
    		}
    		uebergang[this.employee.length]=neu;
    		this.employee=uebergang;
    	}
        public String getName() 
            {return name;}
        public int getdept_ID() 
            {return dept_id;}
        }

