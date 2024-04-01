package driver;

import java.util.Scanner;

import model.Cube;
import model.Shape;
import model.ShapeType;
import model.Sphere;
import model.Tetrahedron;

public class VolumeCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube cube = new Cube(4);
        Sphere sphere = new Sphere(5);
        Tetrahedron tetrahedron = new Tetrahedron(3);

        System.out.println("Pilih jenis bentuk (0: Kubus, 1: Bola, 2: Tetrahedron): ");
        int choice = scanner.nextInt();
        ShapeType shapeType = null;

        switch (choice) {
            case 0:
                shapeType = ShapeType.CUBE;
                break;
            case 1:
                shapeType = ShapeType.SPHERE;
                break;
            case 2:
                shapeType = ShapeType.TETRAHEDRON;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (shapeType == ShapeType.CUBE) {
            System.out.println("Volume Kubus: " + calculateVolume(cube));
        } else if (shapeType == ShapeType.SPHERE) {
            System.out.println("Volume Bola: " + calculateVolume(sphere));
        } else if (shapeType == ShapeType.TETRAHEDRON) {
            System.out.println("Volume Tetrahedron: " + calculateVolume(tetrahedron));
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }

    private static double calculateVolume(Shape shape) {
        return shape.calculateVolume();
    }
}
