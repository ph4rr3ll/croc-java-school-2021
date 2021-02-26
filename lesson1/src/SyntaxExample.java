/**
 * Материалы с занятия от 25 февраля 2021.
 *
 * Тема: Структура программы на языке Java. Синтаксис языка Java.
 */
public class SyntaxExample {

    public static void main(String[] args) {
        /*
         * Объявление переменных, именование переменных, нюансы использования литералов.
         */
        boolean isLessonInteresting = true;
        float $_currency = 1;
        float $_currency_1 = 2;
        long billion = 1_000_000_000;
        int million = 1_000_0_0_0;
        printFloat(1.1f);

        /*
         * Классы-обертки, autoboxing.
         */
        Integer firstWrappedNumber = new Integer(1);
        Integer secondWrappedNumber = 2;

        /*
         * Условный оператор, короткая и полная формы логических операторов && (&), || (|).
         */
        if (billion == 1000000000 || $_currency > 1) {
            System.out.println("Condition is completed");
        } else {
            System.out.println("Condition isn't completed");
        }

        if ($_currency < $_currency_1) {
            System.out.println("Some text");
        }

        if (firstWrappedNumber > secondWrappedNumber) {
            System.out.println("Another text");
        }

        /*
         * Оператор switch-case.
         */
        String name = "Иван";
        switch (name) {
            case "Вася":
                System.out.println("Нот Мэтч!");
                break;
            case "Иван":
                System.out.println("Мэтч!");
                break;
            default:
                System.out.println("Эээ");
        }

        /*
         * Объявление массивов, циклы.
         */
        int[] array1 = new int[]{1, 2, 3};
        int array2[] = new int[]{2, 3, 1};

        int[] array3[];
        // for
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        // while
        int i = 0;
        while (i < array2.length) {
            System.out.println(array2[i]);
            i++;
        }
        // do while
        i = 0;
        do {
            System.out.println(array2[i]);
            i++;
        } while (i < array2.length);
        // for-each
        for (int elem : array1) {
            System.out.println(elem);
        }
    }

    public static void printFloat(float f) {
        System.out.println(f);
    }
}
















