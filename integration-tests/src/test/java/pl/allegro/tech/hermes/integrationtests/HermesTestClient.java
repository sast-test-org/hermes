package pl.allegro.tech.hermes.integrationtests;

import jakarta.ws.rs.core.Response;
import pl.allegro.tech.hermes.api.Subscription;
import pl.allegro.tech.hermes.api.Topic;

public class HermesTestClient {

    // TODO: should replace this name with createTopicWithRandomName?
    // TODO: Include human-readable name. It can be a prefix provided by the developer or test method name.
    public Topic createRandomTopic() {
        return null;
    }

    public void createRandomSubscription(Topic topic, String endpoint) {

    }

    public void createSubscription(Topic topic, Subscription subscription) {

    }

    public Response publish(String qualifiedName, String body) {
        return null;
    }

}
