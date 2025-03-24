package Ejercicio_5_repaso;


import java.util.Objects;


public class Publicaciones {
	private Integer codigo;
	private String autor;
	private String titulo;
	private Integer año_publicacion;
	
	
	
	
	public Publicaciones(Integer codigo, String autor, String titulo, Integer año_publicacion) {
		
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.año_publicacion = año_publicacion;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAño_publicacion() {
		return año_publicacion;
	}
	public void setAño_publicacion(Integer año_publicacion) {
		this.año_publicacion = año_publicacion;
	}
	@Override
	public String toString() {
		return "Publicaciones [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", año_publicacion="
				+ año_publicacion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, año_publicacion, codigo, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicaciones other = (Publicaciones) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(año_publicacion, other.año_publicacion)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(titulo, other.titulo);
	}
	
	
	
}
