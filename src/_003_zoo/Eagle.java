package _003_zoo;

import java.util.Scanner;

/**
 * Created by jacobwilliams on 10/13/16.
 */
public class Eagle extends Animal {
    static Scanner scanner = new Scanner(System.in);
    private static int wingSpan;
    public Eagle(String n, String s,int wS) {
        super(n, s);
        wingSpan = wS;
    }
    public static String getName(){
        System.out.println("Please Enter the Eagles name");
        name = scanner.next();
        return name;

    }
    public static int getWingSpan(){
        System.out.println("What is the Eagles wing span in inches?");
        wingSpan = scanner.nextInt();
        return wingSpan;
    }
    public String displayAnimalInfo(){
        String gPInfo = super.displayAnimalInfo() + "Wing Span: " + wingSpan + " inches"+"\n";
        return gPInfo;
    }
    public static void addEagle(){
        Eagle eg1 = new Eagle (getName(),"Eagle",getWingSpan());
        list.add("Animal:"+"\n"+eg1.displayAnimalInfo()+"Exhibit"+Exhibit.EAGLE.s);
        System.out.println("Animal:"+"\n"+eg1.displayAnimalInfo()+"Exhibit: "+Exhibit.EAGLE.s);
    }
}
