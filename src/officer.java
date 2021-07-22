import java.util.Scanner;

public class officer extends employee{
	
	private String department;
	private float officeAllowance;
	
	public officer(String id, String name, long phone, String email, double coefficientSalary, String department, float officeAllowance) {
		super(id, name, phone, email, coefficientSalary, false);
		this.department = department;
		this.officeAllowance = officeAllowance;
	}
	
	public officer() {
		
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getOfficeAllowance() {
		return officeAllowance;
	}
	public void setOfficeAllowance(float officeAllowance) {
		this.officeAllowance = officeAllowance;	
	}
	
	
	public void add(Scanner scanner) {
		super.add(scanner);
		System.out.print("Enter employee department");
		this.department = scanner.nextLine();
        System.out.print("Enter office allowance");
        this.officeAllowance = scanner.nextFloat();
        this.check = false;
        scanner.nextLine();
	}
	
	public void show() {
		super.show();
		System.out.print(" | " + department + " | " + officeAllowance);
	}
	
	public long totalSalary() {
		return (long) (coefficientSalary* 1650000 + officeAllowance);
	}
	
}
