package tp3;

public class AgenceMobilière {
	private vehicule tab[];
	private int max;
	private int n;

	public AgenceMobilière(int max) {
		tab = new vehicule[max];
		this.max = max;
	}

	void ajoutVehicule(vehicule v) {
		if (n < max) {
			this.tab[n] = v;
			n++;
		} else {
			System.out.println("err");
		}
	}

	void afficheagence(AgenceMobilière t) {
		for (int i = 0; i < n; i++) {
			tab[i].decrisVéhicule(tab[i]);
		}
	}

	void selection(int n) {
		if (n - 1 < this.n) {
			System.out.println("la véhicule numero "+n+" est:\n");
			tab[n - 1].decrisVéhicule(tab[n - 1]);
		} else {
			System.out.println("err");
		}
	}

	void selection(String mq) {
		int i;
		boolean test = true;
		for (i = 0; i < n; i++) {
			if (tab[i].getMarque().equals(mq)) {
				System.out.println("les véhicules de cette marque sont:\n");
				break;
			}
		}
		for (int j=i; j < n; j++) {
			if (tab[j].getMarque().equals(mq)) {
				System.out.println(tab[j]);
				test = false;
			}
		}
		if (test) {
			System.out.println("il n’y a pas de véhicules de cette marque");
		}

	}

	void selection(Double px) {
		int i;
		boolean test=true;
		for(i=0;i<n;i++) {
			if(tab[i].getPrix()<px) {
				System.out.println("les vehicule dans cette marge de prix sont:\n");
				break;
			}	}
		for(int j=i;j<n;j++) {
			if(tab[j].getPrix()<px) {
				System.out.println(tab[j]);
				test=false;
			}	}
		if(test) {
			System.out.println("il n’y a pas de véhicules dans cette marge de prix");
		}
	}
	void selectionanciene() {
		int an=tab[0].getAnneec();
		int x=1;
		for(int i=1;i<n;i++) {
			if(tab[i].getAnneec()<an) {
				an=tab[i].getAnneec();
			}
			x++;
		}
		System.out.println("les vehicule la plus anncieneest:\n");
		selection(x);
	}


}
