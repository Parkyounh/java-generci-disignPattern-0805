package dp.adapter;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() { //어뎁터 기능
		showWithParen();
		
	}

	@Override
	public void printStrong() { //어뎁터 기능
		showWithAster();
	}

}
