package pobj.partiel2012nov.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pobj.partiel2012nov.Add;
import pobj.partiel2012nov.Constante;
import pobj.partiel2012nov.Expression;
import pobj.partiel2012nov.Mul;
import pobj.partiel2012nov.Var;

public class TestQ4 {

	@Test
	public void testEval() {
		Expression e1 = e1() ;
		
		assertEquals("( 2 + 3 ) * 4", e1.toString());
		
		Expression e2 = e2() ;
		
		assertEquals("( x + 3 ) * ( x + 4 )", e2.toString());
		
		Expression e3 = e3() ;
		
		assertEquals("( x + 10 ) * ( y + -8 )", e3.toString());
		
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
