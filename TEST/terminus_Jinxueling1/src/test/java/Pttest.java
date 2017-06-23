package test.java;

import java.util.Scanner;

import org.junit.Test;

import main.java.Pt;


public class Pttest {
	
	@Test
	public void testPttest(){
		
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();  
	
	StringBuffer Pstr = null;
	Pt pt = new Pt(a,b,c);
	if(a*b*c==0){
		Pstr = pt.ptMarksContainzero();
	}else{
		Pstr = pt.ptMarks();
	}
	System.out.println(Pstr);
	}
}
