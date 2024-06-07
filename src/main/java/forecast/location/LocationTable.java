package forecast.location;

import javax.persistence.*;

@Entity
@Table(name = "location_data_tb")
public class LocationTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "구분")
    private String division;

    @Column(name = "행정구역코드")
    private String administrativeCode;

    @Column(name = "단계1")
    private String level1;

    @Column(name = "단계2")
    private String level2;

    @Column(name = "단계3")
    private String level3;

    @Column(name = "격자_X")
    private Integer gridX;

    @Column(name = "격자_Y")
    private Integer gridY;

    @Column(name = "경도_시")
    private Integer longitudeHour;

    @Column(name = "경도_분")
    private Integer longitudeMinute;

    @Column(name = "경도_초")
    private Float longitudeSecond;

    @Column(name = "위도_시")
    private Integer latitudeHour;

    @Column(name = "위도_분")
    private Integer latitudeMinute;

    @Column(name = "위도_초")
    private Float latitudeSecond;

    @Column(name = "경도_초_100")
    private Float longitudeSecondDecimal;

    @Column(name = "위도_초_100")
    private Float latitudeSecondDecimal;

    @Column(name = "위치업데이트")
    private String locationUpdate;

    // 기본 생성자
    public LocationTable() {}

    // 필드 초기화 생성자
    public LocationTable(Long id, String division, String administrativeCode, String level1, String level2, String level3, Integer gridX, Integer gridY, Integer longitudeHour, Integer longitudeMinute, Float longitudeSecond, Integer latitudeHour, Integer latitudeMinute, Float latitudeSecond, Float longitudeSecondDecimal, Float latitudeSecondDecimal) {
        this.id = id;
        this.division = division;
        this.administrativeCode = administrativeCode;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.gridX = gridX;
        this.gridY = gridY;
        this.longitudeHour = longitudeHour;
        this.longitudeMinute = longitudeMinute;
        this.longitudeSecond = longitudeSecond;
        this.latitudeHour = latitudeHour;
        this.latitudeMinute = latitudeMinute;
        this.latitudeSecond = latitudeSecond;
        this.longitudeSecondDecimal = longitudeSecondDecimal;
        this.latitudeSecondDecimal = latitudeSecondDecimal;
    }

}
