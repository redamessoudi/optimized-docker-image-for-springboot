package com.redamessoudi.optimizedSBDimage.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reda Messoudi
 */
@RestController
public class HelloController {

  @GetMapping("/hello")
  ResponseEntity<String> sayHello() {
    return ResponseEntity.status(HttpStatus.OK).body("Hello world!");
  }
}
