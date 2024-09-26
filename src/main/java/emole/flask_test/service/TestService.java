package emole.flask_test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class TestService {

    private final RestTemplate restTemplate;

    public String getResult() {
        String url = "http://127.0.0.1:5000/test";
        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.setContentType((MediaType.APPLICATION_JSON));
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}
