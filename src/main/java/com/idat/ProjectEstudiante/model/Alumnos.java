package com.idat.ProjectEstudiante.model;

public class Alumnos extends Personas {
	
	private Integer idAlumno;
	private Integer idGrado,ideSeccion;
	private String codAlumno;
	
	String info() {
		return Integer.toString(getdniPersona());
	}

	public Alumnos() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
