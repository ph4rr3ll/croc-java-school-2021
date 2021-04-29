package ru.croc.java.school.demo10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.oracle.com/");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
