package productsalesreports;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    // Unit Test 1
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phukett"
        };

        int[][] productSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(productNames, productSales);

        int expected = 153;
        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    // Unit Test 2
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phukett"
        };

        int[][] productSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(productNames, productSales);

        double expected = 17.0;
        double actual = product.GetAverageProductsSold();

        assertEquals(expected, actual, 0.001);
    }

}