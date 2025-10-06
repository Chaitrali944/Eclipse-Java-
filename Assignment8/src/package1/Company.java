package package1;

class Employee{
	int empId;
	String name;
	Employee(int empId,String name){
		this.empId=empId;
		this.name=name;
	}
}
class Manager extends Employee{
	int salary;
	Manager(int empId,String name,int salary){
		super(empId,name);
		this.salary=salary;
	}
}
class SalesManager extends Manager{
	int comission;
	SalesManager(int empId,String name,int salary,int comission){
		super(empId,name,salary);
		this.comission=comission;
	}
}
public class Company {
	public static void main(String[] args) {
		SalesManager sm= new SalesManager(1,"Ganesh",50000,25000);
		System.out.println("Emp Id:"+ sm.empId);
		System.out.println("Emp Name :"+ sm.name);
		System.out.println("Salary :"+ sm.salary);
		System.out.println("commision :"+ sm.comission);
		}
}
