package com.example.twiliodemo;

import com.twilio.Twilio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwilioDemoApplication {

    private final static String ACCOUNT_SID = "<your-account-sid>";
    private final static String AUTH_ID = "<your-auth-id>";

    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }
    public static void main(String[] args) {
        SpringApplication.run(TwilioDemoApplication.class, args);
    }


}
