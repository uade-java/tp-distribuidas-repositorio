package dto;

import java.io.File;
import java.io.Serializable;

public class CargaDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private DimensionDto dimension;
	private boolean apilable;
	private int cantidadApilable;
	private String fragilidad;
	private String tratamiento;
	private String condicionViaje;
	private String textoManipulacion;
	private String permiso;
	private File archivoPermiso;
	
	public CargaDto(DimensionDto dimension, boolean apilable, int cantidadApilable, String fragilidad, String tratamiento,
			String condicionViaje, String textoManipulacion, String permiso, File archivoPermiso) {

		this.dimension = dimension;
		this.apilable = apilable;
		this.cantidadApilable = cantidadApilable;
		this.fragilidad = fragilidad;
		this.tratamiento = tratamiento;
		this.condicionViaje = condicionViaje;
		this.textoManipulacion = textoManipulacion;
		this.permiso = permiso;
		this.archivoPermiso = archivoPermiso;
	}

	public DimensionDto getDimension() {
		return dimension;
	}

	public void setDimension(DimensionDto dimension) {
		this.dimension = dimension;
	}

	public boolean isApilable() {
		return apilable;
	}

	public void setApilable(boolean apilable) {
		this.apilable = apilable;
	}

	public int getCantidadApilable() {
		return cantidadApilable;
	}

	public void setCantidadApilable(int cantidadApilable) {
		this.cantidadApilable = cantidadApilable;
	}

	public String getFragilidad() {
		return fragilidad;
	}

	public void setFragilidad(String fragilidad) {
		this.fragilidad = fragilidad;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getCondicionViaje() {
		return condicionViaje;
	}

	public void setCondicionViaje(String condicionViaje) {
		this.condicionViaje = condicionViaje;
	}

	public String getTextoManipulacion() {
		return textoManipulacion;
	}

	public void setTextoManipulacion(String textoManipulacion) {
		this.textoManipulacion = textoManipulacion;
	}

	public String getPermiso() {
		return permiso;
	}

	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}

	public File getArchivoPermiso() {
		return archivoPermiso;
	}

	public void setArchivoPermiso(File archivoPermiso) {
		this.archivoPermiso = archivoPermiso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
