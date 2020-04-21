package io.jahiduls.scheduler.config;

import io.jahiduls.scheduler.handlers.RestCallScheduleHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RestCallScheduleRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(RestCallScheduleHandler handler) {
        return RouterFunctions.route(RequestPredicates.GET("/schedule/rest")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), handler::getAllScheduledRestCalls);
    }

}
