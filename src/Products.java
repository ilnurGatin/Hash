import java.util.Objects;

public class Products {
    private String title;
    private double price;
    private double weight;

    private boolean boughtStatus;



    public Products(String title, double price, double weight) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.title = title;
        }
        if (price == 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.price = price;
        }
        if (weight == 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
                this.weight = weight;
            }
        this.boughtStatus = false;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setBoughtStatus(boolean boughtStatus) {
        this.boughtStatus = boughtStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(title, products.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
