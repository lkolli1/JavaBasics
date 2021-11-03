package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> class1 = Class.forName(Calculator.class.getName());
		System.out.println(class1.getName());
		Constructor<?>[] constructors = class1.getConstructors();
		System.out.println(Arrays.toString(constructors));
		System.out.println(Arrays.toString(class1.getMethods()));
		Constructor<?> constructor = class1.getConstructor(null);
		Constructor<?> constructor1 = class1.getConstructor(double.class,double.class);
		Method method = class1.getMethod("getNum1", null);
		Method method2 = class1.getMethod("getNum2", null);
		Method setNum1 = class1.getMethod("setNum1", double.class);
		Method setNum2 = class1.getMethod("setNum2", double.class);
		Method sum1 = class1.getMethod("sum", int.class,int.class);
		
		try {
			System.out.println(constructor.newInstance(null));
			Object object = constructor1.newInstance(5,12.5);
			System.out.println(method.invoke(object, null));
			System.out.println(method2.invoke(object, null));
			setNum1.invoke(object, 32.3);
			setNum2.invoke(object, 31.2);
			Field num1Field = class1.getDeclaredField("num1");
			num1Field.setAccessible(true);
			Annotation[] annotations = class1.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			MyAnnotation annotation =(MyAnnotation) annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());
			System.out.println(sum1.invoke(object, 56,34));
			num1Field.set(object, 4);
			System.out.println(method.invoke(object, null));
			System.out.println(method2.invoke(object, null));
		
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
