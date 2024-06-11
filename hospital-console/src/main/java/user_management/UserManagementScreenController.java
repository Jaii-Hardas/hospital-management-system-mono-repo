package user_management;

import java.io.IOException;
import add_user.AddUserScreen;
import appointment_management.AppointmentManagementScreen;
import case_management.CaseManagementScreen;
import dashboard.DashBoardScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import patient_management.PatientManagementScreen;

public class UserManagementScreenController {
  @FXML private Button patients;

  @FXML private Button cases;

  @FXML private Button appointments;

  @FXML private Button users;

  @FXML private Button logout;

  @FXML private Button add_user;

  @FXML private Button edit_user;

  @FXML private Button delete_user;

  @FXML private Button search_user;

  @FXML private Button dashboard;

  public void PatientsButton(ActionEvent event) {
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

  public void Add_User(ActionEvent event) throws IOException {
    try {
      AddUserScreen.showUserAddScreen();
    } catch (Exception e) { // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void Search_User(ActionEvent event) throws IOException {}

  public void Edit_User(ActionEvent event) throws IOException {}

  public void Delete_User(ActionEvent event) throws IOException {}

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