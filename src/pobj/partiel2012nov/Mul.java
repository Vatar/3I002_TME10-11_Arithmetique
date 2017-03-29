package pobj.partiel2012nov;

public class Mul extends BinOp implements Expression {

	public Mul(Expression g, Expression d) {
		super(g, d);
	}

	@Override
	public int eval() {
		return this.getFg().eval() * this.getFd().eval();
	}
	
	@Override
	public <T> T accepte(IVisiteur<T> v) {
		return v.visite(this);
	}

}
