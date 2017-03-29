package pobj.partiel2012nov.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pobj.partiel2012nov.Add;
import pobj.partiel2012nov.Constante;
import pobj.partiel2012nov.Expression;
import pobj.partiel2012nov.Mul;
import pobj.partiel2012nov.Var;
import pobj.partiel2012nov.VisiteurEval;

public class TestQ7 {

	@Test
	public void testEval() {
		
		VisiteurEval vts = new VisiteurEval();

		Constante ct = new Constante(3);
		Constante ct2 = new Constante(5);
		Constante ct3 = new Constante(17);
		
		assertEquals(3, ct.accepte(vts).intValue());;
		assertEquals(5, ct2.accepte(vts).intValue());;
		assertEquals(17, ct3.accepte(vts).intValue());;
		
		Expression var = new Var("a");
		try {
			var.accepte(vts);
			// should raise an exception		VisiteurTS vts = new VisiteurTS();

			fail();
		} catch (UnsupportedOperationException e) {
			// happy
			assertTrue(true);
		}
		
		Expression add = new Add(ct, ct2);
		assertEquals((5+3), add.accepte(vts).intValue());

		Expression mul = new Mul(ct3, add);
		assertEquals(17 * (5+3), mul.accepte(vts).intValue());
		
		Expression tot = new Mul(mul, var);
		
		try {
			tot.accepte(vts);
			// should raise an exception
			fail();
		} catch (UnsupportedOperationException e) {
			// happy
			assertTrue(true);
		}
	}
	
	

	public static Expression e1 () {
		return new Mul(new Add(new Constante(2), new Constante(3)),new Constante(4));
	}
	
	public static Expression e2 () {
		return new Mul(new Add(new Var("x"), new Constante(3)),new Add(new Var("x"),new Constante(4)));
	}
	
	
	public static Expression e3 () {
		return new Mul(new Add(new Var("x"), new Constante(10)),new Add(new Var("y"),new Constante(-8)));
	}
	
}
