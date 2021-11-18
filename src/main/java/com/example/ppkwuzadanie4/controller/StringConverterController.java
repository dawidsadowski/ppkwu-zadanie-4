package com.example.ppkwuzadanie4.controller;

import com.example.ppkwuzadanie4.StringConverter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convertapi")
public class StringConverterController {

    @GetMapping(value = "/{from}/txt/{text}", produces = {MediaType.TEXT_PLAIN_VALUE})
    String getTxtString(@PathVariable String from, @PathVariable String text) {
        return StringConverter.convert(from, "txt", text);
    }

    @GetMapping(value = "/{from}/json/{text}", produces = {MediaType.APPLICATION_JSON_VALUE})
    String getJsonString(@PathVariable String from, @PathVariable String text) {
        return StringConverter.convert(from, "json", text);
    }

    @GetMapping(value = "/{from}/xml/{text}", produces = {MediaType.APPLICATION_XML_VALUE})
    String getXmlString(@PathVariable String from, @PathVariable String text) {
        return StringConverter.convert(from, "xml", text);
    }

    @GetMapping(value = "/{from}/csv/{text}", produces = {MediaType.TEXT_PLAIN_VALUE})
    String getCsvString(@PathVariable String from, @PathVariable String text) {
        return StringConverter.convert(from, "csv", text);
    }
}
