package ru.croc.java.demo4.generic;

/**
 * Обертка над объектом для безопасной работы значениями null.
 * @param <T> тип объект
 */
public class Optional<T> {
    /** Объект. */
    private T value;

    /**
     * Обертка над объектом.
     *
     * @param value объект
     */
    private Optional(T value) {
        this.value = value;
    }

    /**
     * Оборачивает объект в optional.
     *
     * @param value объект
     * @return объект обернутый в optional
     */
    public static <T> Optional<T> of(T value) {
        return new Optional<>(value);
    }

    /**
     * Проверяет существует ли значение.
     *
     * @return признак существования
     */
    public boolean isPresent() {
        return value != null;
    }

    /**
     * Возвращает значение.
     *
     * @return значение
     */
    public T get() {
        return value;
    }
}
