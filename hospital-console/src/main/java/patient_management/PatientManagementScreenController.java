package patient_management;

import java.io.IOException;

import add_patient.AddPatientScreen;
import appointment_management.AppointmentManagementScreen;
import case_management.CaseManagementScreen;
import dashboard.DashBoardScreen;
import delete_patient.DeletePatientScreen;
import edit_patient.EditPatientScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import user_management.UserManagementScreen;

public class PatientManagementScreenController {
  @FXML private Button patients;

  @FXML private Button cases;

  @FXML private Button appointments;

  @FXML private Button users;

  @FXML private Button logout;

  @FXML private Button add_patient;

  @FXML private Button edit_patient;

  @FXML private Button delete_patient;

  @FXML private Button search_patient;

  @FXML private Button dashboard;

  public void PatientsButton(ActionEvent event) throws IOException {}

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

  public void Add_Patient(ActionEvent event) throws IOException {
    try {
      AddPatientScreen.showPatientAddScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Search_Patient(ActionEvent event) throws IOException {
    try {
    	EditPatientScreen.showPatientEditScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Edit_Patient(ActionEvent event) throws IOException {
    try {
    	EditPatientScreen.showPatientEditScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Delete_Patient(ActionEvent event) throws IOException {
    try {
    	DeletePatientScreen.showPatientDeleteScreen();
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