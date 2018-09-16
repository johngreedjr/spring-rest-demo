package com.apidemo.demo;

import org.springframework.stereotype.Service;

@Service
final class TestPerson implements PersonService {
  @Override
  public Person jayReez() {
    final Person person = new Person();
    person.setFirstname("Jay");
    person.setLastname("Reez");
    return person;
  }

  @Override
  public String hello(final Person person) {
    return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
  }
}
