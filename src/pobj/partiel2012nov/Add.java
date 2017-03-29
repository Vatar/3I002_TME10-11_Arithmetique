package pobj.partiel2012nov;

public class Add extends BinOp implements Expression {

	public Add(Expression g, Expression d) {
		super(g, d);
	}
	
	@Override
	public int eval() {		
		return this.getFg().eval() + this.getFd().eval();
	}

	@Override
	public <T> T accepte(IVisiteur<T> v) {
		return v.visite(this);
	}
	

}
