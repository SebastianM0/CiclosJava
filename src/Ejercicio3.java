
public class Ejercicio3 {
	public static void main(String[] args) {
		int j = 0; // filas 
		//Empiezo las filas
		while (j<=5) {
			int i = 0; // asteriscos 
			//Mientras i sea menor a las filas, imprimira i=*, salto de linea, hasta que i=j que es 5
			while (i<=j) {
			System.out.print("* ");
			i++;
			}//2do while
			System.out.println();
			j++;
		}//1er while
	}//main
}// class Ejercicio 3
