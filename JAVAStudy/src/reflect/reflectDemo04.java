package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo04 {
	//�������캯��,ʵ��������
	public static void oprateConstructor() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
			//��ȡ�����Ĺ��췽��
			Constructor<?> constructor = perClazz.getConstructor(String.class);
			persion newInstance = (persion)constructor.newInstance("����");
			//��ȡ˽�еĹ��췽��
			Constructor<?> constructor2 = perClazz.getDeclaredConstructor(int.class);
			constructor2.setAccessible(true);
			persion newInstance2 = (persion)constructor2.newInstance(2);
			
			System.out.println(constructor);
			System.out.println(newInstance);
			
			System.out.println(constructor2);
			System.out.println(newInstance2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		oprateConstructor();
		
	}
}
