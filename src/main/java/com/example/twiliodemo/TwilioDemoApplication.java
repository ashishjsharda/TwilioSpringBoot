package com.example.twiliodemo;

import com.twilio.Twilio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class TwilioDemoApplication implements ApplicationRunner {

    private final static String ACCOUNT_SID = "<your-account-sid>";
    private final static String AUTH_ID = "<your-auth-id>";

    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }
    public static void main(String[] args) {
        SpringApplication.run(TwilioDemoApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Message.creator(new PhoneNumber("To"), new PhoneNumber("From"),
                "Incoming Message from Twilio Demo Application").create();

    }
}
