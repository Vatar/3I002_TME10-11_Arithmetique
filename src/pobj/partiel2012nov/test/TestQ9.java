package pobj.partiel2012nov.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pobj.partiel2012nov.VisiteurEvalVar;

public class TestQ9 {

	@Test
	public void testEval() {
		VisiteurEvalVar v=new VisiteurEvalVar(TestQ8.env2());
		
		assertEquals(TestQ4.e1().accepte(v).intValue(), 20);
		
		
		assertEquals(TestQ4.e2().accepte(v).intValue(), 182);
		
		
		assertEquals(TestQ4.e3().accepte(v).intValue(), 20*12);
		
	}
	
}
