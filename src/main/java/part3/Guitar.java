package part3;

public class Guitar {
    private final String serialNumber;
    private double price;
    private final String  builder;
    private final String model;
    private final String  type;
    private final String backWood;
    private final String topWood;


    Guitar(String serialNumber, double price,
           String builder, String model, String type,
           String backWood, String topWood) {


        // Commas not valid, remove them.
        serialNumber = serialNumber.replace(",", "");
        builder = builder.replace(",", "");
        backWood = backWood.replace(",", "");
        model = model.replace(",", "");
        type = type.replace(",", "");
        topWood = topWood.replace(",", "");

        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;

    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double n) {
        this.price = n;
    }
    public String getBuilder() {
        return this.builder;
    }
    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public String getBackWood() {
        return this.backWood;
    }

    public String getTopWood() {
        return this.topWood;
    }

    public String toString() {
        return this.getSerialNumber()+','+ this.getPrice()+','+ this.getBuilder()+','+
                this.getModel()+','+ this.getType()+','+ this.getBackWood()+','+ this.getTopWood();
    }

}
