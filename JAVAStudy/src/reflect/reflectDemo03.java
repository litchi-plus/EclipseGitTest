package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo03 {
	
	//ͨ�������ȡ�����ʵ���������ö���
	public static void getInstance() throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		}
		persion per = (persion) perClazz.newInstance();
		per.setName("kity");
		per.setAge(8);
		per.setId(1);
		System.out.println(per);
		//��������
		Field nameField = perClazz.getDeclaredField("name");
		nameField.setAccessible(true);//����˽�����ԣ��򿪷���Ȩ��
		nameField.set(per, "nacy");
		System.out.println(per);
		//����˽�з���
		//�޲���
		Method method = perClazz.getDeclaredMethod("Sing", null);
		//�в��� ,��������
		Method method2 = perClazz.getDeclaredMethod("setName", String.class);
		
		method.setAccessible(true);
		method.invoke(per, null);
		
		method2.invoke(per, "kyrie");
		System.out.println(per);
		
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		getInstance();
	}
}
