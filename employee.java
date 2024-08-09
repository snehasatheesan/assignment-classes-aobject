2. Create an Employee DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers. Maintain encapsulation by giving controlled access to employee's PII.

package classes;

public class employee {
      private String name;
	    private int empId;
	    private float salary;
	    static int empNum=0;
	    {
	        empNum++;
	    }
	    public void Name(String name) {
	        this.name = name;
	    }
	    public  void EmpId(int empId) {
	        this.empId=empId;
	    }
	    public void Salary(float salary) {
	        this.salary = salary;
	    }


	    public String getName() {
	        return name;
	    }

	    public float getSalary() {
	        return salary;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public static int getEmpNum() {
	        return empNum;
	    }
	}


