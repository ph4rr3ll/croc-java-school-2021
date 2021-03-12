package ru.croc.javaschool.lesson3.model;

public class JuridicalClient extends Client implements HasTradePlatformAccess {

    private String name;

    private String managerName;

    public JuridicalClient(Integer id, String email, String phone, String name, String managerName) {
        super(id, email, phone);
        this.name = name;
        this.managerName = managerName;
    }

    @Override
    public String getFullName() {
        return getName();
    }

    @Override
    public void access() {
        System.out.println("Special juridical access");
        System.out.println("Access to trade platform from " + getFullName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
