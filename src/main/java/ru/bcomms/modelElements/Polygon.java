package ru.bcomms.modelElements;

import java.util.HashSet;
import java.util.Set;

public class Polygon {
    private final Set<Point3D> points;

    public Polygon() {
        this.points = new HashSet<>();
    }

    public Set<Point3D> getPoints() {
        return points;
    }

    public boolean addPoint(Point3D point3D) {
        return points.add(point3D);
    }

    public boolean removePoint(Point3D point3D) {
        return points.remove(point3D);
    }
}
