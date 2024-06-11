package dashboard;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DashBoardScreen {

  public static void showDashBoardScreen() {
	  try {
			
			
			Parent actorGroup=FXMLLoader.load(new URL("file:///C:\\Users\\Jai\\eclipse-workspace\\hospital-console\\src\\main\\java\\dashboard\\DashBoardScreen.fxml\\"));
      StageFactory.stage.setTitle("DashBoard Screen");
		Scene scene=new Scene(actorGroup,600,400);
	     StageFactory.stage.setScene(scene);
	    StageFactory.stage.setFullScreen(true);;
		StageFactory.stage.show();
		
		
	}catch (Exception e){
		e.printStackTrace();
	}
	}
  }
