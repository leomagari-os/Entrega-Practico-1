package ejercicio5;

public class Test {
	public static void main(String[]args){
		Lista l1=new Lista(new Nodo(1));
		Lista l2= new Lista(new Nodo(1));
		for(int i=2;i<20;i++){
			l1.insertar(new Nodo(i));
			
		}
		for(int i=10;i>1;i--){
			l2.insertar(new Nodo(i));
		}
		
		Lista res=l1.getListaElementosComunes(l1, l2);
		Nodo posRes=res.getHead();
		while (posRes.getSiguiente()!=null){
			System.out.println(posRes.getValor());
			posRes=posRes.getSiguiente();
		}
		Nodo n2=l2.getHead();
		while(n2.getSiguiente()!=null){
			System.out.println(n2.getValor());
			n2=n2.getSiguiente();
		}
		System.out.println(posRes.getValor());
	}
}
