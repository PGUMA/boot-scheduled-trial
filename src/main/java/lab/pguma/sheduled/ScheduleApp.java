package lab.pguma.sheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ScheduleApp {

	/**
	 * 個々のscheduleが異常終了しても他のscheduleには影響しない模様
	 * 前回異常終了（Exception）でも次回は再度起動される模様
	 */
	public static void main(String[] args) {
		SpringApplication.run(ScheduleApp.class, args);
	}

}