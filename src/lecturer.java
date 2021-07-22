import java.util.Scanner;

public class lecturer extends employee{
	private float hoursAllowance;
	public lecturer(String id, String name, long phone, String email, double coefficientSalary, float hoursAllowance) {
		super(id, name, phone, email, coefficientSalary, true);
		this.hoursAllowance = hoursAllowance;
	}

	public lecturer() {
		
	}

	public float getHoursAllowance() {
		return hoursAllowance;
	}

	public void setHoursAllowance(float hoursAllowance) {
		this.hoursAllowance = hoursAllowance;
	}

	
	public void add(Scanner scanner) {
		super.add(scanner);
        System.out.print("Enter employee teaching hours allowance");
        this.hoursAllowance = scanner.nextFloat();
        this.check = true;
        scanner.nextLine();
	}
	
	public void show() {
		super.show();
		System.out.print(" | " + hoursAllowance);
	}
	
	public long totalSalary() {
		return (long) (coefficientSalary* 1650000 + hoursAllowance);
	}
	
}
