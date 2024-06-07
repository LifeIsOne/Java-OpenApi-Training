package forecast;

import java.sql.Connection;
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
        List<String> cities = new ArrayList<String>();



        return null;
    }

    // 구 찾기


    // 동 찾기


}
