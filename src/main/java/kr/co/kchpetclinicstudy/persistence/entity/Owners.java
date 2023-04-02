package kr.co.kchpetclinicstudy.persistence.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity  //해당 클래스가 엔티티를 워한 클래스이며 해당 클래스의 인스턴스가 JPA로 관리되는 엔티티임을 명시
@Table(name = "TBL_OWNERS")
@ToString //객체이름을 통해 정보를 출력하도록 ToString 오버라이딩 어노테이션
@Getter // Lombok의 getter 자동 생성 어노테이션
@Builder // 객체를 생성할 수 있음
//@AllArgsConstructor // Builder를 사용하기 위해서 필요함
@NoArgsConstructor // Builder를 사용하기 위해서 필요함
@AttributeOverride(
        name = "id",
        column = @Column(name = "owner_id", length = 4)
)
public class Owners extends BaseEntity {


    @Column(name = "first_name",length = 40, nullable = false)
    private String firstName;
    @Column(name = "last_name",length = 40, nullable = false)
    private String lastName;
    @Column(name = "address",length = 40, nullable = false)
    private String address;
    @Column(name = "city",length = 40, nullable = false)
    private String city;
    @Column(name = "telephone",length = 40,  unique = true, nullable = false)
    private String telephone;

    @Builder
    public Owners(String firstName,
                  String lastName,
                  String address,
                  String city,
                  String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }



}
