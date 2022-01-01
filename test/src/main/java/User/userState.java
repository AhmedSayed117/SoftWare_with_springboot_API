package User;

import org.springframework.web.bind.annotation.RestController;

@RestController
public enum userState {
    ACTIVE , PENDING , BLOCkED
}
