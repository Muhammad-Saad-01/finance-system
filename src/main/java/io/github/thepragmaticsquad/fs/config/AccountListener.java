package io.github.thepragmaticsquad.fs.config;

import io.github.thepragmaticsquad.fs.model.BasicAccountModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class AccountListener {
    @RabbitListener(queues = MQConfig.ACCOUNT_QUEUE)
    public void listener(BasicAccountModel account) {
        System.out.println("Received Message From RabbitMQ: " + account);
    }
}
