package appointment_management;

import java.io.IOException;

import add_appointment.AddAppointmentScreen;
import case_management.CaseManagementScreen;
import dashboard.DashBoardScreen;
import delete_appointment.DeleteAppointmentScreen;
import edit_appointment.EditAppointmentScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import patient_management.PatientManagementScreen;
import user_management.UserManagementScreen;

public class AppointmentManagementScreenController {
  @FXML private Button patients;

  @FXML private Button cases;

  @FXML private Button appointments;

  @FXML private Button users;

  @FXML private Button logout;

  @FXML private Button add_appointment;

  @FXML private Button edit_appointment;

  @FXML private Button delete_appointment;

  @FXML private Button search_appointment;

  @FXML private Button dashboard;

  public void PatientsButton(ActionEvent event) throws IOException {
    try {
      PatientManagementScreen.showPatientScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void CasesButton(ActionEvent event) throws IOException {
    try {
      CaseManagementScreen.showCasePageScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void AppointmentButton(ActionEvent event) throws IOException {
    try {
      AppointmentManagementScreen.showAppointmentManagementScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void UsersButton(ActionEvent event) throws IOException {
    try {
      UserManagementScreen.showUserScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Add_Appointment(ActionEvent event) throws IOException {
    try {
      AddAppointmentScreen.showAddAppointmentManagementScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Search_Appointment(ActionEvent event) throws IOException {
    try {
      EditAppointmentScreen.showEditAppointmentScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Edit_Appointment(ActionEvent event) throws IOException {
    try {
      EditAppointmentScreen.showEditAppointmentScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Delete_Appointment(ActionEvent event) throws IOException {
    try {
      DeleteAppointmentScreen.showDeleteAppointmentScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void LogoutButton(ActionEvent event) throws IOException {
    try {
      LoginScreen.showLoginScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Dashboard(ActionEvent event) throws IOException {
    try {
      DashBoardScreen.showDashBoardScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}