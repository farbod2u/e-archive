package io.github.farbod2u.exception.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/***
 * @author Saeed Safaeian
 */
@AllArgsConstructor
@Getter
public class ExceptionModel {

    private String message;
    private LocalDateTime timeStamp;
    private HttpStatus status;
}
