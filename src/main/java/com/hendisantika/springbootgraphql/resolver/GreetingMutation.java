package com.hendisantika.springbootgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hendisantika.springbootgraphql.model.Greeting;
import com.hendisantika.springbootgraphql.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/18
 * Time: 07.05
 * To change this template use File | Settings | File Templates.
 */
@Component
public class GreetingMutation implements GraphQLMutationResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting newGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return greetingRepository.save(greeting);
    }
}