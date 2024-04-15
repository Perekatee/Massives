import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void allSalesSum() {

        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedsum = 180;
        long actualsum = service.allSalesSum(months);

        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test

    public void averageSum() {

        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAvSum = 15;
        long actualAvSum = service.averageSum(months);

        Assertions.assertEquals(expectedAvSum, actualAvSum);
    }

    @Test

    public void minSales() {

        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 9;

        long actualMin = service.minSales(months);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test

    public void maxSales() {

        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 8;

        long actualMin = service.maxSales(months);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void maxSalesMonths() {

        StatsService service = new StatsService();
        long[] Months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonths = 5;

        long actualMin = service.maxSalesMonths(Months);

        Assertions.assertEquals(expectedMaxMonths, actualMin);
    }

    @Test
    public void minSalesMonths() {

        StatsService service = new StatsService();
        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonths = 5;

        long actualMin = service.minSalesMonths(months);

        Assertions.assertEquals(expectedMaxMonths, actualMin);
    }
}
