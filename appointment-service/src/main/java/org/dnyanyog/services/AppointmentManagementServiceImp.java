package org.dnyanyog.services;

import jakarta.validation.Valid;
import java.util.Optional;
import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.AppointmentRequest;
import org.dnyanyog.dto.AppointmentResponse;
import org.dnyanyog.entity.Appointments;
import org.dnyanyog.repo.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentManagementServiceImp {

  @Autowired private AppointmentRepository appointmentRepo;

  public AppointmentResponse addAppointment(@Valid AppointmentRequest request) throws Exception {
    AppointmentResponse appointmentResponse = AppointmentResponse.getInstance();
    Appointments newAppointment = new Appointments();

    newAppointment.setPatient_name_english(request.getPatient_name_english());
    newAppointment.setPatient_name_marathi(request.getPatient_name_marathi());
    newAppointment.setAppointment_date(request.getAppointment_date());
    newAppointment.setExamination_date(request.getExamination_date());

    try {
      newAppointment = appointmentRepo.save(newAppointment);
      populateAppointmentResponse(appointmentResponse, newAppointment);
      appointmentResponse.setStatus(ResponseCode.ADD_APPOINTMENT.getStatus());
      appointmentResponse.setMessage(ResponseCode.ADD_APPOINTMENT.getMessage());
    } catch (Exception e) {
      appointmentResponse.setStatus(ResponseCode.ADD_APPOINTMENT_FAILED.getStatus());
      appointmentResponse.setMessage(ResponseCode.ADD_APPOINTMENT_FAILED.getMessage());
    }

    return appointmentResponse;
  }

  private void populateAppointmentResponse(AppointmentResponse response, Appointments appointment) {
    response.setAppointment_id(appointment.getAppointment_id());
    response.setPatient_name_english(appointment.getPatient_name_english());
    response.setPatient_name_marathi(appointment.getPatient_name_marathi());
    response.setAppointment_date(appointment.getAppointment_date());
    response.setExamination_date(appointment.getExamination_date());
  }

  public AppointmentResponse updateAppointment(
      long appointment_id, @Valid AppointmentRequest request) {
    Optional<Appointments> optionalAppointment = appointmentRepo.findById(appointment_id);
    AppointmentResponse appointmentResponse = AppointmentResponse.getInstance();

    if (optionalAppointment.isEmpty()) {
      appointmentResponse.setStatus(ResponseCode.UPDATE_APPOINTMENT_FAILED.getStatus());
      appointmentResponse.setMessage(ResponseCode.UPDATE_APPOINTMENT_FAILED.getMessage());
    } else {
      Appointments appointment = optionalAppointment.get();

      appointment.setPatient_name_english(request.getPatient_name_english());
      appointment.setPatient_name_marathi(request.getPatient_name_marathi());
      appointment.setAppointment_date(request.getAppointment_date());
      appointment.setExamination_date(request.getExamination_date());

      appointmentRepo.save(appointment);

      populateAppointmentResponse(appointmentResponse, appointment);
      appointmentResponse.setMessage(ResponseCode.UPDATE_APPOINTMENT.getMessage());
      appointmentResponse.setStatus(ResponseCode.UPDATE_APPOINTMENT.getStatus());
    }

    return appointmentResponse;
  }

  public AppointmentResponse searchAppointment(long appointment_id) {
    Optional<Appointments> optionalAppointment = appointmentRepo.findById(appointment_id);
    AppointmentResponse appointmentResponse = AppointmentResponse.getInstance();

    if (optionalAppointment.isEmpty()) {
      appointmentResponse.setMessage(ResponseCode.SEARCH_APPOINTMENT_FAILED.getMessage());
      appointmentResponse.setStatus(ResponseCode.SEARCH_APPOINTMENT_FAILED.getStatus());
    } else {
      Appointments appointment = optionalAppointment.get();
      populateAppointmentResponse(appointmentResponse, appointment);
      appointmentResponse.setMessage(ResponseCode.SEARCH_APPOINTMENT.getMessage());
      appointmentResponse.setStatus(ResponseCode.SEARCH_APPOINTMENT.getStatus());
    }

    return appointmentResponse;
  }

  public AppointmentResponse deleteAppointment(long appointment_id) {
    Optional<Appointments> optionalAppointment = appointmentRepo.findById(appointment_id);
    AppointmentResponse appointmentResponse = AppointmentResponse.getInstance();

    if (optionalAppointment.isEmpty()) {
      appointmentResponse.setMessage(ResponseCode.DELETE_APPOINTMENT_FAILED.getMessage());
      appointmentResponse.setStatus(ResponseCode.DELETE_APPOINTMENT_FAILED.getStatus());
    } else {
      Appointments appointment = optionalAppointment.get();
      appointmentRepo.delete(appointment);

      appointmentResponse.setMessage(ResponseCode.DELETE_APPOINTMENT.getMessage());
      appointmentResponse.setStatus(ResponseCode.DELETE_APPOINTMENT.getStatus());
    }

    return appointmentResponse;
  }
}
