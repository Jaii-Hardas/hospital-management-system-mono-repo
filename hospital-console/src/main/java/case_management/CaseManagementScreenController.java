package case_management;

import java.io.IOException;

import add_case.AddCaseScreen;
import appointment_management.AppointmentManagementScreen;
import dashboard.DashBoardScreen;
import delete_case.DeleteCaseScreen;
import edit_case.EditCaseScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import patient_management.PatientManagementScreen;
import user_management.UserManagementScreen;

public class CaseManagementScreenController {
  @FXML private Button patients;

  @FXML private Button cases;

  @FXML private Button appointments;

  @FXML private Button users;

  @FXML private Button logout;

  @FXML private Button add_case;

  @FXML private Button edit_case;

  @FXML private Button delete_case;

  @FXML private Button search_case;

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

  public void Add_Case(ActionEvent event) throws IOException {
    try {
      AddCaseScreen.showCaseAddScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Search_Case(ActionEvent event) throws IOException {
    try {
      EditCaseScreen.showCaseEditScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Edit_Case(ActionEvent event) throws IOException {
    try {
      EditCaseScreen.showCaseEditScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Delete_Case(ActionEvent event) throws IOException {
    try {
      DeleteCaseScreen.showCaseDeleteScreen();
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