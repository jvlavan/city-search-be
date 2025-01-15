package dev.lavan.world.search.Service;

import dev.lavan.world.search.model.States;
import dev.lavan.world.search.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository StateRepo;


    public Page<States> findByNameAndCountryCode(String name, String CountryCode, Pageable pageable){
        System.out.printf("Fetching State with name: %s", name);
        return StateRepo.findByNameContainingIgnoreCaseAndCountryCodeIgnoreCase(name,CountryCode,pageable);
    }

}
