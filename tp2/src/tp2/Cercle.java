package tp2;

public class Cercle {
	Point p;
	int r;
	public Cercle (Point c, int b){
		p=c;
		r=b;
	}
	void afficher() {
		p.afficher();
		System.out.println("le rayon="+r);
	}
	void deplace(int a,int b) {
		p.Deplacer(a, b);
	}
	static boolean coincide(Cercle c1,Cercle c2) {
		return((Point.coincide_V2(c1.p, c2.p))&&(c1.r==c2.r));
	} 
}
