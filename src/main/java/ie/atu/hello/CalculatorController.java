package ie.atu.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    number total = new number();

    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation) {
        return "operation: " + "\tdivision" + "\ttotal:" + total.getDivision();
    }
}
