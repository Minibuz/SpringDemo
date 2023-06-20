package fr.minibuz.demo.service;

import fr.minibuz.demo.dvo.DataDvo;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Service implements IService {

    @Override
    public DataDvo getData(String key) {

        Objects.requireNonNull(key);

        if (!"value".equals(key)) {
            throw new IllegalArgumentException();
        }
        return new DataDvo(key, "It works");
    }
}
