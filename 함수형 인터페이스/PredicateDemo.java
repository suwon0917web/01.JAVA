import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

//class IntPredicateImple implements IntPredicate{
//	@Override
//	public boolean test(int value) {		
//		return value % 2 == 0;
//	}	
//}
public class PredicateDemo {
	public static void main(String[] args) {
//		IntPredicate even = new IntPredicateImple();
//		System.out.println(even.test(3)? "¦��" : "Ȧ��" );
		
//		IntPredicate even = new IntPredicate() {			
//			@Override
//			public boolean test(int value) {
//				return value % 2 == 0;
//			}
//		};		
//		System.out.println(even.test(3)? "¦��" : "Ȧ��" );
		IntPredicate even = x->x % 2 == 0;
		System.out.println(even.test(3)? "¦��" : "Ȧ��" );
		
		IntPredicate one = x->x==1;
		IntPredicate oneOrEven = one.or(even);  // (value) -> test(value) || other.test(value);
		
		int temp = 1;
		if (oneOrEven.test(temp))
		{
		
		}		
		
		if(temp == 1 || temp % 2 == 0) {
			// ����..
		}
		
		Predicate<String> p = x -> x.equals("�̱Կ�");
		System.out.println(p.test("ȫ�浿"));
		System.out.println(p.test("�̱Կ�"));
		
		BiPredicate<Integer, Integer> bi = (x,y) -> x == y;
		System.out.println(bi.test(10, 12));
	}

}
