import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {		
		String filename = "001.jpg";
		Consumer<String> c1 = x->System.out.println(x.endsWith(".jpg")? "jpg파일":"jpg파일이아닙니다.");
		c1.accept(filename);
		
		BiConsumer<String, String> c2 = (x,y)->System.out.println(x + " " + y);
		c2.accept("abc", "aaa");
		
		ObjIntConsumer<String> s3  = (x, y)->{
			for (int i = 0; i < y; i++) {
				System.out.println(x);
			}
		};
		s3.accept("안녕하세요", 3);
		
		IntConsumer c4 = x-> System.out.print("절대값은 : " + (x>0? x: -x)+" ");
		IntConsumer c5 = c4.andThen( x->System.out.println("제곱은 :" + x*x) );
		c5.accept(-3);
	}

}
