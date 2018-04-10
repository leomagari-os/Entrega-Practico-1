package ejercicio5;

public class Nodo {
	private Integer valor;
	private Nodo siguiente;
	public Nodo(Integer valor){
		siguiente=null;
		this.valor=valor;
	}
	public void setSiguiente(Nodo n){
		siguiente=n;
	}
	public Nodo getSiguiente(){
		return siguiente;
	}
	public Integer getValor(){
		return valor;
	}
	public void setValor(int v){
		this.valor=v;
	}
}
