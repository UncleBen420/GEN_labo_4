package ch.heigvd.gen2019;

public class Product {
    public static final Size SIZE_NOT_APPLICABLE = null;
    private String code;

    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {

        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public String getColor() {
        return color.toString();
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

	public String getSizeFor() {
		
	    return size.toString();
	}
}