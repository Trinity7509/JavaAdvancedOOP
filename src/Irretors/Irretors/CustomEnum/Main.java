package Irretors.Irretors.CustomEnum;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Class<?> rankClass= Class.forName("Irretors.Irretors.CustomEnum.Card" +reader.readLine());
        EnumAnnotation annotation=rankClass.getAnnotation(EnumAnnotation.class);
        System.out.printf("Type = %s, Description = %s",annotation.type(),annotation.description());
    }
}
