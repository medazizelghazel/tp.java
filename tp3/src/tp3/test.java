package tp3;

public class test {

	public static void main(String[] args) {
		vehicule v1 =new vehicule("clio","classic",2000,20.000);
		vehicule v2 =new vehicule("mercedes","fantome",2008,60.000);
		vehicule v3 =new vehicule("kia","picanto",2012,35.000);
		vehicule v4 =new vehicule("mercedes","g60",2022,1000000);
		AgenceMobilière t1 =new AgenceMobilière(6);
		t1.ajoutVehicule(v1);
		t1.ajoutVehicule(v2);
		t1.ajoutVehicule(v3);
		t1.ajoutVehicule(v4);
		t1.afficheagence(t1);
		t1.selection("mercedes");
		t1.selection(40.000);
		t1.selectionanciene();
	}

}
