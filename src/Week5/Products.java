package Week5;

public abstract class Products {
    int ID;
    String brandName;
    int price;
    String getBrandName;
    int storage;
    int screenSize;
    int RAM;
    int sale;
    int stock;

    public Products(int ID, String brandName, int price, String getBrandName, int storage, int screenSize, int RAM, int sale, int stock) {
        this.ID = ID;
        this.brandName = brandName;
        this.price = price;
        this.getBrandName = getBrandName;
        this.storage = storage;
        this.screenSize = screenSize;
        this.RAM = RAM;
        this.sale = sale;
        this.stock = stock;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGetBrandName() {
        return getBrandName;
    }

    public void setGetBrandName(String getBrandName) {
        this.getBrandName = getBrandName;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
