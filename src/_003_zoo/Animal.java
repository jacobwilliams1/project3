package _003_zoo;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Created by jacobwilliams on 10/11/16.
 */
public class Animal {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static String species;
    static String name;
    static int choice;
    public Animal(String n, String s) {
        name = n;
        species = s;
    }
    public static void pickAnimal(){
        System.out.println("What kind of animal would you like to add to the Zoo Management System?");
        System.out.println("[1]Giant Panda");
        System.out.println("[2]Lion");
        System.out.println("[3]Eagle");
        System.out.println("[4]Any other animal");
        choice = scanner.nextInt();
        switch(choice){
            case 1:GiantPanda.addGiantPanda();
                break;
            case 2:Lion.addLion();
                break;
            case 3:Eagle.addEagle();
                break;
            case 4:addAnimal();
                break;


        }

    }
    public static void addAnimal(){

        Animal a1 = new Animal (getName(),getSpecies());
        list.add(a1.displayAnimalInfo());
        System.out.println(a1.displayAnimalInfo());
    }
    public static String getName(){
        System.out.println("Please Enter the new Animals name");
        name = scanner.next();
        return name;

    }
    public static String getSpecies(){
        System.out.println("Please Enter the new Animals species");
        species = scanner.next();
        return species;

    }
    public static void display(){
        for (String item : list){
            System.out.println(item);
        }
    }
    public String displayAnimalInfo(){
        return "Name: " + name + "\n" +
                "Species: " + species+"\n";
    }

}
