package study.mrbluesky.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mrbluesky.study.service.TestService;

@RestController
public class TestController {

  private TestService testService;

  @Autowired
  public TestController(TestService testService) {
    this.testService = testService;
  }

  @GetMapping(path = "/exception")
  public String testException() {
    testService.testService();
    return "Exception!!!!!!!!!!!1";
  }

  @GetMapping(path = "/aexception")
  public String testAexception() {
    testService.testAservice();
    return "Exception!!!!!!!!!!!1";
  }

}
