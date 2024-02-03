package SolutionBase;

public class Sphere {
    public static void main(String[] args) {
        double radius = 5; // радиус сферы

        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Объем сферы: " + volume);
        System.out.println("Площадь поверхности сферы: " + surfaceArea);
    }
}
