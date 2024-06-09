package forecast;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationDAO {

    DBConnection dbConnection = new DBConnection();
    // DB연결을 유지하고, 작업하기 위해 Connection 객체 저장할 변수
    private final Connection connection;

    // 생성자 생성
    public LocationDAO(Connection connection) {
        this.connection = connection;
    }


    // 시 찾기
    public List<String> SearchCity (){
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

    // 구 찾기
    public List<String> SearchLevelTwo (String g){
        List<String> dongs = new ArrayList<>();

        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT DISTINCT 2단계 FROM location_data_tb WHERER 1단계 = ?");
            pstmt.setString(1, gu);

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                dongs.add(resultSet.getString("2단계"));
            }
            return dongs;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    // 동 찾기
    public List<String> SearchDong (String gu){
        List<String> dongs = new ArrayList<>();

        try {
            PreparedStatement pstmt = connection.prepareStatement("SELECT 2단계 FROM location_data_tb WHERER 1단계 = ?");
            pstmt.setString(1, gu);

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                dongs.add(resultSet.getString("2단계"));
            }
            return dongs;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
