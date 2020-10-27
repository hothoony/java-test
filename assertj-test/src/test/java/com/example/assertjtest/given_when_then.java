package com.example.assertjtest;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

public class given_when_then {

    @Test
    void given_when_then_with_mocking() {
        // given (input)
        // test preparation like creating data or configure mocks
        World worldMock = Mockito.mock(World.class);
        Hello hello = new Hello(worldMock);
        given(worldMock.say()).willReturn("world");

        // when (action)
        // call the method or action that you like to test
        String result = hello.say();

        // then (output)
        // execute assertions to verify the correct output or behavior of the action
        assertThat(result).isEqualTo("hello world");
        then(worldMock).should().say();
    }

    class Hello {
        private World world;

        public Hello(World world) {
            this.world = world;
        }

        public String say() {
            return "hello " + world.say();
        }
    }

    class World {
        public String say() {
            throw new RuntimeException();
        }
    }
}