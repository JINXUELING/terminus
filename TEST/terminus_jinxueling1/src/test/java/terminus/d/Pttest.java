package terminus.d;

import java.util.Scanner;

import org.junit.Test;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;


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
