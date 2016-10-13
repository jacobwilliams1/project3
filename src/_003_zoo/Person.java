package _003_zoo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by jacobwilliams on 10/11/16.
 */
public class Person {
    static ArrayList<String> listOfPeople = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String name;
    static String gender;

    public Person(String n, String g) {
        name = n;
        gender = g;
    }
    public static void addPerson() {

        Person p1 = new Person(getName(), getGender());
        listOfPeople.add(p1.displayPersonInfo());
        System.out.println(p1.displayPersonInfo());
    }
    public static String getName(){
        System.out.println("Please Enter the new persons name");
        name = scanner.nextLine();
        return name;

    }
    public static String getGender(){
        System.out.println("Please Enter the new persons gender");
        gender = scanner.nextLine();
        return gender;

    }
    public static void display(){
        for (String item : listOfPeople){
            System.out.println(item);
        }
    }
    public String displayPersonInfo(){
        return "Name: " + name + "\n" +
                "Gender: " + gender+"\n";
    }
}
