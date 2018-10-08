import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Assigning Intelligence, Agility, and Strength
        int INT = 21;
        int AGL = rand.nextInt(10)+10;
        int STR = 50 - (INT + AGL) ;

        int damageOutTrial1 = INT*5;
        //int damageOutTrial2 = INT*;


        // Random Modifier for each Turn
        float damMOD1 = rand.nextFloat() + (float)0.5;
        float damMOD2 = rand.nextFloat() + (float)0.5;
        float damMOD3 = rand.nextFloat() + (float)0.5;
        float damMOD4 = rand.nextFloat() + (float)0.5;
        float damMOD5 = rand.nextFloat() + (float)0.5;
        float damMOD6 = rand.nextFloat() + (float)0.5;
        float damMOD7 = rand.nextFloat() + (float)0.5;
        float damMOD8 = rand.nextFloat() + (float)0.5;
        float damMOD9 = rand.nextFloat() + (float)0.5;
        float damMOD10 = rand.nextFloat() + (float)0.5;

        // Actual Damage for each Turn
        float orcDam1 = damageOutTrial1*damMOD1;
        float orcDam2 = damageOutTrial1*damMOD2;
        float orcDam3 = damageOutTrial1*damMOD3;
        float orcDam4 = damageOutTrial1*damMOD4;
        float orcDam5 = damageOutTrial1*damMOD5;
        float orcDam6 = damageOutTrial1*damMOD6;
        float orcDam7 = damageOutTrial1*damMOD7;
        float orcDam8 = damageOutTrial1*damMOD8;
        float orcDam9 = damageOutTrial1*damMOD9;
        float orcDam10 = damageOutTrial1*damMOD10;

        // Total Orc Damage Taken
        float total = (orcDam1 + orcDam2 + orcDam3 + orcDam4 + orcDam5 + orcDam6 + orcDam7 + orcDam8 + orcDam9 + orcDam10);

        System.out.println("You have "+INT+" Intelligence.");
        System.out.println("You have "+AGL+" Agility.");
        System.out.println("You have "+STR+" Strength.");
        System.out.println("Total Damage to le Orc is " + total + ".");



        //Assigning Intelligence, Agility, and Strength
        int INT2 = 10;
        int AGL2 = rand.nextInt(10)+10;
        int STR2 = 50 - (INT2 + AGL2) ;

        // Modifier increased for Trial 2 - Static Modifier
        float damageOutTrial2 = (float)INT2*(float)10.43;

        // Actual Damage for each Turn
        float orcDam1B = damageOutTrial2*damMOD1;
        float orcDam2B = damageOutTrial2*damMOD2;
        float orcDam3B = damageOutTrial2*damMOD3;
        float orcDam4B = damageOutTrial2*damMOD4;
        float orcDam5B = damageOutTrial2*damMOD5;
        float orcDam6B = damageOutTrial2*damMOD6;
        float orcDam7B = damageOutTrial2*damMOD7;
        float orcDam8B = damageOutTrial2*damMOD8;
        float orcDam9B = damageOutTrial2*damMOD9;
        float orcDam10B = damageOutTrial2*damMOD10;

        // Total Orc Damage Taken
        float total2 = (orcDam1B + orcDam2B + orcDam3B + orcDam4B + orcDam5B + orcDam6B + orcDam7B + orcDam8B + orcDam9B + orcDam10B);

        System.out.println("You have "+INT2+" Intelligence.");
        System.out.println("You have "+AGL2+" Agility.");
        System.out.println("You have "+STR2+" Strength.");
        System.out.println("Total Damage to le Orc is " + total2 + ".");





    }
}
