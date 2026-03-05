package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SquareService {

    public boolean isSecondSquareOfFirst(int first, int second) {
        return second == first * first;
    }
}
