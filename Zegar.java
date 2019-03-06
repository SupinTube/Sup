package com.ap.vl;

public class Zegar {
	public String oblicz(int a, int b, int c, int d) {
		int[] arr = { a, b, c, d };
		//max: 23:56
		String out = new String();
		out = out + positioner(arr, 2);
		out = out + positioner(arr, 3);
		out = out + ":";
		out = out + positioner(arr, 5);
		out = out + positioner(arr, 6);
		
		System.out.println(out);
		return null;
	}

	public int positioner(int[] array, int max) {
		int out = 0;
		int iout = -1;
		for (int i = 0; i < 4; i++) {
			if (array[i] <= max && array[i] > out) {
					iout = i;			
			}
		}
		
		out = array[iout];
		array[iout] = -1;
		return out;
	}

}

