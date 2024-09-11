
public class Ejercicio2 {
	public static void main(String[] args) {
		int j = 5; // filas 
		//Empiezo las filas
		while (j>=0) {
			int i = 0; // asteriscos 
			//Mientras i sea menor a las filas, imprimira i=*, salto de linea, hasta que i=j que es 5
			while (i<=j) {
				//imprime un * sin salto d linea 
			System.out.print("* ");
			//aumentamos i hasta k iguale a j
			i++;
			}//while asteriscos
			System.out.println();
			j--;
		}//while filas 
	}//main
}//class Ejercicio 2 
