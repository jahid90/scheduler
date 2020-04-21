package io.jahiduls.scheduler.clients;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class RestCallScheduleWebClient {

    private final WebClient client = WebClient.create("https://localhost:8080");

    private Mono<ClientResponse> result = client.get()
            .uri("/schedule/rest")
            .accept(MediaType.APPLICATION_JSON)
            .exchange();

    public String getResult() {

        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();

    }


}
