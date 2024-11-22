package com.example;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.repository.PageableRepository;

@Repository
public interface EnterpriseGroupRepository extends PageableRepository<EnterpriseGroup, Long> {

    @Query(value = "SELECT * FROM ENTERPRISE_GROUP",
            countQuery = "SELECT COUNT(*) FROM EnterpriseGroup",
            nativeQuery = true)
    Page<EnterpriseGroup> findAllWorks(Pageable pageable);

    @Query(value = "SELECT * FROM ENTERPRISE_GROUP",
            countQuery = "SELECT COUNT(*) FROM ENTERPRISE_GROUP",
            nativeQuery = true)
    Page<EnterpriseGroup> findAllDoesntWork(Pageable pageable);
}
