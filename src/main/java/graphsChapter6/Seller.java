package graphsChapter6;

public class Seller {
    private String name;
    private boolean mangoSeller;

    public Seller(String name, boolean mangoSeller) {
        this.name = name;
        this.mangoSeller = mangoSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMangoSeller() {
        return mangoSeller;
    }

    public void setMangoSeller(boolean mangoSeller) {
        this.mangoSeller = mangoSeller;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        if (mangoSeller != seller.mangoSeller) return false;
        return name.equals(seller.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (mangoSeller ? 1 : 0);
        return result;
    }
}
