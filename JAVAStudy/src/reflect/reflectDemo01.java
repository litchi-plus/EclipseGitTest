package reflect;

//ͨ�������ȡ��
public class reflectDemo01 {

	//��ȡ�������(�������) ���� class ��ȡ�ķ�ʽ������
		/**
		 * 1.Class.forName(ȫ����(����+����))
		 * 2.����.class
		 * 3.����.getClass()
		 */
	public static void main(String[] args) {
		//1.Class.forName()
		try {
		Class<?> perClazz = Class.forName("reflect.persion");
		System.out.println(perClazz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2.����.class
		Class<?> perClazz1 = persion.class;
		System.out.println(perClazz1);
		//3.����.getClass()
		persion per = new persion();
		Class<?> perClazz2 = per.getClass();
		System.out.println(perClazz2);
	}
}
