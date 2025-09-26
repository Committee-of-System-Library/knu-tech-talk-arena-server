package kr.ac.knu.knutechtalkarenaserver.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // 유저 관련 에러
    USER_ALREADY_EXISTS(HttpStatus.CONFLICT, "이미 존재하는 사용자입니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),

    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 에러발생");



    private final HttpStatus status;
    private final String message;
}
