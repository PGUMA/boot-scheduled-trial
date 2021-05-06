package lab.pguma.sheduled.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleTask01 {

  @Scheduled(cron = "${cron.cron1}")
  public void doSomething() {
    System.out.println("SampleTask01の起動が正常に行われました");
  }
}