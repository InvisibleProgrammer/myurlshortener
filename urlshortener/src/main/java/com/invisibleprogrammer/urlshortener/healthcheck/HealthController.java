package com.invisibleprogrammer.urlshortener.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/")
    public String index(){
        return "Hello";
    }


    @GetMapping("/health")
    public HealthCheckResult health(){
        HealthCheckResult result = new HealthCheckResult();
        result.setStatus("Ok");

        return result;
    }

    public class HealthCheckResult{
        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

}
