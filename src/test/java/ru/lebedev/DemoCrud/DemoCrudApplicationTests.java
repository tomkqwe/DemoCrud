package ru.lebedev.DemoCrud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.lebedev.DemoCrud.entity.PsyUserEntity;

@SpringBootTest
class DemoCrudApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void checkLombokAnnotation() {
        PsyUserEntity psyUserEntity = new PsyUserEntity();


    }

}
