package pobj.partiel2012nov;

public abstract class BinOp {
	private final Expression fg;
	private final Expression fd;
	
	public BinOp(Expression g, Expression d){
		fg=g;
		fd=d;
	}
	
	public Expression getFg(){
		return fg;
	}
	
	public Expression getFd(){
		return fd;
	}
	
}
