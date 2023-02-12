package com.example.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/req/webhook")
    public ResponseEntity<String> printHandler (@RequestBody String requestBody){

        System.out.println("##webhook => " + requestBody);
        return new ResponseEntity<String>(requestBody , HttpStatus.OK);

    }
}
