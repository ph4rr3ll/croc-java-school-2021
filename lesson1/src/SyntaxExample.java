public class SyntaxExample {

    public static void main(String[] args) {
        boolean isLessonInteresting = true;
        float $_currency = 1;
        float $_currency_1 = 2;
        long billion = 1_000_000_000;
        int million = 1_000_0_0_0;

        printFloat(1.1f);

        byte number1 = 120;

        Integer firstWrappedNumber = new Integer(1);
        Integer secondWrappedNumber = 2;

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

        int[] array1 = new int[]{1, 2, 3};
        int array2[] = new int[]{2, 3, 1};

        int[] array3[];

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

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int i = 0;
        while (i < array2.length) {
            System.out.println(array2[i]);
            i++;
        }

        for (int elem : array1) {
            System.out.println(elem);
        }
    }

    public static void printFloat(float f) {
        System.out.println(f);
    }
}
















