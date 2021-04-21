package ru.cror.java.school.homework6.in;

import java.util.List;

public class Film {
    String title;
    String description;
//    @XmlWrapper("screenwriters")
//    @XmlElement("screenWriter")
    List<Person> screenWriters;
    List<Person> directors;

}
