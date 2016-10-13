package _003_zoo;

import java.util.ArrayList;

/**
 * Created by jacobwilliams on 10/12/16.
 */
public class Employee extends Person {
//    static ArrayList<String> list = new ArrayList<>();
    private static int IDnum;

    public Employee(String n, String g,int id) {
        super(n, g);
        IDnum=id;

    }
    public static int getIDnum(){
        System.out.println("Please Enter the Employees ID number");
        IDnum = scanner.nextInt();
        return IDnum;
    }
    public String displayPersonInfo(){
        String empInfo = super.displayPersonInfo() + "Id number: " + IDnum + "\n";
        return empInfo;
    }
    public static void addEmployee() {

        Employee e1 = new Employee(getName(), getGender(), getIDnum());
        listOfPeople.add("Employee:"+"\n"+e1.displayPersonInfo());
        System.out.println("Employee:"+"\n"+e1.displayPersonInfo());
    }
}

