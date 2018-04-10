package ejercicio5;


public class Lista {
	protected Nodo head=null;
	protected int tamanio=0;
	public Lista(Nodo n){
		this.head=n;
		this.tamanio++;
	}
	public Lista getListaElementosComunes(Lista l1, Lista l2){
		Lista res =null;
		if(!(this.checkOrden(l1))){
			ordenar(l1);
		}
		if(!(this.checkOrden(l2))){
			ordenar(l2);
		}
	
		res=new Lista(combinar(l1.getHead(),l2.getHead()));
		return res;
	}
	public Nodo combinar(Nodo n1,Nodo n2){
		if(n1==null || n2==null){
			return null;
			}else if(n1.getValor()==n2.getValor()){
			Nodo nDup= new Nodo(n1.getValor());
			nDup.setSiguiente(combinar(n1.getSiguiente(),n2.getSiguiente()));
			return nDup;
			}else if(n1.getValor() < n2.getValor()){
				return combinar(n1.getSiguiente(), n2);
			}else{
			return combinar(n1,n2.getSiguiente());
			}
	}
	public void insertar(Nodo n){
		Nodo pos=this.head;
		while(pos.getSiguiente()!=null){
			pos=pos.getSiguiente();
		}
		pos.setSiguiente(n);
		this.tamanio++;
	}
	public int getTamanio(){
		return this.tamanio;
	}
	public boolean checkOrden(Lista l){
		Nodo pos=l.getHead();
		while(pos.getSiguiente()!=null){
			if(pos.getValor()>pos.getSiguiente().getValor()){
				return false;
			}
			pos=pos.getSiguiente();
		}
		return true;
	}
	public void ordenar(Lista l){
		Nodo n=l.getHead();
		int temp=0;
		while(n.getSiguiente()!=null){
			Nodo nTemp=n;
			while (nTemp.getSiguiente()!=null){
				if(nTemp.getValor()>=nTemp.getSiguiente().getValor()){
					temp=nTemp.getSiguiente().getValor();
					nTemp.getSiguiente().setValor(nTemp.getValor());
					nTemp.setValor(temp);
					nTemp=this.head;
				}
				nTemp=nTemp.getSiguiente();
			}
			n=n.getSiguiente();
		}
	}
	public Nodo getHead(){
		return this.head;
	}
}
