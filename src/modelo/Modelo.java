package modelo;

import java.util.ArrayList;
import java.util.List;


public class Modelo {
	
	private List<String> nombres = new ArrayList<String>();
	private List<String> apellidos = new  ArrayList<String>();
	private List<String> emails = new  ArrayList<String>();
	private List<Double> notas = new ArrayList<Double>();
	private List<String> cursos = new  ArrayList<String>();
	private List<String> estados = new  ArrayList<String>();
	private List<String> instituciones = new  ArrayList<String>();
	private List<String> cursoFinalizado = new  ArrayList<String>();
	private List<Integer> descuentos = new ArrayList<Integer>();
		
	
	public List<String> getNombres() {
		return nombres;
	}

	public void setNombres(List<String> nombres) {
		this.nombres = nombres;
	}

	public List<String> getApellidos() {
		return apellidos;
	}

	public void setApellidos(List<String> apellidos) {
		this.apellidos = apellidos;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public List<String> getInstituciones() {
		return instituciones;
	}

	public void setInstituciones(List<String> instituciones) {
		this.instituciones = instituciones;
	}

	public List<String> getCursoFinalizado() {
		return cursoFinalizado;
	}

	public void setCursoFinalizado(List<String> cursoFinalizado) {
		this.cursoFinalizado = cursoFinalizado;
	}

	public List<Integer> getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(List<Integer> descuentos) {
		this.descuentos = descuentos;
	}

	public void queHace(){
		System.out.println("Tengo que ver la relacion entre todos los objetos" +
				" en el modelo");
	}

	@SuppressWarnings("unused")
	private void cargarDatos (){

		nombres.add("Esteban");
		nombres.add("Julio");
		nombres.add("Ernesto");
		nombres.add("Andres");
		nombres.add("Victor");
		nombres.add("Marcelo");
		nombres.add("Pepe");
		nombres.add("Jose");
		nombres.add("Michael");
		nombres.add("Julio");
		nombres.add("Julio");
		nombres.add("Miguel");
		nombres.add("Marcelo");
		nombres.add("Roberto");
			
		apellidos.add("Quito");
		apellidos.add("Cambiaso");
		apellidos.add("Lujan");
		apellidos.add("Farias");
		apellidos.add("Calzado");
		apellidos.add("Bochini");
		apellidos.add("Arena");
		apellidos.add("Uzuriaga");
		apellidos.add("Arena");
		apellidos.add("Aguero");
		apellidos.add("Cambiasso");
		apellidos.add("Denis");
		apellidos.add("Bochini");
		apellidos.add("Pusineri");
			
		emails.add("estequit@gmail.com");
		emails.add("camb@arnet.com");
		emails.add("ernest@huy.com");
		emails.add("key@map.com.ar");
		emails.add("naic@naic.com");
		emails.add("bocha2@bocha.com");
		emails.add("eee@gmail.com");
		emails.add("pajar@uro.net");
		emails.add("ddd@gmail.com");
		emails.add("gol@hotmail.com");
		emails.add("camb@arnet.com");
		emails.add("mike_sd@gmail.com");
		emails.add("bocha1@bocha.com");
		emails.add("pusi_gol@gol.com");
			
		notas.add(9.0);
		notas.add(null);
		notas.add(8.5);
		notas.add(7.5);
		notas.add(null);
		notas.add(null);
		notas.add(1.5);
		notas.add(7.0);
		notas.add(4.0);
		notas.add(9.5);
		notas.add(5.0);
		notas.add(8.5);
		notas.add(10.0);
		notas.add(null);
		
		cursos.add("Java B");
		cursos.add("Java A");
		cursos.add("Java A");
		cursos.add("Net Web");
		cursos.add("Net Web");
		cursos.add("Java Web");
		cursos.add("Net B");
		cursos.add("Net B");
		cursos.add("Net B");
		cursos.add("Java Web");
		cursos.add("Java B");
		cursos.add("Net B");
		cursos.add("Java A");
		cursos.add("Java B");
			
		estados.add("Finalizado");
		estados.add("Abandonado");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Cursando");
		estados.add("Cursando");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Finalizado");
		estados.add("Cursando");
	
		instituciones.add("La Paz Instituto");
		instituciones.add("ISET 34");
		instituciones.add("ISET 44");
		instituciones.add("ISET 34");
		instituciones.add("Fundación Bocha");
		instituciones.add("La Paz Instituto");
		instituciones.add("La Paz Instituto");

		cursoFinalizado.add("Java B");
		cursoFinalizado.add("Net B");
		cursoFinalizado.add("Net A");
		cursoFinalizado.add("Net B");
		cursoFinalizado.add("Java Web");
		cursoFinalizado.add("Java A");
		cursoFinalizado.add("Java Web");
			
		descuentos.add(10);
		descuentos.add(4);
		descuentos.add(15);
		descuentos.add(4);
		descuentos.add(20);
		descuentos.add(10);
		descuentos.add(10);
		
		}
	
}
