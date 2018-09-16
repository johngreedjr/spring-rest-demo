package com.apidemo.demo;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

@RestController
@RequestMapping("/person")
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
class PersonController {
  @NonNull
  PersonService persons;

  @GetMapping("/jayreez")
  public Person hello() {
    return persons.jayReez();
  }

  @PostMapping("/hello")
  public String postHello(@RequestBody final Person person) {
    return persons.hello(person);
  }
}
