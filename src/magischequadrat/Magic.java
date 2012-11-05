package magischequadrat;

import Prog1Tools.IOTools;

public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int n = 0;
				
	    while ((n%2==0) | (n<3) | (n>9)) {
			n = IOTools.readInt("UNgerade zw 1 und 10");
			System.out.println("Ihre zahl is richtig " + n);
			
			int[][] quad = new int [n][n];
			
			int zeile = n/2;
			int spalte = n/2 + 1;
			
			for(int i = 1; i <= n*n; i++ ){
				i = quad [zeile] [spalte];
				spalte = spalte +1; 
				zeile = zeile -1;
				if(zeile < 0) {
					zeile = n-1;
				}
				if(spalte == n) {
					spalte = 0;
				}
				if(quad[zeile][spalte] != 0) {
						zeile+=1;
						spalte+=1;
				if(zeile == n) {
						zeile = 0;
				}
				if(spalte == n) {
						spalte =0;
					}
				}
			}
		for(int i = 0; i < quad.length; i++) {
				for(int j = 0; j < quad[i].length;) {
					if(quad[i][j] < 10) {
				        System.out.print(" ");
						System.out.print(" " + quad[i][j]);
					}
			    System.out.println();
			}
		}
	}
	    }}
			
