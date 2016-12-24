package com.heroku.service.impl;

import com.heroku.config.HerokuConfig;
import com.heroku.endpoints.HerokuEndpoint;
import com.heroku.service.HerokuService;
import com.jayway.restassured.http.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;

/**
 * Created by pperiasami on 23/12/16.
 */
@Service
public class HerokuServiceImpl implements HerokuService {

    @Autowired
    HerokuConfig herokuConfig;
    @Override
    public String getDynoConfig(String app) {

        String response = given().header("Accept","application/vnd.heroku+json; version=3").
                auth().preemptive().basic(herokuConfig.getHeroku_user_name(),herokuConfig.getHeroku_password()).
                when().get(HerokuEndpoint.dyno).
                then().statusCode(200).extract().toString();
        //given().when().get("http://www.google.com").then().statusCode(200);


        return response;

    }
}
