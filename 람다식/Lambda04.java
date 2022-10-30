package 람다식;

interface NewObject<T>{
	T getObject(T o);
}
interface NewArray<T>{
	T[] getArray(int size);
}
//class NewObjectImple<T>  implements NewObject<T>
//{
//	@Override
//	public T getObject(T o) {
//		// TODO Auto-generated method stub
//		return null;
//	}	
//}

public class Lambda04 {

	public static void main(String[] args) {
		NewObject<String> s;
		NewArray<Integer> ia;	
		s = x -> x;			
//		String str = "123";
//		System.out.println( s.getObject(str));
		
		// 람다를 이용해서 생성자를 호출
		s = String::new;
		s.getObject("abc");
		
		// 크기가 2인 정수형 배열
//		Integer[] iary = new Integer[2];
//		ia = size->new Integer[size];
		ia = Integer[]::new;
		Integer[] newAry =  ia.getArray(10);
		
		
		
		
	}

}
