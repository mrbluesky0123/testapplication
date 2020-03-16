package study.mrbluesky.study.exception;

public class TestException extends RuntimeException {

  private String message;

  public TestException(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
