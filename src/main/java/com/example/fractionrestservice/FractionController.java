package com.example.fractionrestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FractionController {
    @GetMapping("/checkFraction")
    public String checkFraction(@RequestParam String numerator, @RequestParam String denominator) {
        Double data = Double.parseDouble(numerator)/Double.parseDouble(denominator);
        if (data < 1 && data >0 ) {
            return "correct fraction";
        } else {
            return "wrong fraction";
        }
    }
}
