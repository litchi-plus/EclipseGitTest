package reflect;

//通过反射获取类
public class reflectDemo01 {

	//获取反射入口(反射入口) 类型 class 获取的方式有三种
		/**
		 * 1.Class.forName(全类名(包名+类名))
		 * 2.类名.class
		 * 3.对象.getClass()
		 */
	public static void main(String[] args) {
		//1.Class.forName()
		try {
		Class<?> perClazz = Class.forName("reflect.persion");
		System.out.println(perClazz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2.类名.class
		Class<?> perClazz1 = persion.class;
		System.out.println(perClazz1);
		//3.对象.getClass()
		persion per = new persion();
		Class<?> perClazz2 = per.getClass();
		System.out.println(perClazz2);
	}
}
