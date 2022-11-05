import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {		
		String filename = "001.jpg";
		Consumer<String> c1 = x->System.out.println(x.endsWith(".jpg")? "jpg����":"jpg�����̾ƴմϴ�.");
		c1.accept(filename);
		
		BiConsumer<String, String> c2 = (x,y)->System.out.println(x + " " + y);
		c2.accept("abc", "aaa");
		
		ObjIntConsumer<String> s3  = (x, y)->{
			for (int i = 0; i < y; i++) {
				System.out.println(x);
			}
		};
		s3.accept("�ȳ��ϼ���", 3);
		
		IntConsumer c4 = x-> System.out.print("���밪�� : " + (x>0? x: -x)+" ");
		IntConsumer c5 = c4.andThen( x->System.out.println("������ :" + x*x) );
		c5.accept(-3);
	}

}
