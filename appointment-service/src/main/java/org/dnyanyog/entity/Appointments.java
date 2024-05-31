package org.dnyanyog.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Appointments {

  @GeneratedValue
  @Id
  @Column(name = "AppointmnetId", nullable = false, insertable = true, updatable = false)
  private long appointment_id;

  @Column(nullable = false, insertable = true, updatable = false, length = 50)
  private String patient_name_english;

  @Column(nullable = false, insertable = true, updatable = false, length = 50)
  private String patient_name_marathi;

  @Column(nullable = false, insertable = true, updatable = false, length = 50)
  private String appointment_date;

  @Column(nullable = false, insertable = true, updatable = false, length = 50)
  private String examination_date;

  public long getAppointment_id() {
    return appointment_id;
  }

  public void setAppointment_id(long appointment_id) {
    this.appointment_id = appointment_id;
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
}
