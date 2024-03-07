package solution.checkjava;

public class Solution31 {
    public static void main(String[] args) {
        // Отобразить версию Java
        System.out.println("\nJava version: " + System.getProperty("java.version"));

        // Отобразить версию среды выполнения Java
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));

        // Отобразить домашний каталог Java
        System.out.println("Java Home: " + System.getProperty("java.home"));

        // Отобразить имя поставщика Java
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));

        // Отобразить URL-адрес поставщика Java
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));

        // Отобразить путь к классу Java
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}
