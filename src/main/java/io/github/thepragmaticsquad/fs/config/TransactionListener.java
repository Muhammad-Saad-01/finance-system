package io.github.thepragmaticsquad.fs.config;

import io.github.thepragmaticsquad.fs.model.SimpleTransactionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {
    Logger logger = LoggerFactory.getLogger(TransactionListener.class);
    @RabbitListener(queues = RabbitMQConfig.TRANSACTION_QUEUE)
    public void listener(SimpleTransactionModel transaction) {
        logger.info("Received Message From RabbitMQ: " + transaction);
    }
}
