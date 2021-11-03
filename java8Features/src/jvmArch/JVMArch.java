package jvmArch;

import java.lang.reflect.Method;

public class JVMArch {
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		Method[] methods = Class.forName("functional.Lamda").getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());

		}
		System.out.println(methods.length);
	}
}
