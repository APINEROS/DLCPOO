## Ejercicio base 
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un coordinador para el manejo de una dulcería, que desea calcular el promedio de 3 (tres) ventas de dulces. Esta dulcería evalúa la venta de dichos dulces. Como información aparte también se debe calcular las ventas de estos mismos, el valor sobre el que se compran, el valor de venta de estos mismos y su respectiva ganancia.

### Pseudocódigo
~~~
Algoritmo Dulceria

    // Definir variables
    Definir totalVentas, totalCompras, ganancia Como Real
    Definir opcion Como Entero

    totalVentas ← 0
    totalCompras ← 0

    // Menú principal
    Repetir
        Escribir "----- Dulcería -----"
        Escribir "1. Registrar una venta"
        Escribir "2. Registrar una compra"
        Escribir "3. Calcular ganancia"
        Escribir "4. Salir"
        Escribir "Ingrese una opción: "
        Leer opcion

        Segun opcion Hacer
            Caso 1:
                // Registrar una venta
                Escribir "Ingrese el valor de la venta: "
                Leer valorVenta
                totalVentas ← totalVentas + valorVenta
            Caso 2:
                // Registrar una compra
                Escribir "Ingrese el valor de la compra: "
                Leer valorCompra
                totalCompras ← totalCompras + valorCompra
            Caso 3:
                // Calcular ganancia
                ganancia ← totalVentas - totalCompras
                Escribir "La ganancia total es: ", ganancia
            Caso 4:
                // Salir del programa
                Escribir "Saliendo del programa..."
            De Otro Modo:
                Escribir "Opción inválida. Intente nuevamente."
        Fin Segun

        Escribir

    Hasta Que opcion = 4

FinAlgoritmo
~~~
