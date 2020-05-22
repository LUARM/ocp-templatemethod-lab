package lab.assignment.afterrefactoring.clientcode;
import lab.assignment.afterrefactoring.CapuccinoMaker;
import lab.assignment.afterrefactoring.MochaMaker;
import lab.assignment.afterrefactoring.AmericanoMaker;
import lab.assignment.afterrefactoring.CoffeeMaker;

public class CoffeeClient {

    public static void main(String[] args) {

        CoffeeMaker starbuzz = new MochaMaker();
        starbuzz.makeCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoMaker();
        starbuzz.makeCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoMaker();
        starbuzz.makeCoffee();

    }

}