package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {

		String s = "greens";
		
		Map<Character,Integer> mp = new LinkedHashMap<>();
		
		for (int i = 0; i <s.length(); i++) {
			char charAt = s.charAt(i);
			
			if (mp.containsKey(charAt)) {
				Integer integer = mp.get(charAt);
				mp.put(charAt, integer+1);
				
			} else {
mp.put(charAt, 1);
			}
			
		}
		System.out.println(mp);
	}
}
