package study.mrbluesky.study.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import study.mrbluesky.study.exception.AnotherException;
import study.mrbluesky.study.exception.TestException;

@Service
@NoArgsConstructor
@Slf4j
public class TestService {

  public void testService() {
    log.info("Test Service!!");
    throw new TestException("Exception occurred!!");
  }

  public void testAservice() {
    log.info("Test Service!!");
    throw new AnotherException("Exception occurred!!");
  }

}
