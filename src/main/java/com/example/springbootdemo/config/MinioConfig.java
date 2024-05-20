package com.example.springbootdemo.config;

import com.example.springbootdemo.model.MinioPo;
import io.minio.MinioClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class MinioConfig {
    @Resource
    private MinioPo minioProp;
    /**
     * 获取MinioClient
     */
    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(minioProp.getUrl())
                .credentials(minioProp.getAccessKey(), minioProp.getSecretKey())
                .build();
    }

}