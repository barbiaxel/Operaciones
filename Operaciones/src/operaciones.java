import java.util.Scanner;

public class operaciones {
	private Scanner teclado;
	int valor1, valor2;
	
	public operaciones() {
		teclado = new Scanner(System.in);
		System.out.println("Introducir primer numero:");
		valor1 = teclado.nextInt();
		System.out.println("Introducir segundo numero:");
		valor2 = teclado.nextInt();
	}
	public void sumar() {
		int suma=valor1+valor2;
		System.out.println("La suma es: "+suma );
	}
	public void restar() {
		int resta=valor1-valor2;
		System.out.println("La resta es: "+resta );
	}
	public void multiplicar() {
		int multiplicacion=valor1*valor2;
		System.out.println("La multiplicacion es: "+multiplicacion );
	}
	public void dividir(){
		int division;
		if (valor2==0)
			System.out.println("No se puede dividir por cero");
		else {
			division =valor1/valor2;
			System.out.println("La division es: "+division);
		}
	}
	public static void main (String[] args) {
		operaciones opera=new operaciones();
		opera.sumar();
		opera.restar();
		opera.multiplicar();
		opera.dividir();
	}
}
