package ie.atu.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorController {


    number total = new number();
    int num1 = 6, num2 = 2;
    int sum;  //= getTotal();
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam int add) {
        //int total = num1 + num2;
        return "operation: " + "\tadd" + "\ttotal:" + total.getTotal();
    }

}
