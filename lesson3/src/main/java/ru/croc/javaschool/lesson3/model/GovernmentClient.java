package ru.croc.javaschool.lesson3.model;

public class GovernmentClient extends Client implements HasTradePlatformAccess {

    private String name;

    private String department;

    public GovernmentClient(Integer id, String email, String phone, String name, String department) {
        super(id, email, phone);
        this.name = name;
        this.department = department;
    }

    @Override
    public String getFullName() {
        return String.format("%s, %s", name, department);
    }

    @Override
    public void access() {
        System.out.println("Special governmental access");
        System.out.println("Access to trade platform from " + getFullName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
