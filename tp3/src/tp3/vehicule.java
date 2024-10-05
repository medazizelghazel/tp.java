package tp3;

public class vehicule {
	private int num;	
	private String marque;
	private String model;
	private int anneec;
	private double prix;
	public vehicule(String ma,String mo,int anc,double p) {
		marque=ma;
		model=mo;
		anneec=anc;
		prix=p;
		count++;
		num=count;
	}
	private static int count ;
	void decrisVéhicule(vehicule x){
		System.out.println(this);
	} 
	public String toString() {
		return("-------vehiculenumero:" +num+"-------\nmarque:"+marque+"\nmodel:"+model+"\nannée de création:"+anneec+"\nprix:"+prix);
	}
	String getMarque() {
		return(marque);
	}
	String getModel() {
		return(model);
	}
	double getPrix() {
		return(prix);
	}
	int getAnneec() {
		return(anneec);
	}
	void setMarque(String marque) {
		this.marque=marque;
	}
	void setModem(String model) {
		this.model=model;
	}
	void setPrix(double prix) {
		this.prix=prix;
	}
	
}
