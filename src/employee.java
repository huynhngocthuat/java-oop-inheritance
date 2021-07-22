import java.util.Scanner;

abstract class employee {
	protected String id;
	protected String name;
	protected long phone;
	protected String email;
	protected double coefficientSalary;
	protected boolean check;
	
	
	public employee() {
		
	}
	public employee(String id, String name, long phone, String email, double coefficientSalary, boolean check) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.coefficientSalary = coefficientSalary;
		this.check = check;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCoefficientSalary() {
		return coefficientSalary;
	}
	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}
	
	public void add(Scanner scanner) {
		DataValidator dataValidator = new DataValidator();
		System.out.print("Enter employee ID");
        this.id = scanner.nextLine();
        System.out.print("Enter employee name");
        this.name = scanner.nextLine();
        do {
        	System.out.print("Enter employee phone");
            String phoneString = scanner.nextLine();
            this.phone = Long.parseLong(phoneString);
            if(dataValidator.isPhone(phoneString)) {
            	break;
            }
            System.out.println("Phone number must be 10 numbers !");
		} while (true);
        
        do {
        	System.out.print("Enter employee email");
            this.email = scanner.nextLine();
            if(dataValidator.isEmail(this.email)) {
            	break;
            }
            System.out.println("Email inappropriate format !");
		} while (true);

        System.out.print("Enter employee ciefficients allowance");
        this.coefficientSalary = scanner.nextDouble();
        scanner.nextLine();
	}
	
	public void show() {
		System.out.print(id + " | " + name + " | " + phone + " | " + email + " | " + coefficientSalary);
	}
	
	abstract public long totalSalary();
}
