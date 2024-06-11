package hospital_management_main;

import common.StageFactory;
import dashboard.DashBoardScreen;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class ApplicationMain extends Application {

  public static void main(String args[]) {
    launch(args);
  }

  public void start(Stage stage) throws Exception {

    StageFactory.stage = stage;
    LoginScreen.showLoginScreen();
    //DashBoardScreen.showDashBoardScreen();
  }
}

