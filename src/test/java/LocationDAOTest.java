import forecast.DBConnection;
import forecast.LocationDAO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class LocationDAOTest {

    @Test
    public void SearchCity_test(){
        // given

        // when
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());
        List<String> cities = dao.SearchCity();

        cities.forEach(System.out::println);
    }

    @Test
    public void SearchLevelTwo_test(){
        // given


        // when
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());
        List<String> dongs = dao.SearchLevelTwo();

        dongs.forEach(System.out::println);
    }
}
