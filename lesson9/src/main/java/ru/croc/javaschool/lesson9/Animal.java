package ru.croc.javaschool.lesson9;

/**
 * Животное.
 *
 * @author VKhlybov
 */
public class Animal {

    private String spicies;

    private boolean canHop;

    private boolean canSwim;

    public Animal(String spicies, boolean canHop, boolean canSwim) {
        this.spicies = spicies;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return spicies;
    }
}
