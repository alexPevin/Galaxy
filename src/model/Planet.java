package model;

import java.util.Objects;

public class Planet {
    private String name;

    private double radius;
    private double rotationTime;

    public Planet() {
    }

    public Planet(String name, double radius, double rotationTime) {
        this.name = name;
        this.radius = radius;
        this.rotationTime = rotationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRotationTime() {
        return rotationTime;
    }

    public void setRotationTime(double rotationTime) {
        this.rotationTime = rotationTime;
    }
    public String behavior(){
    double time = 2*3.14*this.radius/this.rotationTime;
        return "Планета: " + this.name+" имеет скорость вращения: " +Double.toString(time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(planet.radius, radius) == 0 && Double.compare(planet.rotationTime, rotationTime) == 0 && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, rotationTime);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", rotationTime=" + rotationTime +
                '}';
    }
}
