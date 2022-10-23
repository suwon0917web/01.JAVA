package 기본패키지;

public class Mouse {
	String name, manufactor;

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", manufactor=" + manufactor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Mouse target = (Mouse)obj;
		return this.name.equals(target.name) && this.manufactor.equals(target.manufactor);
	}

	
	
}
