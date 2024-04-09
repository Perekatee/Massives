import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.MonthsService;

public class MonthsServiceTest {

    @Test

    public void AllSalesSum() {

        MonthsService service = new MonthsService();
        int[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedsum = 180;
        int actualsum = service.AllSalesSum(Months);

        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test

    public void averageSum() {

        MonthsService service = new MonthsService();
        int[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvSum = 15;
        int actualAvSum = service.averageSum(Months);

        Assertions.assertEquals(expectedAvSum, actualAvSum);
    }

    @Test

    public void minSales() {

        MonthsService service = new MonthsService();
        int[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;

        int actualMin = service.minSales(Months);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test

    public void maxSales() {

        MonthsService service = new MonthsService();
        int[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 8;

        int actualMin = service.maxSales(Months);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void maxSalesMonths() {

        MonthsService service = new MonthsService();
        int[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 5;

        int actualMin = service.maxSalesMonths(Months);

        Assertions.assertEquals(expectedMaxMonths, actualMin);
    }

    @Test
    public void MinSalesMonths() {

        MonthsService service = new MonthsService();
        int[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 5;

        int actualMin = service.MinSalesMonths(Months);

        Assertions.assertEquals(expectedMaxMonths, actualMin);
    }
}
