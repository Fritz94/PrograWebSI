package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;
import pe.edu.upc.entity.Mermelada;

public class appFruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// para importar fruta es F+Barra espaciadora+dar click a la opcion
		
		//aqui el objeto es "f" y "mer"
		Fruta f=new Fruta("Amarillo", "Dulce");
		
		Mermelada mer=new Mermelada("Rojo", "Acido", 1 , "Vidrio");
		
		//Invocacion de metodos 
		
		//Agarra el metodo toString del Padre y lo imprime
		System.out.println(f.toString());
		f.SoyunMetodoObjeto();
		System.out.println(mer.toString());
		mer.SoyunMetodoObjeto();
		
		Fruta.LugarOrigen="Tierra";
		Fruta.SoyunMetodoGlobal();
		
		
		

	}

}
