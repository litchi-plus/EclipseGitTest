package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectDemo05 {
	public static void dynamicLoad() throws FileNotFoundException, IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		//���������ļ���Ϣ
		Properties properties = new Properties();
		properties.load( new FileReader("class.txt"));
		//��ȡ�����ͷ�����
		String classname = properties.getProperty("classname");
		String methodname = properties.getProperty("methodname");
		//�������
		Class<?> perClazz = null;
		try {
			perClazz = Class.forName(classname);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//��ȡ����
		Method method2 = perClazz.getMethod(methodname);
		method2.invoke(perClazz.newInstance());
		
		
	}
	public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		dynamicLoad();
	}
}
