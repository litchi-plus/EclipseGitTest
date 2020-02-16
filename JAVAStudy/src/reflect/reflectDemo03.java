package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo03 {
	
	//通过反射获取对象的实例并操作该对象
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
		//操作属性
		Field nameField = perClazz.getDeclaredField("name");
		nameField.setAccessible(true);//访问私有属性，打开访问权限
		nameField.set(per, "nacy");
		System.out.println(per);
		//调用私有方法
		//无参数
		Method method = perClazz.getDeclaredMethod("Sing", null);
		//有参数 ,公共方法
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
