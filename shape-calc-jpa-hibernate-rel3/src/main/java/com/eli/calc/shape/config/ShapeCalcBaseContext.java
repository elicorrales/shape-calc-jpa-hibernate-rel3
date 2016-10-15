package com.eli.calc.shape.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages="com.eli.calc.shape")
@PropertySource("classpath:base.properties")
//formerly known as AppContext
public class ShapeCalcBaseContext {

	private static final Logger logger = LoggerFactory.getLogger(ShapeCalcBaseContext.class);
	
    @Autowired
    private Environment env; // to have access to application.properties

    public ShapeCalcBaseContext() {
    	logger.debug("\n\n\nConstructor\n\n\n");
    }

    @Bean(name="executor")
    ExecutorService getExecutor() {

        return Executors.newFixedThreadPool(
            Integer.parseInt(env.getRequiredProperty("executor.threadpool.size"))
        );
    }

}