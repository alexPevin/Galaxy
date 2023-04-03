package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Galaxy {
    private String name;
    private ArrayList<Planet> planets = new ArrayList<>();

    public Galaxy() {
    }

    public Galaxy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Planet> getPlanets() {
        return new ArrayList<>(planets);
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;

    }

    public void add(Planet planet) {
        planets.add(planet);
    }

    public void delete(String name) {
        planets.removeIf(del -> Objects.equals(del.getName(), name));
    }

    public void delete(Planet planet) {
        planets.removeIf(del -> del.equals(planet));
    }

    public Planet search(Planet planet) {
        for (Planet search : planets) {
            if (search.equals(planet)) {
                return search;
            }
        }
        return null;
    }

    public Planet search(String name) {
        for (Planet search : planets) {
            if (search.getName().equals(name)) {
                return search;
            }
        }
        return null;
    }

    public String behavior() {
        StringBuilder res = new StringBuilder("Галактика имеет: \n");
        for (Planet planet : planets) {
            res.append(planet.behavior()).append("\n");
        }
        return res.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galaxy galaxy = (Galaxy) o;
        return Objects.equals(name, galaxy.name) && Objects.equals(planets, galaxy.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planets);
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "name='" + name + '\'' +
                ", planets=" + planets +
                '}';
    }
}
