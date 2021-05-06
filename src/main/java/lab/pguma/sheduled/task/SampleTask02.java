package lab.pguma.sheduled.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleTask02 {

  @Scheduled(cron = "${cron.cron2}")
  public void doSomething() {
    System.out.println("SampleTask02の起動が正常に行われました");
    throw new RuntimeException("SampleTask02が異常終了しました。");
  }
}