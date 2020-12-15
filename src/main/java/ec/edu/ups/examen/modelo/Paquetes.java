package ec.edu.ups.examen.modelo;

import java.io.Serializable;
import java.util.List;



public class Paquetes implements Serializable {

	private int codigo;
	private String receptor;
	private String remitente;


	private List<Direccion>direccion;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getReceptor() {
		return receptor;
	}
	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}
}