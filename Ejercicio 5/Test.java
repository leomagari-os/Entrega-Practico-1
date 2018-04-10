package ejercicio5;

public class Test {
	public static void main(String[]args){
		Lista l1=new Lista(new Nodo(1));
		Lista l2= new Lista(new Nodo(11));
		for(int i=2;i<20;i++){
			l1.insertar(new Nodo(i));
		}
		for(int i=10;i>2;i--){
			l2.insertar(new Nodo(i));
		}
		
		Lista res=l1.getListaElementosComunes(l1, l2);
		Nodo posRes=res.getHead();
		while (posRes!=null){
			System.out.println(posRes.getValor());
			posRes=posRes.getSiguiente();
		}
	}
}
