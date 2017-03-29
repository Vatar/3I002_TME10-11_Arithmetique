package pobj.partiel2012nov;

public class Constante implements Expression{
	private int cst;
	
	public Constante(int entier){
		cst=entier;
	}
	
	public Constante() {
		cst=0;
	}

	public int getValue(){
		return cst;
	}
	
	@Override
	public boolean equals(Object a){
		if(!(a instanceof Constante)){
			return false;
		}
		if(this.cst==((Constante)a).getValue()){
			return true;
		}
		return false;
	}

	@Override
	public int eval() {
		return cst;
	}
	
	@Override
	public <T> T accepte(IVisiteur<T> v) {
		return v.visite(this);
	}
	
}
