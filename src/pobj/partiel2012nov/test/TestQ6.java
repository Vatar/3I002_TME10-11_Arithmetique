package pobj.partiel2012nov.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pobj.partiel2012nov.Add;
import pobj.partiel2012nov.Constante;
import pobj.partiel2012nov.Expression;
import pobj.partiel2012nov.Mul;
import pobj.partiel2012nov.Var;
import pobj.partiel2012nov.VisiteurTS;

public class TestQ6 {

	@Test
	public void testEval() {
		
		VisiteurTS vts = new VisiteurTS();
		Var var = new Var ("a");
		Constante ct = new Constante(3);
		
		Add add = new Add(var, ct);
		assertEquals("( a + 3 )", add.accepte(vts));
				
		Constante c2 = new Constante(5);
		Mul mul = new Mul(c2, add);
		assertEquals("5 * ( a + 3 )", mul.accepte(vts));
	
		Expression e1 = e1() ;
		
		assertEquals("( 2 + 3 ) * 4", e1.accepte(vts));
		
		Expression e2 = e2() ;
		
		assertEquals("( x + 3 ) * ( x + 4 )", e2.accepte(vts));
		
		Expression e3 = e3() ;
		
		assertEquals("( x + 10 ) * ( y + -8 )", e3.accepte(vts));
		
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
