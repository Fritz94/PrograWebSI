package pe.edu.upc.entity;

public class Fruta {
	
	// Atributos de instancia: Atributos de objeto. 
	private String color;
	private String sabor;
	
	// Atributos de clase: Pertenece a la clase
	// Static: Es para decir que es global.
	public static String LugarOrigen="UPC";

	
	
	//Constructores: Para inicializar color y sabor
	
	public Fruta(String color, String sabor) {
		super();
		this.color = color;
		this.sabor = sabor;
	}

// Static: cualquier cosita - atributo o metodo - lo hara global sin la necesidad de crear 
// un objeto
    public static void SoyunMetodoGlobal(){
    	
    }
    
    public void SoyunMetodoObjeto(){
    	
    }

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getSabor() {
		return sabor;
	}


// this.sabor: para diferenciar de un parametro de un atributo
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
// to + (ctrl + barra espaciadora) + to(String)
// Override: Es que todos los elementos que son heredados. Tambien los puedes sobreescribir
// super: hacer referencia a esa clase padre 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "-"+this.getColor();
	}
}
