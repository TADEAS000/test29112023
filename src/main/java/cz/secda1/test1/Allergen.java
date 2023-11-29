package cz.secda1.test1;

public class Allergen {
    private String code;
    private String name;

    public Allergen(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Allergen{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
