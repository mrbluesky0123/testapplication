package study.mrbluesky.study;

public enum ErrorCode {

  TECHNICAL_ERROR("Technical error occurred", 1242),

  // Member
  MEMBER_ID_DUPLICATION("MemberID Duplicated", 1245),
  ;
  private int code;
  private String message;

  ErrorCode(String message, int code) {
    this.message = message;
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

}
