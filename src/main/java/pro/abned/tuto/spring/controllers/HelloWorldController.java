package pro.abned.tuto.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.abned.tuto.spring.dto.Response;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/hello-dto")
    public Response<String> helloDto() {
        return Response.ok("Hello world!");
    }
}
