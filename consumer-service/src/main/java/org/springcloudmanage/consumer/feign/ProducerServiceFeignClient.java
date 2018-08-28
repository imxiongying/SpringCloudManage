package org.springcloudmanage.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "producer-service", fallback = ProducerServiceFeignClientHystrix.class)
public interface ProducerServiceFeignClient {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test(@RequestParam("param") String param);

}
