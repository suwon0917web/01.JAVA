
public interface Human {
	void speak();	
	
	// ��ӹ��� Ŭ������ eat �żҵ带 ����Ϸ��� �ݵ�� �����ؾ� �ϰԲ� ����
	default void eat() throws Exception {
		throw new Exception("not Implemented yet....");
	}
}
