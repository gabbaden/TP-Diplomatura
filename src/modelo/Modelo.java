package modelo;



public class Modelo {
	
	String[] nombres = {"Esteban", "Julio", "Ernesto", "Andres", "Victor","Marcelo",
			"Pepe","Jose","Michael","Julio","Julio","Miguel","Marcelo","Roberto"};
	
	String[] apellidos = {"Quito","Cambiaso","Lujan","Farias","Calzado","Bochini",
			"Arena","Uzuriaga","Arena","Aguero","Cambiasso","Denis","Bochini","Pusineri"};
	
	String[] emails = {"estequit@gmail.com","camb@arnet.com","ernest@huy.com","key@map.com.ar",
			"naic@naic.com","bocha2@bocha.com","eee@gmail.com","pajar@uro.net","ddd@gmail.com",
			"gol@hotmail.com", "camb@arnet.com","mike_sd@gmail.com","bocha1@bocha.com",
			"pusi_gol@gol.com"};
	
	Double [] notas = {9.0,null,8.5,7.5,null,null,1.5,7.0,4.0,9.5,5.0,8.5,10.0,null};
	
	String [] cursos = {"Java B", "Java A","Java A","Net Web","Net Web","Java Web","Net B",
			"Net B","Net B","Java Web","Java B","Net B","Java A","Java B"};
	
	String [] estado = {"Finalizado","Abandonado","Finalizado","Finalizado","Cursando","Cursando",
			"Finalizado","Finalizado","Finalizado","Finalizado","Finalizado","Finalizado",
			"Finalizado","Cursando"};
	
	String [] institucion = {"La Paz Instituto","ISET 34","ISET 44","ISET 34","Fundación Bocha",
			"La Paz Instituto","La Paz Instituto"};
	
	String [] cursoFinalizado = {"Java B","Net B","Net A","Net B","Java Web","Java A","Java Web"};
	
	Integer[] descuento = {10,4,15,4,20,10,10};
	
	
	public void queHace(){
		System.out.println("Tengo que ver la relacion entre todos los objetos" +
				" en el modelo");
	}

	
}
