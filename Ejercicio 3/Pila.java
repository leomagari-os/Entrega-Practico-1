package ejercicio3;

public class Pila {
	private Lista l;
	public Pila(){
		l=new Lista();
	}
	public Integer verTope(){
		return l.verUltimo();
	}
	public void apilar(Integer valor){
		l.insertar(valor);
	}
	public Integer desapilar(){
		if(this.estaVacia()){
			return -1;
		}
		return l.getUltimo().getValor();
	}
	public boolean estaVacia(){
		return l.estaVacia();
	}
	
}
