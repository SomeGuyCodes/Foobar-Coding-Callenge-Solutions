package com.forth;

public class Main {

    public static void main(String[] args) {
	int[] crap = {13,5,6,2,5};
	int[] crap0 = {5,2,5,13};
	int[] crap1;
	if(crap.length>crap0.length){
		crap1=crap;
	}else{
		crap1=crap0;
	}
	CC1Solution hope = new CC1Solution();
	System.out.println(hope.solution(crap, crap0));
	//System.out.print(crap0.length);
		/*	int test = 0;
		for(int i=0; i< crap0.length; i++){
			for(int j=0; j<crap.length; j++){
				System.out.print("i equals:" + i + "And j equals:" + j + "Test equals" + test + "\n");
				test++;
			}
		}*/


    }
}
