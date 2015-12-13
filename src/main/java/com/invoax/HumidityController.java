package com.invoax;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.invoax.model.Humidity;
import com.invoax.repository.HumidityRepository;



@RestController
public class HumidityController {

    @Autowired
    private HumidityRepository repository;

    public HumidityController() {
    }

    @RequestMapping("/humidities")
    public List<Humidity> getHumidity () {
        return repository.findAll();

    }

    @RequestMapping(value = "/humidities", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Humidity saveHumidity(@RequestBody Humidity sample) {
        sample.setTimestamp(new Date());
        return repository.save(sample);
    }


}