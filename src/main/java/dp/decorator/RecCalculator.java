package dp.decorator;

public class RecCalculator implements Calculator{

	@Override
	public long factorial(long num) {
		if(num==2) {
			return 2;
		}else {
			return num*factorial(num -1);
		}
	}
}
