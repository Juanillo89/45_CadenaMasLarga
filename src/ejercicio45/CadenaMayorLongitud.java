package ejercicio45;

import java.util.Scanner;

public class CadenaMayorLongitud
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String cadena;
		String cadenaMayor = "";
		// Se pide primero la cadena
		System.out.print("Introduce cadena (fin para salir): ");
		cadena = sc.nextLine();
		// Mientras cadena sea distinto de fin
		while (!cadena.equals("fin"))
		{
			// Si la longitud de la cadena es mayor o igual que la de la cadena
			// de mayor longitud, la cadena pasa a ser la nueva cadenaMayor
			if (cadena.length() >= cadenaMayor.length())
			{
				cadenaMayor = cadena;
			}
			// Se vuelve a pedir la cadena, si pone fin se sale
			System.out.print("Introduce cadena (fin para salir): ");
			cadena = sc.nextLine();
		}
		sc.close();
		// Si no se ha introducido ninguna cadena no se muestra nada
		if (cadenaMayor.equals(""))
		{
			System.out.println("No se ha introducido ninguna cadena.");
		}
		// Si se ha introducido cadena se muestra la de mayor longitud
		else
		{
			System.out.println("La cadena de mayor longitud introducida es " + cadenaMayor);
		}
	}
}
