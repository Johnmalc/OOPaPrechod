package interfaces;

import java.util.*;

public class TestInterface 
{
	public static void main(String[] args) 
	{
		String[] ar = {"eins","zwei","drei","sechs","sieben","9"};
		final int LEN = ar.length;
		StringL[] arl = new StringL[LEN];
		//arl[0] = new StringL("test");
		for (int i=0; i<LEN; i++)
		{
			arl[i] = new StringL(ar[i]);
			System.out.println("\t"+arl[i]);
		}
		Arrays.sort(arl);
		System.out.println("L-sortiert");
		for (int i=0; i<LEN; i++)
		{
			System.out.println("\t"+arl[i]);
		}
		Arrays.sort(ar);
		System.out.println("String-sortiert");
		for (int i=0; i<LEN; i++)
		{
			System.out.println("\t"+ar[i]);
		}
	}
	

}
