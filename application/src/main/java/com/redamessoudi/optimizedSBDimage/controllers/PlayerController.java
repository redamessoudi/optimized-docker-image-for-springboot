package com.redamessoudi.optimizedSBDimage.controllers;

import com.redamessoudi.optimizedSBDimage.models.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Reda Messoudi
 */
@RestController
public class PlayerController {

  @PostMapping("/player")
  ResponseEntity<?> createPlayer(@RequestBody Player player) {
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(player);
  }

}
