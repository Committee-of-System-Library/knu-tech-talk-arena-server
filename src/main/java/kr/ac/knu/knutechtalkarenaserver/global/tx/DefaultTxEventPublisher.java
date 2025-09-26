package kr.ac.knu.knutechtalkarenaserver.global.tx;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultTxEventPublisher implements TxEventPublisher {

    private final ApplicationEventPublisher publisher;
    
    @Override
    public ApplicationEventPublisher publisher() {
        return publisher;
    }

}
