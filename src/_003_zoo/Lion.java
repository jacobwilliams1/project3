package _003_zoo;

import java.util.Scanner;

/**
 * Created by jacobwilliams on 10/13/16.
 */
public class Lion extends Animal {
    static Scanner scanner = new Scanner(System.in);
    private static String gender;
    public Lion(String n, String s,String g) {
        super(n, s);
        gender = g;
    }
    public static String getName(){
        System.out.println("Please Enter the Lions name");
        name = scanner.next();
        return name;

    }
    public static String getGender(){
        System.out.println("What is the Lions gender?");
        gender = scanner.next();
        return gender;
    }
    public String displayAnimalInfo(){
        String LInfo = super.displayAnimalInfo() + "Gender: " + gender + "\n";
        return LInfo;
    }
    public static void addLion(){
        Lion L1 = new  Lion (getName(),"Lion",getGender());
        list.add("Animal:"+"\n"+L1.displayAnimalInfo()+"Exhibit"+Exhibit.LION.s);
        System.out.println("Animal:"+"\n"+L1.displayAnimalInfo()+"Exhibit: "+Exhibit.LION.s);
    }
}
