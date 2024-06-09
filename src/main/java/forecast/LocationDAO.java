package forecast;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationDAO {

    DBConnection dbConnection = new DBConnection();

    // DB연결을 유지하고, 작업하기 위해 Connection 객체 저장할 변수
    private final Connection connection;

    // 생성자 생성
public LocationDAO(Connection connection) {
    this.connection = connection;
}


    // 시 찾기
    public List<String> SearchLevelOne (){
        List<String> cities = new ArrayList<>();

        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT DISTINCT 1단계 FROM location_data_tb");

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                cities.add(resultSet.getString("1단계"));
            }
            return cities;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    // 시 검색 -> 구 찾기
    public List<String> SearchLevelTwo (String levelOne){
        List<String> levelTwoList = new ArrayList<>();

        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT DISTINCT 2단계 FROM location_data_tb WHERE 1단계 = ?");
            pstmt.setString(1, levelOne);

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                levelTwoList.add(resultSet.getString("2단계"));
            }
            return levelTwoList;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    // 구 검색 -> 동 찾기 *구 이름이 동일할 수 있으니, 시 도 검색
    public List<String> SearchLevelThree (String levelOne, String levelTwo){
        List<String> dongs = new ArrayList<>();

        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT 3단계 FROM location_data_tb WHERE 1단계 = ? and 2단계=?");
            pstmt.setString(1, levelOne);
            pstmt.setString(2, levelTwo);

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                dongs.add(resultSet.getString("3단계"));
            }
            return dongs;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }


}
