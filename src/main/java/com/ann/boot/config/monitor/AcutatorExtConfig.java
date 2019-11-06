package com.ann.boot.config.monitor;

import javax.sql.DataSource;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

/**
 * 自定义的监控指标,跟踪http，还有数据源监控
 */
@Configuration
public class AcutatorExtConfig {
    @ConditionalOnMissingBean(HttpTraceRepository.class)
    @Bean
    public InMemoryHttpTraceRepository traceRepository() {
        InMemoryHttpTraceRepository httpTrace = new InMemoryHttpTraceRepository();
        httpTrace.setCapacity(2);
        return httpTrace;
    }


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnEnabledEndpoint
    public HikariCPEndpoint testDataEndpoint(DataSource ds) {
        return new HikariCPEndpoint((HikariDataSource) ds);
    }


}
