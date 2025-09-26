package kr.ac.knu.knutechtalkarenaserver.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // 이벤트 관련 에러
    EVENT_ALREADY_EXISTS(HttpStatus.CONFLICT, "이미 존재하는 이벤트 제목입니다."),

    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 에러발생");

    private final HttpStatus status;
    private final String message;
}
