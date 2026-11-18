package productsalesreports;

import java.util.Scanner;

public class ProductSalesReports {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // One-dimensional array containing product names
        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phukett"
        };

        // Two-dimensional array containing sales
        int[][] productSales = new int[3][3];

        // Input sales for each product over three months
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for "
                        + productNames[i] + " mattress: ");

                productSales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(productNames, productSales);

        // Create PrintProduct object
        PrintProduct printer = new PrintProduct();

        // Print the report
        printer.PrintSalesReport (product);

        input.close();
    }
}