package productsalesreports;

public class Product implements IProducts {

    private String[] productNames;
    private int[][] productSales;

    // Constructor
    public Product(String[] productNames, int[][] productSales) {
        this.productNames = productNames;
        this.productSales = productSales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }

        return total;
    }

    // Calculate average sales
    @Override
    public double GetAverageProductsSold() {

        int total = GetTotalProductsSold();

        int numberOfSales = productSales.length
                * productSales[0].length;

        return (double) total / numberOfSales;
    }

    // Find the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int i = 0; i < productSales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < productSales[i].length; j++) {
                productTotal += productSales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = i;
            }
        }

        return productNames[popularIndex];
    }

    // Return total sales for a specific product
    public int GetProductTotal(int productIndex) {

        int total = 0;

        for (int j = 0; j < productSales[productIndex].length; j++) {
            total += productSales[productIndex][j];
        }

        return total;
    }

    // Return the sales of the most popular product
    public int GetMostPopularProductSales() {

        int highestSales = 0;

        for (int i = 0; i < productSales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < productSales[i].length; j++) {
                productTotal += productSales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
            }
        }

        return highestSales;
    }

}