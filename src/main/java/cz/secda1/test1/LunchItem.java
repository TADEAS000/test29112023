package cz.secda1.test1;

import java.util.List;

public class LunchItem {
    private String date;
    private LunchItemKind kind;
    private String menuOption;
    private String name;
    private double price;
    private List<Allergen> allergens;
    private String timeToCancel;
    private boolean ordered;

    public LunchItem(String date, LunchItemKind kind, String menuOption,  String name, double price, List<Allergen> allergens, String timeToCancel, boolean ordered) {
        this.date = date;
        this.kind = kind;
        this.menuOption = menuOption;
        this.name = name;
        this.price = price;
        this.allergens = allergens;
        this.timeToCancel = timeToCancel;
        this.ordered = ordered;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LunchItemKind getKind() {
        return kind;
    }

    public void setKind(LunchItemKind kind) {
        this.kind = kind;
    }

    public String getMenuOption() {
        return menuOption;
    }

    public void setMenuOption(String menuOption) {
        this.menuOption = menuOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    public String getTimeToCancel() {
        return timeToCancel;
    }

    public void setTimeToCancel(String timeToCancel) {
        this.timeToCancel = timeToCancel;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    @Override
    public String toString() {
        return "LunchItem{" +
                "date='" + date + '\'' +
                ", kind=" + kind +
                ", menuOption='" + menuOption + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", allergens=" + allergens +
                ", timeToCancel='" + timeToCancel + '\'' +
                ", ordered=" + ordered +
                '}';
    }
}
