package ReflectionExersice.pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Main {
	public static void main(String[] args) throws IOException {
		Class clasz = RichSoilLand.class;
		Field[] field = clasz.getDeclaredFields();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




		for (String line = reader.readLine(); !line.equals("HARVEST");line= reader.readLine()) {
			switch (line) {
				case "protected":
					for (Field field1 : field) {
						int modifiers = field1.getModifiers();
						if (Modifier.isProtected(modifiers)) {
							System.out.printf("protected %s %s%n", field1.getType().getSimpleName(), field1.getName());
						}

					}
					break;
				case "private":
					for (Field field1 : field) {
						int modifiers = field1.getModifiers();
						if (Modifier.isPrivate(modifiers)) {
							System.out.printf("private %s %s%n", field1.getType().getSimpleName(), field1.getName());
						}

					}
						break;
				case "public":
					for (Field field1 : field) {
						int modifiers =field1.getModifiers();
						if (Modifier.isPublic(modifiers)) {
							System.out.printf("public %s %s%n", field1.getType().getSimpleName(), field1.getName());
						}
					}
						break;
				case "all":
					for (Field field1 : field) {
						int modifiers = field1.getModifiers();
						String accessModifier = Modifier.toString(modifiers).split("\\s+")[0];
						System.out.printf("%s %s %s%n", accessModifier, field1.getType().getSimpleName(), field1.getName());
					}
					}
			}

		}
	}



