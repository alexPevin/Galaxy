package model;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class Universe {
    private String name;
    private ArrayList<Galaxy> galaxies = new ArrayList<>();

    public Universe() {
    }

    public Universe(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Galaxy> getGalaxies() {
        return galaxies;
    }

    public void setGalaxies(ArrayList<Galaxy> galaxies) {
        this.galaxies = galaxies;
    }

    public void add(Galaxy galaxy) {
        galaxies.add(galaxy);
    }

    //нужно проверить......
    public Planet searchPlanet(Planet planet) {
        for (Galaxy galaxy : galaxies) {
            Planet foundPlanet = galaxy.search(planet);
            if (foundPlanet != null) {
                return foundPlanet;
            }
        }
        return null;
    }

    public Galaxy searchGalaxy(String name) {
        for (Galaxy galaxy : galaxies) {
            if (galaxy.getName().equals(name)) {
                return galaxy;
            }
        }
        return null;
    }

    // метод для поиска планеты из вселенной по имени
    public Planet searchPlanet(String name) {
        for (Galaxy galaxy : galaxies){
            Planet planetRes = galaxy.search(name);
            if(planetRes != null){
                return planetRes;
            }
        }
        return null;
    }

    // метод для поиска галактики из вселенной по объекту
    public Galaxy searchGalaxy(Galaxy galaxy) {
        for(Galaxy galaxy1 : galaxies){
            if(galaxy1.equals(galaxy)){
                return galaxy1;
            }
        }
        return null;
    }


    public void behavior(){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Universe.this.galaxies.addAll(Generator.generateGalaxies());
                System.out.println(Universe.this);
            }
        }, 0, 10000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universe universe = (Universe) o;
        return Objects.equals(name, universe.name) && Objects.equals(galaxies, universe.galaxies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, galaxies);
    }

    @Override
    public String toString() {
        return "Universe{" +
                "name='" + name + '\'' +
                ", galaxies=" + galaxies +
                '}';
    }
}
