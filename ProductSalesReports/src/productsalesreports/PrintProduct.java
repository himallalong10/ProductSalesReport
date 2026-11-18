package productsalesreports;

public class PrintProduct {

    public void PrintSalesReport(Product product) {

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("======================================");

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());

        System.out.println("AVERAGE PRODUCT SALES: "
                + Math.round(product.GetAverageProductsSold()));

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct()
                + " ("
                + product.GetMostPopularProductSales()
                + ")");

        System.out.println("======================================");
    }

}