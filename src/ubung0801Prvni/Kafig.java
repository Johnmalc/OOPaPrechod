package ubung0801Prvni;

public class Kafig {
	Hase[] ha;
	Katze [] ka;
	public Kafig() {
		ha = new Hase[200];
		ka = new Katze [2000];
	}

	public void add(Hase H1) {
		for (int i = 0; i < ha.length; i++) {
			if (ha != null) {
				ha[i] = H1;
			} else {
				System.out.println("error");
			}
		}
	}
	public void addKatze (Katze K1){
		for (int i = 0; i <ka.length; i++){
			if (ka !=null){
				ka[i] = K1;
			}else {
				System.err.println("error");
			}
		}
		
		
	}
}
