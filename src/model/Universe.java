package model;

import java.util.ArrayList;
import java.util.Objects;

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
    public void add(Galaxy galaxy){
        galaxies.add(galaxy);
    }
     //нужно проверить......
    public Galaxy search(Planet planet){
        for (Galaxy sear : galaxies){
            if(sear.search(planet) == planet){
                    return sear;
            }
        }
        return null;
    }
    public Galaxy search(String name){
        for(Galaxy sear : galaxies){
            if(Objects.equals(sear.getName(),name));
            return sear;
        }
        return null;
    }
    public String behavior(){
        StringBuilder res = new StringBuilder("Вселенная имеет:  ");

    }

    @Override
    public String toString() {
        return "Universe{" +
                "name='" + name + '\'' +
                ", galaxies=" + galaxies +
                '}';
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
}
