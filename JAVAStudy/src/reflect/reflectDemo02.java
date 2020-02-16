package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//ͨ�������ȡ����
public class reflectDemo02 {
	//��ȡ���еĹ����������������࣬�ӿں͸��ࣩ
	public static void getMethod1() {
		try {
			Class<?> perClazz =  Class.forName("reflect.persion");
			Method [] methods =  perClazz.getMethods();
			for(Method method:methods) {
				System.out.println(method);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//��ȡ��������з�����private,protected,public��
	public static void getMethod2() {
		try {
			Class<?> perClazz =  Class.forName("reflect.persion");
			Method [] methods =  perClazz.getDeclaredMethods();
			for(Method method:methods) {
				System.out.println(method);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}			
	}
	//��ȡ���еĽӿ�
	public static void getInterface() {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
			Class<?>[] interfaces =  perClazz.getInterfaces();
			for(Class<?> inte:interfaces) {
				System.out.println(inte);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//��ȡ���еĸ���
	public static void getParant() {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
			Class<?> superclass = perClazz.getSuperclass();
				System.out.println(superclass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//��ȡ���й����Ĺ��췽��
	public static void getConstructor() throws NoSuchMethodException, SecurityException {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
			Constructor<?>[] constructor =  perClazz.getConstructors();
			for(Constructor<?> con:constructor) {
				System.out.println(con);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	//��ȡ���еĹ�������
	public static void getProperty() {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
			Field[] fields = perClazz.getFields();
			for(Field field:fields) {
				System.out.println(field);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//��ȡ���е�����
	public static void getProperty2() {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Field[] fields =  perClazz.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field);
		}
				
		
	}
	//��ȡ��ǰ������������ࣨ�ӿڣ��Ķ���ʵ����
	public static void getInstance() throws InstantiationException, IllegalAccessException {
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName("reflect.persion");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Object obj = perClazz.newInstance();
		persion per = (persion)obj;
		per.speak();
	}
		
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
//		getMethod();
//		getMethod2();
//		getInterface();
//		getParant();
//		getConstructor();
//		getProperty();
//		getProperty2();
		getInstance();
	}
}
