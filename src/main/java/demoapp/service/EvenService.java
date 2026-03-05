package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class EvenService {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

