package ru.croc.java.school.b;

// обычный импорт
import ru.croc.java.school.Access;
import ru.croc.java.school.Animal;
// импорт поумолчанию
import java.lang.*;

// статический импорт
import static ru.croc.java.school.Animal.sum;

public class Other {
    String text;
    Animal animal;

    public static void main(String[] args) {
        // Вызов static методов + varargs
        System.out.println(sum(new int[] {1, 2, 3} ));
        System.out.println(Animal.sum(1, 2, 3));

        // нет доступа
//        new Access().a
//        new Access().b
//        new Access().c
        System.out.println(new Access().d);
    }
}

class ChildAccess extends Access {
    public ChildAccess() {
        // нет доступа
        //        new Access().a
        //        new Access().b
        // доступ к protected
        System.out.println(super.c);
        System.out.println(super.d);
    }
}
