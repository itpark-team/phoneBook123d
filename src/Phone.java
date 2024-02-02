public class Phone {
    private String model;
    private String color;
    private int price;
    private int balance;

    public Phone(String model, String color, int price, int balance) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.balance = balance;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", balance=" + balance +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) throws Exception {
        if (price <= 0 || price > 1000000) {
            throw new Exception("Ошибка установки цены. Цена должна быть от 1 до 1000000");
        }

        this.price = price;
    }

    public void setBalance(int balance) throws Exception {
        if (balance < 0 || balance > 100) {
            throw new Exception("Ошибка установки количества товара на складе. Количество должно быть от 1 до 100");
        }
        this.balance = balance;
    }
}
