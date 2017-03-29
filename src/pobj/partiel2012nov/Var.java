package pobj.partiel2012nov;

public class Var implements Expression{
	private final String nom;
	
	public Var(String nom){
		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}
	
	public boolean equals(Object a){
		if(!(a instanceof Var)){
			return false;
		}
		
		if( ((Var)a).getNom()==this.nom){
			return true;
		}
		return false;
	}
	
	@Override
	public int eval() {
		throw new UnsupportedOperationException("Variable not evaluable");
	}

	@Override
	public <T> T accepte(IVisiteur<T> v) {
		return v.visite(this);
	}
	
}
