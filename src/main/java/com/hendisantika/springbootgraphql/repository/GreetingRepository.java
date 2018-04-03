package com.hendisantika.springbootgraphql.repository;

import com.hendisantika.springbootgraphql.model.Greeting;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/18
 * Time: 07.04
 * To change this template use File | Settings | File Templates.
 */
@Component
public class GreetingRepository {

    private Map<String, Greeting> greetings;

    public GreetingRepository() {
        greetings = new HashMap<>();
    }

    public Greeting save(Greeting greeting) {
        String id = UUID.randomUUID().toString();

        greetings.put(id, greeting);
        greeting.setId(id);

        return greeting;
    }

    public Greeting find(String id) {
        return greetings.get(id);
    }
}