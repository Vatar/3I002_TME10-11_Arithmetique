package pobj.partiel2012nov;

public class VisiteurEval implements IVisiteur<Integer> {

	@Override
	public Integer visite(Constante c) {
		return new Integer(c.getValue());
	}

	@Override
	public Integer visite(Add e) {
		return new Integer(e.getFg().accepte(this)+e.getFd().accepte(this));
	}

	@Override
	public Integer visite(Mul e) {
		return new Integer(e.getFg().accepte(this)*e.getFd().accepte(this));

	}

	@Override
	public Integer visite(Var v) {
		throw new UnsupportedOperationException("VisitorEval cannot evaluate Variable \n");
	}

}
