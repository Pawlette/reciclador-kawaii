package com.okta.developer.jugtours.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class GroupRepositoryTest {

    @Autowired
    GroupRepository subject;

    @Test
    public void myTest() throws Exception {
        String name = "Test Group";
        subject.save(new Group("Test Group"));
        Group result = subject.findByName(name);
        assertEquals(name, result.getName());
    }
}