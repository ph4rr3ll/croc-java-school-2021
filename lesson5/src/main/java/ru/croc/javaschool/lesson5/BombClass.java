package ru.croc.javaschool.lesson5;

public class BombClass {

    public int divideByZero(int number) {
        return number / 0;
    }

    public String getSeason(int month) throws Exception {
        switch (month) {
            case 1:
            case 2:
            case 12:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Autumn";
            default:
                throw new Exception("No such a season");
        }
    }
}
