package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class Desirialization {
    private ObjectMapper objectMapper = new ObjectMapper();

    public List<newGenerator> deserialize(String json) throws IOException {
        return objectMapper.readValue(json, new TypeReference<List<newGenerator>>() {
        });
    }


}
