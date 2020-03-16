package study.mrbluesky.study.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import study.mrbluesky.study.ErrorCode;
import study.mrbluesky.study.vo.ErrorResponse;

@ControllerAdvice
@Slf4j
public class AnotherExceptionHandler {

  @ExceptionHandler(value = {AnotherException.class})
  public ResponseEntity<ErrorResponse> handleTestException(AnotherException testException) {
    log.error("TEST EXCEPTION!!!", testException);
    ErrorResponse errorResponse = new ErrorResponse(ErrorCode.MEMBER_ID_DUPLICATION.getMessage(), ErrorCode.MEMBER_ID_DUPLICATION.getCode());
    return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
  }


}

