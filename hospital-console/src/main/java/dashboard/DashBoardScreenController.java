package dashboard;

import java.io.IOException;

import appointment_management.AppointmentManagementScreen;
import case_management.CaseManagementScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import patient_management.PatientManagementScreen;
import user_management.UserManagementScreen;

public class DashBoardScreenController {

  @FXML private Button patients;

  @FXML private Button cases;

  @FXML private Button appointments;

  @FXML private Button users;

  @FXML private Button logout;

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

  public void LogoutButton(ActionEvent event) throws IOException {

    try {
      LoginScreen.showLoginScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}