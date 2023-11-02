import java.util.Arrays;

import static java.lang.StringTemplate.STR;

public class MyClass {
    String firstName;
    String lastName;
    int age;
    String food;
    String[] lessonArray;

    public MyClass(String firstName, String lastName, int age, String food, String[] lessonArray) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.food = food;
        this.lessonArray = lessonArray;
    }

    public MyClass() {
    }

    public void method() {
        System.out.println(STR. """
                name: \{ firstName }
                surname: \{ lastName }
                age: \{ age }
                food: \{ food }
                Peaksoft lessons: \{ Arrays.toString(lessonArray) }
                """ );
    }
}