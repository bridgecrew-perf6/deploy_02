package it.triexercise.deploy_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public int getSum() {
        return 4 + 25;
    }
}
