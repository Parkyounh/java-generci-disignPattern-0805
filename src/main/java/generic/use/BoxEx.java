package generic.use;

class Apple{}

public class BoxEx {
	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.set("홍길동"); //String이 Object으로 자동형변환
		String name =box.get(); //제네릭을 사용해서 강제 형변환 안함
		System.out.println(name);

		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
		Apple apple = box2.get();
	}
	
}
