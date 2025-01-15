package dev.lavan.world.search.Controller;

import dev.lavan.world.search.Service.StateService;
import dev.lavan.world.search.model.Cities;
import dev.lavan.world.search.model.States;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/state")
public class StateController {
    private static final Logger logger = LoggerFactory.getLogger(StateController.class);

    @Autowired
    StateService StateServiceObject;
    @GetMapping("/country/{country_id}/{name}")
    public ResponseEntity<List<States>> getStateByName(@PathVariable String country_id,@PathVariable String name, Pageable pageable) {
        Page<States> page = StateServiceObject.findByNameAndCountryCode(name,country_id, pageable);
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Total-Size", String.valueOf(page.getTotalElements()));
        headers.add("X-Total-Pages", String.valueOf(page.getTotalPages()));
        headers.add("X-Current-Page", String.valueOf(page.getNumber()));
        headers.add("Access-Control-Expose-Headers", "X-Total-Size, X-Total-Pages, X-Current-Page");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }


}