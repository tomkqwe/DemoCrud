package ru.lebedev.DemoCrud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.lebedev.DemoCrud.entity.PsyUserEntity;
import ru.lebedev.DemoCrud.enums.Gender;

@SpringBootTest
class DemoCrudApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void checkLombokAnnotation() {
        PsyUserEntity psyUserEntity = new PsyUserEntity();

        PsyUserEntity build = psyUserEntity.builder()
                .name("Tom")
                .surname("Tommev")
                .email("sdjfhkdjfh@mail.com")
                .gender(Gender.MALE)
                .build();
        System.out.println(build);

    }

}
