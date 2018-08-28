package org.springcloudmanage.producer.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class ProducerAction {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test(String param) {
        return "param is " + param;
    }


}
