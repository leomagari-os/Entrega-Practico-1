package ejercicio3;

public class Lista {
	private Nodo primero, ultimo;
	public Lista(){
		primero=null;
		ultimo=null;
	}
	//el insert lo hago de esta manera para usarlo en la pila
	public void insertar(Integer valor){
		Nodo tmp=new Nodo(valor);
		if(primero==null){
				primero=tmp;
				ultimo=tmp;
		}else{
			if(primero==ultimo){
				primero.setSiguiente(tmp);
				ultimo=tmp;
			}else{
				Nodo puntero=primero;
				while(puntero.getSiguiente()!=null){
					puntero=puntero.getSiguiente();
				}
				puntero.setSiguiente(tmp);
				ultimo=tmp;
			}
		}
	}
	public Integer verUltimo(){
		return ultimo.getValor();
	}
	public Nodo getUltimo(){
		Nodo ult=ultimo;
		this.borrarUltimoNodo();
		return ult;
	}
	//esto borra el ultimo Nodo cuando usamos el getUltimo()
	private void borrarUltimoNodo(){
		Nodo puntero=primero;
		if(primero==ultimo){
			primero=null;
			ultimo=null;
		}else{
			while(puntero.getSiguiente()!=ultimo){
				puntero=puntero.getSiguiente();
			}
			ultimo=puntero;
			puntero.setSiguiente(null);
		}
	}
	public boolean estaVacia(){
		return (primero==null);
	}
	
}
