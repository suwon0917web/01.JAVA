package review;

import java.util.ArrayList;
import java.util.List;

class TempTest{
	private int value;
	// alt+shift+s
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TempTest [value=" + value + "]";
	}

	
}

public class Review5 {

	// 시작함수
	public static void main(String[] args) {
		List<TempTest> lists = new ArrayList<TempTest>();		
		for (int i = 0; i < 3; i++) {
			TempTest t = new TempTest();			
			t.setValue(i);			
			lists.add(t);
//			System.out.print(lists+" ");
		}
		
		for (TempTest tempTest : lists) {
			System.out.println(tempTest.getValue());
		}
	}


}
