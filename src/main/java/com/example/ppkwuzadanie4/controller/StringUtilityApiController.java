package com.example.ppkwuzadanie4.controller;

import com.example.ppkwuzadanie4.StringConverter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class StringUtilityApiController {

    @GetMapping(value = "/{from}/txt/{text}", produces = {MediaType.TEXT_PLAIN_VALUE})
    String getTxtString(@PathVariable String from, @PathVariable String text) {
        String result = new RestTemplate().getForObject("http://localhost:8081/api/" + from + "/" + text, String.class);
        return StringConverter.convert(from, "txt", result);
    }

    @GetMapping(value = "/{from}/json/{text}", produces = {MediaType.APPLICATION_JSON_VALUE})
    String getJsonString(@PathVariable String from, @PathVariable String text) {
        String result = new RestTemplate().getForObject("http://localhost:8081/api/" + from + "/" + text, String.class);
        return StringConverter.convert(from, "json", result);
    }

    @GetMapping(value = "/{from}/xml/{text}", produces = {MediaType.APPLICATION_XML_VALUE})
    String getXmlString(@PathVariable String from, @PathVariable String text) {
        String result = new RestTemplate().getForObject("http://localhost:8081/api/" + from + "/" + text, String.class);
        return StringConverter.convert(from, "xml", result);
    }

    @GetMapping(value = "/{from}/csv/{text}", produces = {MediaType.TEXT_PLAIN_VALUE})
    String getCsvString(@PathVariable String from, @PathVariable String text) {
        String result = new RestTemplate().getForObject("http://localhost:8081/api/" + from + "/" + text, String.class);
        return StringConverter.convert(from, "csv", result);
    }
}
