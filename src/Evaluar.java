import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.junit.Test;


public class Evaluar {

	boolean leerTablaDe7(String path)
	{
		try
		{
			File f = new File(path);
			Scanner s = new Scanner(f);
			for(int i=0; i<10; i++)
			{
				if(s.nextInt()!=(i+1)*7)
					return false;
			}
			return true;
		}catch(Exception e)
		{
			
		}
		return false;
	}
	
	@Test
	public void testDividir() {
		assertEquals("dividir(10, 2) deberia devolver 5.", 5, Ejercicios.dividir(10, 2));
		assertEquals("dividir(12, 4) deberia devolver 3.", 3, Ejercicios.dividir(12, 4));
		assertEquals("dividir(15, 0) deberia devolver 0.", 0, Ejercicios.dividir(15, 0));
	}
	
	@Test
	public void testEscribirTablaDe7()
	{
		try
		{
			File f = new File("NoBorrarNiModificar1");
			FileWriter fw = new FileWriter(f);
			fw.write("");
			fw.close();
		}catch(Exception e)
		{
			
		}
		Ejercicios.escribirTablaDe7("NoBorrarNiModificar1");
		assertEquals("numeros leidos incorrectos", true, leerTablaDe7("NoBorrarNiModificar1"));
	}
	
	@Test
	public void testGetNombreClase() {
		assertEquals("No devolvio \"Soy tipo ClasePadre\"", "Soy tipo ClasePadre", Ejercicios.getNombreClase(new ClasePadre()));
		assertEquals("No devolvio \"Soy tipo ClaseHijo\"", "Soy tipo ClaseHijoA", Ejercicios.getNombreClase(new ClaseHijoA()));
		assertEquals("No devolvio \"Soy tipo ClaseHijo\"", "Soy tipo ClaseHijoB", Ejercicios.getNombreClase(new ClaseHijoB()));
	}
	
	@Test
	public void testCuantasVecesExiste()
	{
		
		assertEquals("El archivo NoBorrarNiModificar2 tiene 4 veces el numero 5.", 4, Ejercicios.cuantasVecesExiste("NoBorrarNiModificar2",5));
	}
}
