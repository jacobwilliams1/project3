package _003_zoo;
import java.util.Scanner;
/**
 * Created by jacobwilliams on 10/12/16.
 */
public class Zoo {
   Scanner scanner = new Scanner(System.in);
    int choice;

        public void choiceMenu(){
            while(true){
                System.out.println("Welcome to the Zoo Management System");
                System.out.println("[1]Add a Visitor to the Zoo");
                System.out.println("[2]Add a Employee to the Zoo");
                System.out.println("[3]Add a Animal to the Zoo");
                System.out.println("[4]See a list of the people in the Zoo");
                System.out.println("[5]See a list of the Animals in the Zoo");
                System.out.println("[6]Save Exit the Zoo Management System");

        choice = scanner.nextInt();
        switch (choice) {
            case (1):
                Visitor.addVisitor();
                break;
            case (2):
                Employee.addEmployee();
                break;
            case (3):
                Animal.pickAnimal();
                break;
            case (4):Person.display();
                break;
            case (5):Animal.display();
                break;
            }
            if (choice==6)
                break;
        }
    }
}
