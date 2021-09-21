

public interface AdvArithmetic  {

	default void divisorSum(int n) {
		
	}
}
package adv;

public class Mycalculator implements AdvArithmetic {

	int s=0;
	public void divisorSum(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				s=s+i;
			}
		}
		System.out.println("   divisor sum is " +s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalculator m = new Mycalculator();
		m.divisorSum(6);


	}

}
