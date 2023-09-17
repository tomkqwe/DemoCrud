package ru.lebedev.DemoCrud.repository;

import org.springframework.data.repository.CrudRepository;
import ru.lebedev.DemoCrud.entity.PsyUserEntity;

public interface PsyUserEntityRepository extends CrudRepository<PsyUserEntity,Long> {
}
