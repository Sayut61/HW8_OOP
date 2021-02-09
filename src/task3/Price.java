package task3;

public class Price {
    private String name;
    private String nameMag;
    private int price;

    public Price(String name, String nameMag, int price) {
        this.name = name;
        this.nameMag = nameMag;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameMag() {
        return nameMag;
    }

    public void setNameMag(String nameMag) {
        this.nameMag = nameMag;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", nameMag='" + nameMag + '\'' +
                ", price=" + price +
                '}' + "\n";
    }
}
