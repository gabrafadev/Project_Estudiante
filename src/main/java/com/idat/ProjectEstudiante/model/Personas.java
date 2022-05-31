package com.idat.ProjectEstudiante.model;

public class Personas {
	
	private Integer idPersona;
	private Integer dniPersona,edad;
	private String nombrePersona,apellidoPat,apellidoMat;
	
	
	//Metodos de acceso
	Integer getidPersona() {return idPersona;}
	Integer getdniPersona() {return dniPersona;}
	String getnombrePersona() {return nombrePersona;}
	String getapellidoPat() {return apellidoPat;}
	String getapellidoMat() {return apellidoMat;}
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public Integer getDniPersona() {
		return dniPersona;
	}
	public void setDniPersona(Integer dniPersona) {
		this.dniPersona = dniPersona;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
	
	

}
