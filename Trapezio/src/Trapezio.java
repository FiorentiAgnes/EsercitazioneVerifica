/**
 * <u>CLASSE TRAPEZIO</u>
 * 
 * @author <mark>Fiorentino Agnese
 *
 */
public class Trapezio {
private float bMaggiore, bMinore, altezza;

/**
 * Costruttore della classe Trapezio
 * @param bMag base Maggiore
 * @param bMin base Minore
 * @param h altezza
 */
public Trapezio(float bMag,float bMin,float h) {
	bMaggiore=bMag;
	bMinore=bMin;
	altezza=h;
}
/**
 * 
 * @return area del trapezio
 */
public float areaTrapezio() {
	return (bMaggiore+bMinore)*altezza/3;    //errore nella formula
}
/**
 * Classe test main
 * @param args
 */
	public static void main(String[] args) {
	Trapezio t=new Trapezio(5,3,2);
	System.out.println(t.areaTrapezio());

	}

}
