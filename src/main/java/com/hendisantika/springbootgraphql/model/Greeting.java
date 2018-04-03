package com.hendisantika.springbootgraphql.model;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/04/18
 * Time: 07.03
 * To change this template use File | Settings | File Templates.
 */
public class Greeting {
    private String id;

    private String message;

    public Greeting() {
    }

    public Greeting(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
