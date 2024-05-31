package org.dnyanyog.dto;

public class AppointmentResponse {

  private String status;
  private String message;
  private String patient_name_english;
  private String patient_name_marathi;
  private String appointment_date;
  private String examination_date;
  private long appointment_id;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getPatient_name_english() {
    return patient_name_english;
  }

  public void setPatient_name_english(String patient_name_english) {
    this.patient_name_english = patient_name_english;
  }

  public String getPatient_name_marathi() {
    return patient_name_marathi;
  }

  public void setPatient_name_marathi(String patient_name_marathi) {
    this.patient_name_marathi = patient_name_marathi;
  }

  public String getAppointment_date() {
    return appointment_date;
  }

  public void setAppointment_date(String appointment_date) {
    this.appointment_date = appointment_date;
  }

  public String getExamination_date() {
    return examination_date;
  }

  public void setExamination_date(String examination_date) {
    this.examination_date = examination_date;
  }

  public long getAppointment_id() {
    return appointment_id;
  }

  public void setAppointment_id(long appointment_id) {
    this.appointment_id = appointment_id;
  }

  public static AppointmentResponse getInstance() { // TODO Auto-generated method stub
    return new AppointmentResponse();
  }
}
