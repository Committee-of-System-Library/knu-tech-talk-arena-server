package kr.ac.knu.knutechtalkarenaserver.presentation.event;


import kr.ac.knu.knutechtalkarenaserver.application.event.EventService;
import kr.ac.knu.knutechtalkarenaserver.global.util.ApiResponseWrapper;
import kr.ac.knu.knutechtalkarenaserver.presentation.event.dto.EventRegisterCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/event")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @PostMapping
    public ResponseEntity<ApiResponseWrapper<Void>> register(
            @RequestBody EventRegisterCommand request
    ) {
        eventService.register(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponseWrapper.success(HttpStatus.CREATED, "이벤트 등록 성공"));
    }
}
