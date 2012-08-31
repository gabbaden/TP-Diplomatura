package modelo;

public class AlumnoRegular extends Alumno{

	public int cuotaConDescuento(){
		return this.getValorcuota()- (this.getValorcuota()/100)*5;
	}
}
