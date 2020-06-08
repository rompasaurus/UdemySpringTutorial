package com.UdemySpringTutorial.UdemySpringTutorial.helloWorld;

public class HelloWorldBean {
    private String message;
    private String anotherMessage = "Another Message YO";

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setAnotherMessage(String anotherMessage) {
        this.anotherMessage = anotherMessage;
    }

    public String getAnotherMessage() {
        return anotherMessage;
    }
}
