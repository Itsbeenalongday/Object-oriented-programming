

public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Employee e = new Employee("kildong", "lee", "000-00-0000");

		System.out.println(e.earnings());
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getSocialSecurityNumber());
		*/
		SalariedEmployee salariedEmployee = new SalariedEmployee
				("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee
				("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee
				("Sue", "John", "333-33-3333", 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee
				("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());

		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());

		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());

		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
		
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		for(Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
		
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is : $%,.2f%n", employee.getBaseSalary());
			}
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		}
		for(int j=0; j<employees.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
			}
		System.out.println();
		Employee e = new Employee("kildong", "lee", "000-00-0000");
		System.out.println(e.earnings());
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getSocialSecurityNumber());
	}
	
}