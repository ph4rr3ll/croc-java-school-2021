package ru.croc.javaschool.lesson3.model;

public class PhysicalClient extends Client {

    private String firstName;

    private String lastName;

    private String middleName;

    private Gender gender;

    public PhysicalClient(Integer id, String email, String phone,
                          String firstName, String lastName, String middleName, Gender gender) {
        super(id, email, phone);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }

    @Override
    public String getFullName() {
        return String.format("%s %s %s", lastName, firstName, middleName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
