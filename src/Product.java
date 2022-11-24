public class Product {

    public int productId;
    public String productName;
    public String productManufacturer; // ürün üreticisi
    public int productAmount; // ürün miktari
    public String productUnit; // ürün birimi
    public String productShelf;

    public Product(){

    }

    public Product(int productId, String productName,String productManufacturer, String productUnit){
        this.productId = productId;
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productUnit = productUnit;
    }

    public Product(int productId, String productName, String productManufacturer, int productAmount, String productUnit, String productShelf) {
        this.productId = productId;
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productAmount = productAmount;
        this.productUnit = productUnit;
        this.productShelf = productShelf;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productManufacturer='" + productManufacturer + '\'' +
                ", productAmount=" + productAmount +
                ", productUnit='" + productUnit + '\'' +
                ", productShelf='" + productShelf + '\'' +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductShelf() {
        return productShelf;
    }

    public void setProductShelf(String productShelf) {
        this.productShelf = productShelf;
    }
}
