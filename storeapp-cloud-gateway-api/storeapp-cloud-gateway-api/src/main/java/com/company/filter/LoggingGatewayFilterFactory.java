package com.company.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class LoggingGatewayFilterFactory extends
        AbstractGatewayFilterFactory<LoggingGatewayFilterFactory.Config> {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingGatewayFilterFactory.class);

    public LoggingGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            if (Boolean.TRUE.equals(config.getPreLogger())) {
                logger.info("Pre Gateway Filter Logging:" + config.getBaseMessage());
            }
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {

                if (Boolean.TRUE.equals(config.getPostLogger())) {
                    logger.info("Pre Gateway Filter Logging:" + config.getBaseMessage());
                }

            }));
        };
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Config {
        private String baseMessage;
        private Boolean preLogger;
        private Boolean postLogger;
    }
}