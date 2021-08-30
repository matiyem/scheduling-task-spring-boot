package scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by Atiye Mousavi
 * Date: 8/29/2021
 * Time: 9:18 AM
 */

@Component
@Slf4j
@EnableScheduling//این تضمین میکند که در پس زمینه یک executor ساخته میشود بدون این annotation هیچ چیزی برنامه ریزی نمیشود
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");

    //ورودی cron برای گرفتن یک cron experssion است
    //ورودی fixedDelay یک دیلی بین آخرین اجرا و اجرای بعدی است
    //ورودی fixedDelayString یک دیلی بین آخرین اجرا و اجرای بعدی است
    //ورودی fixedRate به این صورت است که مثلا هر 5 ثانیه اجرا شود
    //ورودی fixedRateString به این صورت است که مثلا هر 5 ثانیه اجرا شود
    //ورودی initialDelay میزان تاخیر قبل از اجرا fixedDelay یا fixedReate
    //ورودی initialDelayString میزان تاخیر قبل از اجرا fixedDelay یا fixedReate
    //ورودی zone برای time zone برای cron expression است

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        log.info("The Time is now {}",dateFormat.format(new Date()));

    }

}
