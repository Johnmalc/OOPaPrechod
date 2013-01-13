package ubung0801Ctvrty;

public class Main extends Schiff implements In{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		In ar = new Schiff();
		for (int i = 0; i < 20; i++) {
			ar.addBuch();
		}
		ar.addKatze();
		// method chaining
		ar.addBuch().addKatze();
		ar.addKatze().printlnad("dksfj");
		
		for (int i = 1; i>=0;i=i+i){
			System.out.println(i);
		}
//1
//2
//4
//8
//16
//32
//64
//128
//256
//512
//1024
//2048
//4096
//8192
//16384
//32768
//65536
//131072
//262144
//524288
//1048576
//2097152
//4194304
//8388608
//16777216
//33554432
//67108864
//134217728
//268435456
//536870912
//1073741824
	}

}
