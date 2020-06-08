package com.UdemySpringTutorial.UdemySpringTutorial;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Service annotation ensures that spring handles the instantiation and creation of the service
@Service
public class TodoHardCodedService {
    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;
    static{
        todos.add(new Todo(++idCounter,"in28minutes","learn to dance",new Date(),false));
        todos.add(new Todo(++idCounter,"rompasaurus","beat homeless people",new Date(),false));
        todos.add(new Todo(++idCounter,"dookalicious","take a shit",new Date(),false));
        todos.add(new Todo(++idCounter,"Doosh","wipe ass",new Date(),false));
    }

    public List<Todo> findAll(){
        return todos;
    }
}
