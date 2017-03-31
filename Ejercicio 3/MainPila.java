package ejercicio3;

public class MainPila {
	public static void main(String[] args) {
		Pila p1=new Pila();
		Pila p3 =new Pila();
		for (int i = 0; i < 10; i++) {
			p1.apilar(new Integer(i));
		}
		for (int i = 10; i < 20; i++) {
			p3.apilar(i);
		}
		System.out.println("El tope de la pila p1 es: "+p1.verTope());
		System.out.println("El tope de la pila p3 es: "+p3.verTope());
		while(!p1.estaVacia()){
			p3.apilar(p1.desapilar());
		}
		System.out.println("El nuevo tope de la pila p3 es: "+p3.verTope());
		while(!p3.estaVacia()){
			System.out.println(p3.desapilar());
		}
	}
}
