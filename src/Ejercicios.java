import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClasePadre";
	}
}

class ClaseHijoA extends ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClaseHijoA";
	}
	
}

class ClaseHijoB extends ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClaseHijoB";
	}
	
}

public class Ejercicios
{
	
	//Devuelve a divido entre b, si b es cero devuelve 0.
	//Sugerencia: Usar try catch
	//3 puntos
	static int dividir(int a, int b)
	{
		try
		{
		return a/b;
			
			
		}catch(Exception e) 
		{
			if (b==0)
			{
				b=0;
			}
			e.printStackTrace();
		}
		return b;
	}
	
	//Escribe la tabla del 7 en un archivo con nombre "path"
	//4 puntos
	static void escribirTablaDe7(String path) 
	{
		try{
		File file = new File(path);
		FileWriter fw = new FileWriter(file);
		
		fw.write("7 ");
		fw.write("14 ");
		fw.write("21 ");
		fw.write("28 ");
		fw.write("35 ");
		fw.write("42 ");
		fw.write("49 ");
		fw.write("56 ");
		fw.write("63 ");
		fw.write("70 ");
		
		fw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return;
	}
	
	
	//Devuelve cuantas veces existe el numero num_buscar en un archivo
	//4 puntos
	static int cuantasVecesExiste(String path,int num_buscar)
	{
		int x=0;
		try 
		{
			
			File file = new File (path);
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext())
			{
				if (num_buscar ==scanner.nextInt())
				{
				x=x+1;	
				}
			
			}
									
			return x;
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return num_buscar;
	}
	
	
	//Implementar las clases en la parte superior de este archivo y la funcion siguiente de modo que:
	//Si la clase es de tipo "ClasePadre" devuelve: "Soy tipo ClasePadre"
	//Si la clase es de tipo "ClaseHijoA" devuelve: "Soy tipo ClaseHijoA"
	//Si la clase es de tipo "ClaseHijoB" devuelve: "Soy tipo ClaseHijoB"
	//4 puntos
	static String getNombreClase(ClasePadre p)
	{
		return p.getNombreClase();
	}
	
	public static void main(String args[])
	{
		int arreglo[] = new int[6];
		System.out.print(arreglo.length);
	}
}
