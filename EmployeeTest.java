public class EmployeeTest
{

public static void main(String args[]){
    Employee []staff = new Employee[3];

    staff[0] = new Employee("Hilal", 100.5);
    staff[1] = new Employee("Usaib", 200.2);
    staff[2] = new Employee("Tufail", 300.8);

	for(Employee e: staff){
	   System.out.println("Name " + e.getName() +" Salary " + e.getSalary() + "\n");
	}
     }
}