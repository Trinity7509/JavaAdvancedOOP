package ReflectionExersice.pr02PrivateClassFiddling;

import ReflectionExersice.pr02PrivateClassFiddling.com.BlackBoxInt;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        Class clasZ=BlackBoxInt.class;
      Constructor constructor=clasZ.getDeclaredConstructor();
      constructor.setAccessible(true);
        BlackBoxInt box=(BlackBoxInt)constructor.newInstance();


		for(String line=reader.readLine();!line.equals("END");line= reader.readLine())
		{
			String[] details=line.split("_");
			String command=details[0];
			int innerValue=Integer.valueOf(details[1]);

            Method method=clasZ.getDeclaredMethod(command,int.class);
            method.setAccessible(true);
            Object r=method.invoke(box,innerValue);

			Field field=clasZ.getDeclaredField("innerValue");
			field.setAccessible(true);
            System.out.println(field.get(box));





		}

	}
}
