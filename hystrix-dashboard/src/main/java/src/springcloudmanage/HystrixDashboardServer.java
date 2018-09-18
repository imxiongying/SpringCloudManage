package src.springcloudmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboardServer {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardServer.class, args);
    }
}
