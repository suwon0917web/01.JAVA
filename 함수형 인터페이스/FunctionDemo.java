import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> add = x-> x+x;
		Function<Integer, Integer> mul = x-> x*x;
		System.out.println(add.apply(10));
		System.out.println(mul.apply(10));
		System.out.println(add.andThen(mul).apply(10));
		
		IntToDoubleFunction half = x-> x / 2.0;
		System.out.println(half.applyAsDouble(13));
		
		ToDoubleBiFunction<Integer, Integer> triarea = (x,y)->x*y/2.0;
		System.out.println(triarea.applyAsDouble(10, 5));

	}

}
