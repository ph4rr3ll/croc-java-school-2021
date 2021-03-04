package ru.croc.java.school;

/**
 * Примеры модификаторов доступа.
 */
public class Access {
    // уровни доступа для полей
    private int a = 0;
    int b = 0;
    protected int c = 0;
    public int d = 0;

    // тоже самое для методов
    private void a() {}
    void b() {}
    protected void c() {}
    public void d() {}
}

/** Класс с уровнем доступа внутри пакета. */
class OtherClass {
    public static void main(String[] args) {
        // нет доступа
//        System.out.println(new Access().a);
        System.out.println(new Access().b);
        System.out.println(new Access().c);
        System.out.println(new Access().d);
    }
}
