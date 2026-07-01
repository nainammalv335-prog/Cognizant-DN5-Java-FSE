class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, String target) {

        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        String searchItem = "Mobile";

        Product result = linearSearch(products, searchItem);

        if (result != null) {
            System.out.println("Product Found:");
            System.out.println("ID: " + result.productId);
            System.out.println("Name: " + result.productName);
            System.out.println("Category: " + result.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}
