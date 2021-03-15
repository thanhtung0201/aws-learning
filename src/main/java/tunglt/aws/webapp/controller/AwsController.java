package tunglt.aws.webapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class AwsController {

    @GetMapping("web-app/aws-index")
    public String wellComeAws(HttpServletRequest req) {
        log.info("[Web app]Request get from IP : {} , method {} : ", req.getRemoteAddr(), req.getMethod());
        return "Welcome aws web page of web app";
    }

}
