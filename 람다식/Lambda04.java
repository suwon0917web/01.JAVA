package ���ٽ�;

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
		
		// ���ٸ� �̿��ؼ� �����ڸ� ȣ��
		s = String::new;
		s.getObject("abc");
		
		// ũ�Ⱑ 2�� ������ �迭
//		Integer[] iary = new Integer[2];
//		ia = size->new Integer[size];
		ia = Integer[]::new;
		Integer[] newAry =  ia.getArray(10);
		
		
		
		
	}

}
