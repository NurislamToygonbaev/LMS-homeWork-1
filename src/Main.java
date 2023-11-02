import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] lessonArray = {"java", "prac", "eng"};
        MyClass myClass = new MyClass("Nurislam", "Toigonbaev", 25,
                "Шашлык", lessonArray);
        myClass.method();

        MyClass myClass1 = new MyClass();
        myClass1.firstName = "Nurlan";
        myClass1.lastName = "Abibillaev";
        myClass1.age = 20;
        myClass1.food = "shaurma";
        myClass1.lessonArray = new String[]{"java", "prac", "eng"};
        System.out.println(STR. """
                name: \{ myClass1.firstName }
                surname: \{ myClass1.lastName }
                age: \{ myClass1.age }
                food: \{ myClass1.food }
                Peaksoft lessons: \{ Arrays.toString(myClass1.lessonArray) }
                """ );

    }
}