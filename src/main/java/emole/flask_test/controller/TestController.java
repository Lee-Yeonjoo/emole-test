package emole.flask_test.controller;

import emole.flask_test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        String result = testService.getResult();
        return ResponseEntity.of(Optional.of(result));
    }
}
