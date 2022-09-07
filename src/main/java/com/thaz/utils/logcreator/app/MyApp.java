package com.thaz.utils.logcreator.app;


import ch.qos.logback.core.util.TimeUtil;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.boot.logging.LogLevel;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

@Log
public class MyApp {

    public void creatLog() throws InterruptedException {

        Level level = Level.INFO;
        int max = 10000;
        while (max > 0) {
            max--;
            log.log(Level.SEVERE, "  app runniing");
            log.log(level, "info log goes here");


            TimeUnit.SECONDS.sleep(4);
        }


    }
}

