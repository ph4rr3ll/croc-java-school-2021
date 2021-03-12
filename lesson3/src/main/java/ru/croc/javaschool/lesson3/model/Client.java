package ru.croc.javaschool.lesson3.model;

/**
 * Клиент.
 */
public abstract class Client {

    /**
     * Идентификатор.
     */
    private Integer id;

    /**
     * Email.
     */
    private String email;

    /**
     * Контактный телефон.
     */
    private String phone;

    public Client(Integer id, String phone) {
        this.id = id;
        this.phone = phone;
    }

    public Client(Integer id, String email, String phone) {
        this(id, phone);
        this.email = email;
    }

    public abstract String getFullName();

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
