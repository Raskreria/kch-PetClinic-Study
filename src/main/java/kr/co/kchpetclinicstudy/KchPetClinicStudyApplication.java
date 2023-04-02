package kr.co.kchpetclinicstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KchPetClinicStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(KchPetClinicStudyApplication.class, args);
//임시 처
    }

}


