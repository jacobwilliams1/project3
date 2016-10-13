package _003_zoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jacobwilliams on 10/12/16.
 */
public class Visitor extends Person {
//    static ArrayList<String> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    private static int giftShopCredits;

    public Visitor(String n, String g,int cred) {
        super(n, g);
        giftShopCredits = cred;
    }
    public static String getName1(){
        System.out.println("Please Enter the visitors name");
        scan.next();
        name = scan.nextLine();
        return name;

    }
    public static String getGender(){
        System.out.println("Please Enter the visitors gender");
        gender = scan.nextLine();
        return gender;

    }
    public static int getGiftShopCredits(){
        System.out.println("Please Enter the Visitors amount of Gift Shop Credits");
        giftShopCredits = scan.nextInt();
        return giftShopCredits;
    }
    public String displayPersonInfo(){
        String visInfo = super.displayPersonInfo() + "Gift Shop Credits: " + giftShopCredits + "\n";
        return visInfo;
    }
    public static void addVisitor() {
        Visitor v1 = new Visitor(getName1(), getGender(), getGiftShopCredits());
        listOfPeople.add("Visitor:" +"\n"+v1.displayPersonInfo());
        System.out.println("Visitor:" +"\n"+v1.displayPersonInfo());
    }
}
