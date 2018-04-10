package ejercicio5;


public class Lista {
	protected Nodo head=null;
	public Lista(Nodo n){
		this.head=n;
	}
	public Lista getListaElementosComunes(Lista l1, Lista l2){
		Lista res =null;
		Nodo n1= l1.getHead();
		if(!(this.checkOrden(l1))||!(this.checkOrden(l2))){
			while(n1!=null){
				Nodo n2=l2.getHead();
				while(n2!=null){
					if(n1.getValor()==n2.getValor()){
						if(res==null){
							res= new Lista(new Nodo(n1.getValor()));
							break;
						}else{
							res.insertarOrdenado(new Nodo(n1.getValor()));
							break;
						}
					}
					n2=n2.getSiguiente();
				}
				n1=n1.getSiguiente();
			}
			return res;
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
	}
	public void insertarOrdenado(Nodo n){
		Nodo pos=this.head;
		int temp=0;
		if (pos.getValor() > n.getValor()){
			Nodo nTemp=new Nodo(this.head.getValor());
			nTemp.setSiguiente(this.head.getSiguiente());
			n.setSiguiente(nTemp);
			this.head=n;
			return;
		}else{
			while(pos.getSiguiente()!=null){
				if(pos.getValor()>=n.getValor()){
					temp=pos.getValor();
					pos.setValor(n.getValor());
					Nodo nTemp=new Nodo(temp);
					nTemp.setSiguiente(pos);
					pos.setSiguiente(nTemp);
					return;
				}
				pos=pos.getSiguiente();
			}
			pos.setSiguiente(new Nodo(n.getValor()));
		}
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
	public Nodo getHead(){
		return this.head;
	}
}
