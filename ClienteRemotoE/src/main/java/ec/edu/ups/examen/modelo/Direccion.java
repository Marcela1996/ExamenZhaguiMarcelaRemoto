package ec.edu.ups.examen.modelo;


import java.io.Serializable;


public class Direccion implements Serializable{
	
	private int codigo;
    private String direccionRecogida;
    private String direcccionEntrega;
    
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDireccionRecogida() {
		return direccionRecogida;
	}
	public void setDireccionRecogida(String direccionRecogida) {
		this.direccionRecogida = direccionRecogida;
	}
	public String getDirecccionEntrega() {
		return direcccionEntrega;
	}
	public void setDirecccionEntrega(String direcccionEntrega) {
		this.direcccionEntrega = direcccionEntrega;
	}
}