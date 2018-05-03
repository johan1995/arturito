package appSikuli;

public class productos {
	String codigo;
	String codigoEAN;
	String descripcion;
	String pline;
	String pelin2;
	String categoria;
	String marca;
	boolean estado;
	
	public productos(String codigo, String codigoEAN, String descripcion, String pline, String pelin2, String categoria,
			String marca) {
		super();
		this.codigo = codigo;
		this.codigoEAN = codigoEAN;
		this.descripcion = descripcion;
		this.pline = pline;
		this.pelin2 = pelin2;
		this.categoria = categoria;
		this.marca = marca;
		estado=true;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigoEAN() {
		return codigoEAN;
	}
	public void setCodigoEAN(String codigoEAN) {
		this.codigoEAN = codigoEAN;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPline() {
		return pline;
	}
	public void setPline(String pline) {
		this.pline = pline;
	}
	public String getPelin2() {
		return pelin2;
	}
	public void setPelin2(String pelin2) {
		this.pelin2 = pelin2;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
