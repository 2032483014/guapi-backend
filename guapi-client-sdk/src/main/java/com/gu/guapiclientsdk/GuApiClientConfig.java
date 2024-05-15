package com.gu.guapiclientsdk;

import com.gu.guapiclientsdk.client.GuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * GuAPi 客户端配置
 *
 */
@Configuration
@ConfigurationProperties("guapi.client")
@Data
@ComponentScan
public class GuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public GuApiClient guApiClient() {
        return new GuApiClient(accessKey, secretKey);
    }

}
