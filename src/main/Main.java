package main;

import model.Galaxy;
import model.Planet;
import model.Universe;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Planet earth = new Planet("Земля", 234, 1234);
        Planet mars = new Planet("Марс", 246, 1444);
        Planet wars = new Planet("Варс", 2466, 4344);
        Planet venera = new Planet("Венера", 2146, 2844);
        //System.out.println(earth.behavior());
        Planet[] planets = new Planet[]{earth, mars, wars, venera};
        //System.out.println(Arrays.toString(planets));
        Galaxy milk = new Galaxy("млечный путь");
        milk.add(earth);
        milk.add(mars);
        milk.add(wars);
        milk.add(venera);
        System.out.println(milk);
        System.out.println(milk.behavior());
        System.out.println(milk.search(venera));
        System.out.println(milk.search("Варс"));
        milk.delete("Марс");
        milk.delete(venera);
        System.out.println(milk);
        System.out.println(milk);
*/

        Universe universe = new Universe("Марвел");
        universe.behavior();
    }
}