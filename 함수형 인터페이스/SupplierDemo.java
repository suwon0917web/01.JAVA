import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s1 = ()->"»ç°ú";
		System.out.println(s1.get());
		
		int[] num = {0};
		IntSupplier s2 = ()-> num[0]++;   // int getAsInt();
		System.out.println(s2.getAsInt());
		System.out.println(num[0]);
		
		System.out.println(new Date());
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println( simpleFormat.format(new Date()) );
		
		
		Supplier<SimpleDateFormat> c3 = ()->new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");		
		Supplier<String> c4 = ()->c3.get().format(new Date());
		System.out.println(c4.get());
		
		
	}

}
