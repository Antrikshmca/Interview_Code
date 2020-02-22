package com.antriksh.string;

public class FindSubString {

	public boolean contains() {

		String str = "manish";
		String str2 = "ani";
		char chr1[] = str.toCharArray();
		char chr2[] = str2.toCharArray();
		int i = 0, pos = 0;
		boolean flage = true;
		for (i = 0; i < chr1.length; i++) {
			if (chr1[i] == chr2[0]) {
				pos = i;
				for (int k = 0; k < chr2.length; k++) {
					if (chr1[pos++] != chr2[k]) {
						flage = false;
						break;
					}
			
				System.out.println(pos);
				}
				if (!flage) {
					break;
				}
			}
		}
		return flage;
	}

	public static void main(String[] args) {
		FindSubString fis = new FindSubString();
		boolean flag = fis.contains();
		if (flag) {
			System.out.println("Sub String is found");
		} else {
			System.out.println("Sub String is not found");
		}
	}

}
