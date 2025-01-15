package dev.lavan.world.search.repository;


import dev.lavan.world.search.model.Cities;
import dev.lavan.world.search.model.States;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<States, Integer> {
    Page<States> findByNameContainingIgnoreCaseAndCountryCodeIgnoreCase(String name, String countryCode, Pageable pageable);


}
