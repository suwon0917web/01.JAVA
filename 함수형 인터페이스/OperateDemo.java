import java.util.function.IntUnaryOperator;

public class OperateDemo {

	public static void main(String[] args) {
		IntUnaryOperator my2Mode = x-> x % 2;
		System.out.println(my2Mode.applyAsInt(10));

	}

}
