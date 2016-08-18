package pe.edu.upc.entity;

public class Mermelada extends Fruta{

	//private: atributos propios de la clase
	//protected: Nivel intermedio entre publico y privado, La recomendacion es que debe ser
	// en una clase herencia
	protected int tiempoPreparacion;
	protected String tipoEnvase;
	
	public Mermelada(String color, String sabor, int TiempoPreparacion,String tipoENvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempoPreparacion=TiempoPreparacion;
		this.tipoEnvase=tipoENvase;
	}

	//get & set
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

}
