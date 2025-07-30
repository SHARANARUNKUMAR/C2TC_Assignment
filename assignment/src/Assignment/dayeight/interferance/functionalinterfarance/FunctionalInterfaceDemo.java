package Assignment.dayeight.interferance.functionalinterfarance;

public class FunctionalInterfaceDemo {


		public static void main(String[] args) {
			GreatClass g = new GreatClass();
			System.out.println(g.greet());

			//using Lambda Expression
			GreatInterference g1 = () -> 
			{
				return "Good Afternoon";
			};
			System.out.println(g1.greet());
            }
	        }




