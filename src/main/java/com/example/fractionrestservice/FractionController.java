package com.example.fractionrestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

                                        // task1 проверка дроби
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

                                        //task2 сокращение дробей
    @GetMapping("/fractionReduction")
    public String fractionReduction(@RequestParam String numerator, @RequestParam String denominator) {
        int a = Integer.parseInt(numerator);
        int b = Integer.parseInt(denominator);
        int gcd = gcd(a, b);
        return (a / gcd) + "/" + (b/gcd);
    }
    private int gcd(int a, int b) {
        return b == 0? a : gcd(b, a % b);
    }

                                        //task3 сложение дробей

    @GetMapping("/getSumFractions")
    public String getSumFractions(@RequestParam String numerator1, @RequestParam String denominator1,
                                  @RequestParam String numerator2, @RequestParam String denominator2) {
        int sumNum = (Integer.parseInt(numerator1) * Integer.parseInt(denominator2)) + (Integer.parseInt(numerator2) * Integer.parseInt(denominator1));
        int sumDen = Integer.parseInt(denominator1) * Integer.parseInt(denominator2);
        return sumNum + "/" + sumDen;
    }

                                        //task4 вычитание дробей
    @GetMapping("/getSubFractions")
    public String getSubFractions(@RequestParam String numerator1, @RequestParam String denominator1,
                                  @RequestParam String numerator2, @RequestParam String denominator2) {
        int sumNum = (Integer.parseInt(numerator1) * Integer.parseInt(denominator2)) - (Integer.parseInt(numerator2) * Integer.parseInt(denominator1));
        int sumDen = Integer.parseInt(denominator1) * Integer.parseInt(denominator2);
        return sumNum + "/" + sumDen;
    }

                                            //task5 умножение
    @GetMapping("/getMultFraction")
    public String getMultFraction(@RequestParam String numerator1, @RequestParam String denominator1,
                                  @RequestParam String numerator2, @RequestParam String denominator2) {
        int multNum = Integer.parseInt(numerator1) * (Integer.parseInt(numerator2));
        int multDen = Integer.parseInt(denominator1) * Integer.parseInt(denominator2);
        return multNum + "/" + multDen;
    }
                                            //task6 деление

    @GetMapping("/getDiv")
    public String getDiv(@RequestParam String numerator1, @RequestParam String denominator1,
                         @RequestParam String numerator2, @RequestParam String denominator2) {
        int divNum = Integer.parseInt(numerator1) * Integer.parseInt(denominator2);
        int divDen = Integer.parseInt(denominator1) * (Integer.parseInt(numerator2));
        return divNum + "/" + divDen;
    }
}
