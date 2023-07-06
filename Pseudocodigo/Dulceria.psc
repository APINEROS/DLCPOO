Algoritmo Dulceria
	
    // Definir variables
    Definir totalVentas, totalCompras, ganancia Como Real
    Definir opcion Como Entero
	
    totalVentas <- 0
    totalCompras <- 0
	
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
                totalVentas <- totalVentas + valorVenta
            Caso 2:
                // Registrar una compra
                Escribir "Ingrese el valor de la compra: "
                Leer valorCompra
                totalCompras <- totalCompras + valorCompra
            Caso 3:
                // Calcular ganancia
                ganancia <- totalVentas - totalCompras
                Escribir "La ganancia total es: ", ganancia
            Caso 4:
                // Salir del programa
                Escribir "Saliendo del programa..."
            De Otro Modo:
                Escribir "Opción inválida. Intente nuevamente."
        Fin Segun
		
		
    Hasta Que opcion = 4
	
FinAlgoritmo