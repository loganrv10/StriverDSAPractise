public enum Laptop {
    Macbook(2200), Lenovo(1400), Samsung(1700), Acer(1500), Asus(1550);

    private int price;

    Laptop(int price) {
        this.price = price;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
