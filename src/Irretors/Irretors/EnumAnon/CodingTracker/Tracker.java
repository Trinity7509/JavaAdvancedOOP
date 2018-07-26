package Irretors.Irretors.EnumAnon.CodingTracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor();
    }

    public static void printMethodsByAuthor() {
        Map<String, List<String>> methodsByAuthor = new HashMap<>();

        Class<?> trackerClass = Tracker.class;
        Method[] declaredMethods = trackerClass.getDeclaredMethods();

        for (Method method : declaredMethods) {
            Author annotation = method.getAnnotation(Author.class);
            if (annotation != null) {
                methodsByAuthor.putIfAbsent(annotation.name(), new ArrayList<>());
                methodsByAuthor.get(annotation.name()).add(method.getName());
            }
        }

        for (String author : methodsByAuthor.keySet()) {
            System.out.println(String.format("%s: %s", author, String.join(", ", methodsByAuthor.get(author))));
        }
    }
}
