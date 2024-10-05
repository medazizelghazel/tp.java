package tp2;

public class Point {
	int abs; 
	int ord;
	char nom;
	void afficher() {
		System.out.println( nom +"("+ abs + "," + ord + ")") ;
	}		
	void Deplacer(int a,int b) {
		abs+=a;
		ord+=b;
	}
	void Reset(){
		abs=0;
		ord=0;
	}
	boolean coincide_V1 (Point p) {
		return ((p.abs==abs)&&(p.ord==ord)&&(p.nom==nom));
	}
	static boolean coincide_V2 (Point p,Point c) {
		return ((p.abs==c.abs)&&(p.ord==c.ord)&&(p.nom==c.nom));
	}
	
	public Point (int a, int b,char n){
		abs=a;
		ord=b;
		nom=n;
	}
	public Point() {
		abs=0;
		ord=0;
		nom='o';
	}
	public Point(Point x) {
		abs=x.abs;
		ord=x.ord;
		nom=x.nom;
	}
	@Override
	public String toString() {
		return(nom +"("+ abs + "," + ord + ")");
	}
	
}
