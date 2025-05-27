import java.lang.reflect.Method;
public class ReflectionDemo 
{
    public static void main(String[] args) throws Exception 
   {
        Class<?> cls = Class.forName("ExampleClass");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods)
	 {
            System.out.println("Method: " + method.getName());
            Class<?>[] params = method.getParameterTypes();
            for (Class<?> param : params) 
		{
                System.out.println("   Parameter: " + param.getName());
            }
        }
        Method privateMethod = cls.getDeclaredMethod("square", int.class);
        privateMethod.setAccessible(true); 
        int result = (int) privateMethod.invoke(obj, 5);
        System.out.println("Invoked square(5): " + result);
        Method publicMethod = cls.getDeclaredMethod("sayHello", String.class);
        publicMethod.invoke(obj, "Student");
    }
}
