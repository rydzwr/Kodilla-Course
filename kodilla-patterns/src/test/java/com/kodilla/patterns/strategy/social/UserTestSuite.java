package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given

        User jack = new Millenials("Jack");
        User pit = new YGeneration("Pit");
        User wilson = new ZGeneration("Wilson");

        // When

        String jackShare = jack.sharePost();
        String pitShare = pit.sharePost();
        String wilsonShare = wilson.sharePost();

        // Then

        Assertions.assertEquals("Facebook", jackShare);
        Assertions.assertEquals("Twitter", pitShare);
        Assertions.assertEquals("Snapchat", wilsonShare);

    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given

        User pieter = new ZGeneration("Pieter");

        // When

        String pieterShare = pieter.sharePost();
        pieter.setSocialPublisher(new FacebookPublisher());

        String pieterFacebookShare = pieter.sharePost();

        // Then

        Assertions.assertEquals("Facebook", pieterFacebookShare);
    }
}
