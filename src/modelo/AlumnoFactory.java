package modelo;

import java.util.Iterator;
import modelo.Modelo;

/**
 * @author jackgris
 * Clase factory para crear ir creando a los alumnos que vamos a utilizar
 * 
 *
 */
public class AlumnoFactory {

	Modelo datos = new Modelo();
	
	public Alumno alumnoFactory(){
		
		Iterator<String> iter = datos.nombres.iterator();
		
		while(iter.hasNext()){
		
//			if(((String) datos).estados(1) != null){
//				return new AlumnoComun();					
//			}
//			else{
//				return new AlumnoRegular();
//			}  mirando como crear los alumnos
		}
		return null;
		
	}
	
}
