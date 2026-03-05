package demoapp.controller;

import demoapp.service.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SquareController {

    @Autowired
    private SquareService squareService;

    @GetMapping("/square/{first}/{second}")
    public boolean isSquare(@PathVariable int first, @PathVariable int second) {
        return squareService.isSecondSquareOfFirst(first, second);
    }
}
