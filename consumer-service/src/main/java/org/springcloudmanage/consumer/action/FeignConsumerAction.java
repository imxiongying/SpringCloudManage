package org.springcloudmanage.consumer.action;

import org.springcloudmanage.consumer.feign.ProducerServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/feign/test")
public class FeignConsumerAction {

    @Autowired
    private ProducerServiceFeignClient producerServiceFeignClient;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test(String param) {
        return producerServiceFeignClient.test(param);
    }

}
