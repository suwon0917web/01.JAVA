package ���ٽ�;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle>{
	int width,height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int findArea() {
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Rectangle o) {		
		return this.findArea() - o.findArea();
	}
}
class RectangleCompare implements Comparator<Rectangle>{
	@Override
	public int compare(Rectangle o1, Rectangle o2) {		
		return o1.height - o2.height	;
	}	
}

class RectangleCompare2 implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle o1, Rectangle o2) {		
		return 2*(o1.width + o1.height) - 2*(o2.width + o2.height);
	}
	
}

public class ComparableDemo {
	public static void main(String[] args) {
		int[] numbers = {1,7,5,9,3,2};
		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.println(i);
		}
		Rectangle[] recs = {
				new Rectangle(2, 10),  // 20
				new Rectangle(2, 3),  // 6
				new Rectangle(5, 5)    // 25
		};
		Arrays.sort(recs);
		for (Rectangle rectangle : recs) {
			System.out.print(rectangle.findArea()+" ");
		}
		
		System.out.println();
		
		Arrays.sort(recs,new RectangleCompare());
		for (Rectangle rectangle : recs) {
			System.out.print(rectangle.height+" ");
		}
		
		//�簢���� �ѷ��� ���̸� �������� ����  2*(width+heigh)
		Arrays.sort(recs,new RectangleCompare2());
		for (Rectangle rectangle : recs) {
			System.out.print(rectangle+" ");
		}
		//�͸�Ŭ����
		Arrays.sort(recs,
				new Comparator<Rectangle>() {
					@Override
					public int compare(Rectangle o1, Rectangle o2) {						
						return o1.width - o2.width;
					}				
				}
				);
		
		for (Rectangle rectangle : recs) {
			System.out.print(rectangle+" ");
		}
		
		// ���� ���ٽ� ����
		Arrays.sort(recs, (x,y)->x.findArea() - y.findArea()   );
		
		Arrays.sort(recs,  (x,y) -> {return x.findArea() - y.findArea();});
		
		Arrays.sort(recs,  (x,y) -> {return x.findArea() - y.findArea();});
		
		Arrays.sort(recs, (Rectangle x,Rectangle y)->x.findArea() - y.findArea()   );
		
	}
}









