import java.util.ArrayList;
import java.util.Scanner;

public class listEmployee {
	private ArrayList<employee> list = new ArrayList<employee>();
	
	public void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Choose 1 to create Lecturer, 2 to create officer, any to exit");
			int check = Integer.parseInt(scanner.nextLine());
			if(check == 1) {
				lecturer newLecturer = new lecturer();
				newLecturer.add(scanner);
			
                System.out.println("Do you want to continue creating lecturer (Y/N)?:");
                String checkString = scanner.nextLine();
                if(checkString.equals("n") || checkString.equals("N")) {
                	System.out.println("..");
                }else if (checkString.equals("y") || checkString.equals("Y")) {
                	boolean duplicate = false;
                	for(employee item : list) {
                		if(newLecturer.id.equalsIgnoreCase(item.id)) {
                			duplicate = true;
                			break;
                		}
                	}
                	if(!duplicate) {
                		list.add(newLecturer);
                	}
                	else {
						System.out.println("ID duplicate !");
					}
				}
			}
			else if(check == 2){
				officer newOfficer = new officer();
				newOfficer.add(scanner);
				
				System.out.println("Do you want to continue creating lecturer (Y/N)?:");
                String checkString = scanner.nextLine();
                if(checkString.equals("n") || checkString.equals("N")) {
                	
                }else if (checkString.equals("y") || checkString.equals("Y")) {
                	boolean duplicate = false;
                	for(employee item : list) {
                		if(newOfficer.id.equals(item.id)) {
                			duplicate = true;
                			break;
                		}
                	}
                	if(!duplicate) {
                		list.add(newOfficer);
                	}
                	else {
						System.out.println("ID duplicate !");
					}
				}
			}
			else {
				break;
			}
		} while (true);
		
	}

	public void showList() {
		System.out.println("\n========= LECTURER =========");
		for(employee item : list) {
			if(item instanceof lecturer) {
				((lecturer)item).show();
				System.out.println("\n");
			}
		}
		System.out.println("\n========= OFFICER =========");
		for(employee item : list) {
			if(item instanceof officer) {
				((officer)item).show();
				System.out.println("\n");
			}
		}
	}
	
	public void showHighestSalary() {
		if(list.size() > 0) {
			employee maxSalaryEmployee = list.get(0);
			for(int i = 1; i < list.size(); i++) {
				if(maxSalaryEmployee.totalSalary() < list.get(i).totalSalary()) {
					maxSalaryEmployee = list.get(i);
				}
			}
			if(maxSalaryEmployee instanceof lecturer) {
				((lecturer)maxSalaryEmployee).show();
				System.out.println(" | " + maxSalaryEmployee.totalSalary());
			}else {
				((officer)maxSalaryEmployee).show();
				System.out.println(" | " + maxSalaryEmployee.totalSalary());
			}
		}
		else {
			System.out.println("Employee empty !");
		}
	}
	
	public void deleteById() {
		System.out.println("\n========= DELETE =========");
		System.out.print("Enter employee ID to delete: ");
		Scanner scanner = new Scanner(System.in);
		String idDelete = scanner.nextLine();
		for(employee item : list) {
			if(item.id.equalsIgnoreCase(idDelete)) {
				list.remove(item);
				System.out.println("Remove success !");
				break;
			}
		}
	}
}






