package Week5;

public class MobilePhone extends Products {
    int camera;
    int battery;
    String color;

    public MobilePhone(int ID, String brandName, int price, String getBrandName, int storage, int screenSize, int RAM, int camera, int battery, String color, int sale, int stock) {
        super(ID, brandName, price, getBrandName, storage, screenSize, RAM, sale, stock);
    }
}
