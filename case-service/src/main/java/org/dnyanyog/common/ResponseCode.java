package org.dnyanyog.common;

public enum ResponseCode {
  ADD_CASES_SUCCESS("Success", "Case added successfully"),
  ADD_CASES_FAILED("Fail", "Unable to add case"),
  SEARCH_CASES_SUCCESS("Success", "Case found"),
  SEARCH_CASES_FAILURE("Fail", "Case not found"),
  UPDATE_CASES_SUCCESS("success", "Case updated"),
  UPDATE_CASES_FAILURE("Fail", "Case not updated"),
  DELETE_PATIENT("Success", "Patient deleted successfully!!"),
  DELETE_PATIENT_FAILED("Fail", "Unable to remove patient");

  private final String status;
  private final String message;

  ResponseCode(String status, String message) {
    this.status = status;
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
