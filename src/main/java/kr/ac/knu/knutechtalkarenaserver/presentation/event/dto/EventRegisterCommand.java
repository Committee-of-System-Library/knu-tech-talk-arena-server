package kr.ac.knu.knutechtalkarenaserver.presentation.event.dto;

import java.time.LocalDateTime;
import kr.ac.knu.knutechtalkarenaserver.domain.common.DurationJpaVO;
import kr.ac.knu.knutechtalkarenaserver.domain.event.EventJpaEntity;

public record EventRegisterCommand(
        String title,
        String content,
        LocalDateTime startDateTime,
        LocalDateTime endDateTime
) {

    public EventJpaEntity toEntity() {
        return EventJpaEntity.builder()
                .title(title)
                .content(content)
                .duration(DurationJpaVO.of(
                        startDateTime, endDateTime
                )).build();
    }
}
