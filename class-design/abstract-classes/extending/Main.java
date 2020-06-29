public class Main {
	public static void main (String[]args){
	Concrete concrete = new Concrete();
	System.out.println(concrete.getAggregate());
	concrete.mix();
	
	InstantConcrete instantConcrete = new InstantConcrete();
	instantConcrete.mix();
	
	}
}
