package org.springcloudmanage.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class ProducerServiceFeignClientHystrix implements ProducerServiceFeignClient {
    @Override
    public String test(String param) {
        return "服务[producer-service]无法访问";
    }
}
