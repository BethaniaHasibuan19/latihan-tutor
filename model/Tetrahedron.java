package model;

public class Tetrahedron extends Shape {
    private double edgeLength;

    public Tetrahedron(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double calculateVolume() {
        return (Math.pow(edgeLength, 3) / (6 * Math.sqrt(2)));
    }
}