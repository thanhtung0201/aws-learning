package tunglt.aws.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping("/aws-index")
    public String wellComeAws() {
        return "Welcome aws web page";
    }

}
