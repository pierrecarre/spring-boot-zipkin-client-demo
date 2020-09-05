package io.github.pierrecarre.demo.zipkinclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GreetingService {

    public String greeting(String name) {
        log.info("Hello {}", name);
        return "Hello " + name;
    }
}
