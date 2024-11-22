package com.example;

import io.micronaut.data.model.Pageable;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class QueryTest {

    @Inject
    EnterpriseGroupRepository enterpriseGroupRepository;

    @Test
    void hqlCountWithNativeQuery() {
        enterpriseGroupRepository.findAllWorks(Pageable.UNPAGED);
    }

    @Test
    void countWithNativeQuery() {
        enterpriseGroupRepository.findAllDoesntWork(Pageable.UNPAGED);
    }
}
