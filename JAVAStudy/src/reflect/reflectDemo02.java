package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射获取方法
public class reflectDemo02 {
	//获取所有的公共方法（包括本类，接口和父类）
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
	//获取该类的所有方法（private,protected,public）
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
	//获取所有的接口
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
	//获取所有的父类
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
	//获取所有公共的构造方法
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
	//获取所有的公共属性
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
	//获取所有的属性
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
	//获取当前反射所代表的类（接口）的对象（实例）
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
