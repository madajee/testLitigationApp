package legalDiary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
    Utilities utilties;

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        log.info("********Start Logging From Main Method******");
        log.info("********Hello Litigation App******");
        log.info("********End Logging From Main Method********");
    }

    @Bean
    public CommandLineRunner run() throws Exception {

    	utilties.getTodayDate();
    	return null;

    }
}