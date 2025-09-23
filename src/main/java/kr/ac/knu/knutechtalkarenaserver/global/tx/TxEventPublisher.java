package kr.ac.knu.knutechtalkarenaserver.global.tx;

import org.springframework.context.ApplicationEventPublisher;

public interface TxEventPublisher {

    ApplicationEventPublisher publisher();

    default <T extends TxEvent<?>> void publish(T event) {
        publisher().publishEvent(event);
    }
}