package pobj.partiel2012nov;

import java.util.Map;

public class VisiteurEvalVar extends VisiteurEval {
	private Map<String,Integer> env;
	
	public VisiteurEvalVar(Map<String,Integer> env){
		this.env=env;
	}
	
	@Override
	public Integer visite(Var v) {
		if(env.get(v.getNom())==null){
			throw new UnsupportedOperationException("Variable not"
					+ " defined in environment \n");
		}
		return env.get(v.getNom());
	}
	
}
