package com.thaz.utils.logcreator;

import com.thaz.utils.logcreator.app.MyApp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogcreatorApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LogcreatorApplication.class, args);

		MyApp app = new MyApp();
		app.creatLog();;
	}

}
