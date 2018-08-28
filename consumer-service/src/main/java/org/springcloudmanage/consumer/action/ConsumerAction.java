package org.springcloudmanage.consumer.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/ribbon/test")
public class ConsumerAction {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test(String param) {
        String url = "http://producer-service/test/?param=" + param;
        return restTemplate.getForObject(url, String.class);
    }

}
