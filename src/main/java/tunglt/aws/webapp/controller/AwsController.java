package tunglt.aws.webapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class AwsController {

    @GetMapping("/aws-index")
    public String wellComeAws(HttpServletRequest req) {
        log.info("Request get from IP : {} , method {} : ", req.getRemoteAddr(), req.getMethod());
        return "Welcome aws web page";
    }

}
