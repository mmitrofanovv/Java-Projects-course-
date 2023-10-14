package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;

public class Serialization {
    private ObjectMapper objectMapper = new ObjectMapper();

    public String serialize(List<newGenerator> newGenerator) throws IOException {
        return objectMapper.writeValueAsString(newGenerator);
    }
}



