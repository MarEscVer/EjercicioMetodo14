package unico;

public class Ejercicio14 {

	public static void main(String[] args) {

		/*
		 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8
		 * y el 9. Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4,
		 * el 5 y el 6. Un número es afortunado si contiene más números de la suerte que
		 * de la mala suerte. Realiza un programa que diga si un número introducido por
		 * el usuario es afortunado o no.
		 */

		int numero;
		String mensaje;

		numero = Util.leerInt("Introduzca el número: ");

		mensaje = numSuerte(numero);

		Util.escribir(mensaje);

	}

	public static String numSuerte(int numero) {
		int cifra;
		int conBuena = 0;
		int conMala = 0;
		String suerte;
		while (numero > 0) {
			cifra = numero % 10;
			switch (cifra) {
			case 3, 7, 8, 9:
				conBuena+=1;
			break;
			case 0, 1, 2, 4, 5, 6:
				conMala+=1;
			}
			numero = numero / 10;
		}
		suerte = (conBuena > conMala) ? "Afortunado" : "No afortunado";
		return suerte;
	}
}
