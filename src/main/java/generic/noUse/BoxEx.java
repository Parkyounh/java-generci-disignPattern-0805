package generic.noUse;

class Apple{}

public class BoxEx {
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동"); //String이 Object으로 자동형변환
		String name =(String)box.get(); //Object가 String으로 강제형변화ㅏㄴ
		System.out.println(name);
		
		Box box2 = new Box();
		box2.set(new Apple());
		Apple apple = (Apple) box2.get();
	}
	
}
