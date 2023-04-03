package model;

import java.util.ArrayList;

public class Generator {
    private static Planet generatePlanet() {
        String name = "P" + Math.random() * 10_000;
        double radius = Math.random() * 100_000;
        double rotationTime = Math.random() * 10_000;
        return new Planet(name, radius, rotationTime);
    }

    private static Galaxy generateGalaxy() {
        String name = "G" + Math.random() * 100_000;
        Galaxy galaxy = new Galaxy(name);
        int count =((int) Math.random() * 11) + 1;
        for (int i = 0; i < count; i++) {
            galaxy.add(generatePlanet());
        }
        return galaxy;
    }
  public static ArrayList<Galaxy> generateGalaxies() {
        int count = ((int) (Math.random() * 8)) + 1;
        ArrayList<Galaxy> galaxies = new ArrayList<>();
      for (int i = 0; i < count; i++) {
          galaxies.add(generateGalaxy());
      }
      return galaxies;
  }

}
