package study.mrbluesky.study.exception;

public class AnotherException extends RuntimeException {

  private String message;

  public AnotherException(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
