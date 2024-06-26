package com.example.springbootdemo.model;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "minio")
public class MinioPo {
    private String url;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}