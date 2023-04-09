package kr.co.kchpetclinicstudy.persistence.entity;
//주인 클래스
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kr.co.kchpetclinicstudy.persistence.BaseEntity;
import kr.co.kchpetclinicstudy.service.model.dtos.request.OwnerReqDTO;
import kr.co.kchpetclinicstudy.service.model.dtos.response.OwnerResDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity  //해당 클래스가 엔티티를 워한 클래스이며 해당 클래스의 인스턴스가 JPA로 관리되는 엔티티임을 명시
@Table(name = "TBL_OWNERS")
@ToString //객체이름을 통해 정보를 출력하도록 ToString 오버라이딩 어노테이션
@Getter // Lombok의 getter 자동 생성 어노테이션
@Builder
//@AllArgsConstructor // Builder를 사용하기 위해서 필요함
@NoArgsConstructor // Builder를 사용하기 위해서 필요함 //기본생성자
@AttributeOverride(
        name = "id",
        column = @Column(name = "owner_id", length = 4)
)
public class Owner extends BaseEntity {


    @Column(name = "first_name",length = 30) // 성
    private String firstName;
    @Column(name = "last_name",length = 30, nullable = false)
    private String lastName; // 이름
    @Column(name = "address", nullable = false)
    private String address; // 주소
    @Column(name = "city",length = 40, nullable = false)
    private String city; // 시
    @Column(name = "telephone",length = 40,  unique = true, nullable = false)
    private String telephone; // 전화번호

    @Builder // 빌더패턴으로 편하게 생성자 호출
    public Owner(String firstName,
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
    public static OwnerResDTO.Read entityToDto(Owner owner) {
        return OwnerResDTO.Read.builder()
                .firstName(owner.getFirstName())
                .lastName(owner.getLastName())
                .address(owner.address)
                .city(owner.city)
                .telephone(owner.telephone)
                .build();
    }
    public static Owner dtoToEntity(OwnerReqDTO.Create create) {
        return Owner.builder()
                .firstName(create.getFirstName())
                .lastName(create.getLastName())
                .address(create.getAddress())
                .city(create.getCity())
                .telephone(create.getTelephone())
                .build();
    }
    public void updateOwner(OwnerReqDTO.Update update) {
        firstName = update.getFirstName();
        this.lastName = update.getLastName();
        this.address = update.getAddress();
        this.city = update.getCity();
        this.telephone = update.getTelephone();
    }

}
