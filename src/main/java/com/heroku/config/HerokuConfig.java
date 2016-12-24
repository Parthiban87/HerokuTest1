package com.heroku.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by pperiasami on 24/12/16.
 */
@Getter
@Setter
@Component
public class HerokuConfig {

    @Value("${heroku.user.name}")
    String heroku_user_name;

    @Value("${heroku.password}")
    String heroku_password;

}
