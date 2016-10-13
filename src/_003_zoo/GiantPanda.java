package _003_zoo;
import java.util.Scanner;
/**
 * Created by jacobwilliams on 10/13/16.
 */
public class GiantPanda extends Animal {
    static Scanner scanner = new Scanner(System.in);
    private static int weight;
    public GiantPanda(String n, String s,int w) {
        super(n, s);
        weight = w;
    }
    public static String getName(){
        System.out.println("Please Enter the Giant Pandas name");
        name = scanner.next();
        return name;

    }
    public static int getWeight(){
        System.out.println("How much does the Giant Panda weigh?");
        weight = scanner.nextInt();
        return weight;
    }
    public String displayAnimalInfo(){
        String gPInfo = super.displayAnimalInfo() + "Weight: " + weight + "\n";
        return gPInfo;
    }
    public static void addGiantPanda(){
        GiantPanda g1 = new GiantPanda (getName(),"Giant Panda",getWeight());
        list.add("Animal:"+"\n"+g1.displayAnimalInfo()+"Exhibit"+Exhibit.PANDA.s);
        System.out.println("Animal:"+"\n"+g1.displayAnimalInfo()+"Exhibit: "+Exhibit.PANDA.s);
    }
}
