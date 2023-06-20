package fr.minibuz.demo.controller;

import fr.minibuz.demo.dvo.DataDvo;
import fr.minibuz.demo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

    @Value("${key}")
    private String key;

    private final IService service;

    @Autowired
    public Controller(
            IService iService
    ) {
        this.service = iService;
    }

    @GetMapping("home")
    public ResponseEntity<DataDvo> home() {

        DataDvo dvo = this.service.getData(key);
        return ResponseEntity.ok(dvo);
    }

    @ResponseStatus(value= HttpStatus.FORBIDDEN,
            reason="Data integrity violation")
    @ExceptionHandler(Exception.class)
    public void conflict() {
        // Nothing to do
    }
}
