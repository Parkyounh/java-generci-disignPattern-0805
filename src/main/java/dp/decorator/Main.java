package dp.decorator;

public class Main {
	
	public static void main(String[] args) {
		ExeTimeCalculator cal1 = new ExeTimeCalculator(new RecCalculator());  //재귀
		System.out.println(cal1.factorial(20));
		
		ExeTimeCalculator cal2 = new ExeTimeCalculator(new ImpeCalculator());  //for문
		System.out.println(cal2.factorial(20));
	}
}
