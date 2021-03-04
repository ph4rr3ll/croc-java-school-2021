package ru.croc.java.school.dictionary;

import java.util.Arrays;

/**
 * Справочник.
 */
public class Dictionary {
    private Record[] records = new Record[] {};


    /**
     * Добавить новую запись.
     *
     * @param record запись
     */
    public void add(Record record)  {
        records = Arrays.copyOf(records, records.length + 1);
        records[records.length - 1] = record;
    }

    /**
     * Удаляет запись из справочника.
     *
     * @param record удаляемая запись
     */
    public void remove(Record record) {
        final Record[] newRecords = new Record[records.length - 1];
        int index = 0;
        for (Record currentRecord : records) {
            if (currentRecord != record) {
                newRecords[index++] = currentRecord;
            }
        }
        records = newRecords;
    }

    /**
     * Возвращает все записи.
     *
     * @return список записей
     */
    public Record[] records() {
        return Arrays.copyOf(records, records.length);
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add(new Record("1"));
        dictionary.add(new Record("2"));
        dictionary.add(new Record("3"));

        System.out.println(Arrays.toString(dictionary.records()));
        dictionary.remove(dictionary.records()[1]);
        System.out.println(Arrays.toString(dictionary.records()));
    }
}
