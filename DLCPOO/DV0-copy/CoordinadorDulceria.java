
/**
 * Write a description of class promedio_dulces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CoordinadorDulceria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables
        double totalVentas = 0;
        double totalCompras = 0;

        // Realizar 3 ventas y calcular los totales
        for (int i = 1; i <= 3; i++) {
            System.out.println("Venta " + i + ":");
            
            System.out.print("Ingrese el valor de compra del dulce: ");
            double valorCompra = scanner.nextDouble();
            totalCompras += valorCompra;
            
            System.out.print("Ingrese el valor de venta del dulce: ");
            double valorVenta = scanner.nextDouble();
            totalVentas += valorVenta;
            
            System.out.println();
        }

        // Calcular la ganancia
        double ganancia = totalVentas - totalCompras;

        // Calcular el promedio de ventas
        double promedioVentas = totalVentas / 3;

        // Mostrar los resultados
        System.out.println("---- Resultados ----");
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Total de compras: " + totalCompras);
        System.out.println("Ganancia: " + ganancia);
        System.out.println("Promedio de ventas: " + promedioVentas);

        // Cerrar el escáner
        scanner.close();
    }
}
