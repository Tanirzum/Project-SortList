public class House implements Comparable<House> {
    private String nameHouse;
    private int idHouse;
    private double price;

    public House(String nameHouse, int idHouse, double price) {
        this.nameHouse = nameHouse;
        this.idHouse = idHouse;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameHouse='" + nameHouse + '\'' +
                ", idHouse=" + idHouse +
                ", price=" + price +
                '}';
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public int getIdHouse() {
        return idHouse;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(House o) {
        return this.getNameHouse().compareTo(o.getNameHouse());
    }
}
