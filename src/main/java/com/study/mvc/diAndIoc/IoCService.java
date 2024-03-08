package com.study.mvc.diAndIoc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
//@RequiredArgsConstructor
public class IoCService {

    @Autowired
    private IoCRepository ioCRepository;

    public String getJson() throws JsonProcessingException {

        Map<String, String> nameMap = ioCRepository.convertNameMap();
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(nameMap); // map -> Json

    }
}
