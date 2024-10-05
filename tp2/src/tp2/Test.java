package tp2;

public class Test {

	public static void main(String[] args) {
		Point P1 = new Point(2,3,'a');
		P1.afficher();
		Point P2 = new Point();
		P2.afficher();
		Point P3 = new Point(P1);
		P3.afficher();
		System.out.println(P1);
		System.out.println(P1.coincide_V1(P3));
		System.out.println(Point.coincide_V2(P3,P2));
		Cercle C1 = new Cercle(P1,3);
		C1.afficher();
		C1.deplace(1, 2);
		C1.afficher();
	}

}
