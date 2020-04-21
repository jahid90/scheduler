package io.jahiduls.scheduler;

import io.jahiduls.scheduler.clients.RestCallScheduleWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);

		RestCallScheduleWebClient client = new RestCallScheduleWebClient();
		System.out.println(client.getResult());
	}

}
