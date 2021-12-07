package exercice;

public interface Expr {
	public double eval();
}

class Value implements Expr{
	public final double nombre;
	
	public Value(double monNombre) {
		this.nombre = monNombre;
	}	
	@Override
	public String toString() {
		return String.valueOf(nombre);
	}	
	@Override
	public double eval() {
		return nombre;
	}
}

class Add implements Expr {
	private final Expr numero1, numero2;

	public Add(Expr nombre1, Expr nombre2) {
		numero1=nombre1;
		numero2=nombre2;
	}	
	@Override
	public double eval() {
		return numero1.eval() + numero2.eval();
	}	
	@Override
	public String toString() {
		return numero1.toString()+'+'+ numero2.toString();
	}
}

 class CalculRacine implements Expr{
	public final Expr racine;
	public CalculRacine(Expr MaRacine) {
		this.racine = MaRacine;
	}
	@Override
	public double eval() {
		return Math.sqrt(racine.eval());
	}	
	@Override
	public String toString() {
		return "\u221a("+racine+")";
	}	
}

class Main {
	
	public static void main(String[] args) {
		Expr val = new Value(1337);
		System.out.println(val.eval());
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval());
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval());
		
		
		
	}
	
}