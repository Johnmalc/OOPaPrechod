package aufgabe8Znova;

public abstract class SuperKlasse implements In {
	public int Kennung;
	public String Name;
	public int Stuckzahl;
	public double Kurs;
	public double GebuhrInProzent;
	public int KaufenStuckzahl;
	public int VerkaufenStuckzah;

	public int intAt(int num, int index) {
		String s = Integer.toString(num);
		int r = Integer.parseInt(s.substring(index, index + 1));
		return r;
	}

	public int numlength(int n) {
		int l;
		n = Math.abs(n);
		for (l = 0; n > 0; ++l)
			n /= 10;
		return l;
	}

}
