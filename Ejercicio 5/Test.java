package ejercicio5;

public class Test {
	public static void main(String[]args){
		Timer t=new Timer();
		Lista l1=new Lista(new Nodo(1));
		Lista l2= new Lista(new Nodo(549));
		for(int i=1;i<10;i++){
			l1.insertar(new Nodo(new Integer((int)(Math.random()*100)+1)));
		}
		for(int i=1;i<10;i++){
			l2.insertar(new Nodo(new Integer((int)(Math.random()*100)+1)));
		}
		t.start();
		Lista res=l1.getListaElementosComunes(l1, l2);
		System.out.println("El codigo se ejecuto en: "+t.stop());
		if(res==null){
			System.out.println("No hay numeros en comun.");
			return;
		}
		Nodo posRes=res.getHead();
		
		while (posRes!=null){
			System.out.println(posRes.getValor());
			posRes=posRes.getSiguiente();
		}
		//el algoritmo del punto a:- con una lista de tamaño 5 se ejecuto en 0.193115
		//						- con una lista de tamaño 10 se ejecuto en 0.27203
		//						- con una lista de tamaño 50 se ejecuto en 1.057324
		//						- con una lista de tamaño 100 se ejecuto en 3.580017
		//						- con una lista de tamaño 500 se ejecuto en 10.471869
		//						- con una lista de tamaño 1000 se ejecuto en 18.454408
		// el algoritmo del punto b:- con una lista de tamaño 5 se ejecuto en 0.534436
		//						- con una lista de tamaño 10 se ejecuto en 0.545984
		//						- con una lista de tamaño 50 se ejecuto en 0.695473
		//						- con una lista de tamaño 100 se ejecuto en 0.814807
		//						- con una lista de tamaño 500 se ejecuto en 1.55904
		//						- con una lista de tamaño 1000 se ejecuto en 2.755587
		// Analisis del codigo:
		// Con estos tiempos de ejecucion podemos decir,que en el caso del algoritmo B,se ejecuta mas rapido porque las 
		// listas se encuentran en orden y en el caso del algoritmo A se pierde mas tiempo ordenando la lista.
	}
}
