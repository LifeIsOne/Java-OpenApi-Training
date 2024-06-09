import forecast.DBConnection;
import forecast.LocationDAO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LocationDAOTest {

    @Test
    public void SearchLevelOne_test(){
        // given

        // when
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());
        List<String> cities = dao.SearchLevelOne();

        cities.forEach(System.out::println);
    }

    @Test
    public void SearchLevelTwo_test(){
        // given
        String levelOne = "부산광역시";

        // when
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());
        List<String> levelTwo = dao.SearchLevelTwo(levelOne);

        levelTwo.forEach(System.out::println);
    }

    @Test
    public void SearchLevelThree_test(){
        // given
        String levelOne = "부산광역시";
        String levelTwo = "부산진구";

        // when
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());
        List<String> levelThree = dao.SearchLevelThree(levelOne, levelTwo);

        levelThree.forEach(System.out::println);
    }

    @Test
    public void FindingXY_test(){
        // given
        String levelTwo = "부산진구";
        String levelThree = "부전제1동";

        // when
        LocationDAO dao = new LocationDAO(DBConnection.getConnection());
        Map<String, String> coordinates  = dao.FindingXY(levelTwo, levelThree);


        System.out.println("격자X : " + coordinates.get("격자X"));
        System.out.println("격자Y : " + coordinates.get("격자Y"));
    }
}
