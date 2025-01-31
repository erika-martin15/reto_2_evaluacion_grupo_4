package modelos;

import java.util.ArrayList;

public class Oficina {
	
	// ATRIBUTOS
	private int ID;
	private String ciudad;
	private String direccion;
	private ArrayList<Sala> salas;
	
	// CONSTRUCTOR
	public Oficina() {
	}
	
	public Oficina(int ID, String ciudad, String direccion) {
		this.ID = ID;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}
	
	// GETTERS Y SETTERS
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Sala> getSalas() {
		return this.salas;
	}
	
	@Override
	public String toString() {
		return "ID = " + ID + ", Ciudad = " + ciudad + ", Direccion = " + direccion;
	}
}