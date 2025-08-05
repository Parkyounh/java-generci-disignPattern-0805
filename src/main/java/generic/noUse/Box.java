package generic.noUse;

public class Box {
	private Object object; //Object 클래슨느 모든 클래스의 조상
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
