package kr.ac.knu.knutechtalkarenaserver.application.event;

import kr.ac.knu.knutechtalkarenaserver.domain.event.EventJpaEntity;
import kr.ac.knu.knutechtalkarenaserver.domain.event.EventJpaRepository;
import kr.ac.knu.knutechtalkarenaserver.global.exception.CustomRuntimeException;
import kr.ac.knu.knutechtalkarenaserver.global.exception.ErrorCode;
import kr.ac.knu.knutechtalkarenaserver.presentation.event.dto.EventRegisterCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EventService {

    private final EventJpaRepository eventJpaRepository;

    public void register(EventRegisterCommand command) {

        if (eventJpaRepository.existsByTitle(command.title())) {
            throw new CustomRuntimeException(ErrorCode.EVENT_ALREADY_EXISTS);
        }

        EventJpaEntity entity = command.toEntity();

        eventJpaRepository.save(entity);
    }
}
