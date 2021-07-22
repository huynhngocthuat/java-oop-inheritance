import java.util.Scanner;

public class main {
	
	public static int menu(){
        System.out.println("\n========= WELCOME TO EMPLOYEE MANAGEMENT =========");
        System.out.println("\t1. Create ");
        System.out.println("\t2. View all employee infomation");
        System.out.println("\t3. View the employee's information hs the highest total salary");
        System.out.println("\t4. Delete employee by ID");
        System.out.println("\t5. Update employee by ID");
        System.out.println("\t6. Exit");
        Scanner sc = new Scanner(System.in);
        do{
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice<1 || choice>6){
                System.out.print("Invalid. Enter again: ");
            } else return choice;
        } while(true);    
    }
	
	public static void main(String[] args) {
		listEmployee dataEmployee = new listEmployee();
        int choice;
        do {
            choice = menu();
            switch(choice){
                case 1:{ 
                	dataEmployee.addEmployee();
                	break;
                }                
                case 2:{
                    dataEmployee.showList();
                    break;
                }
                case 3:{
                    dataEmployee.showHighestSalary();
                    break;
                }
                case 4:{
                	dataEmployee.deleteById();
                	break;
                }
                case 5:{
                	dataEmployee.update();
                	break;
                }
                case 6:{
                    System.exit(0);
                }
            }
       } while (true);

    }
}
