package add_appointment;
import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class AddAppointmentScreen {


	  public static void showAddAppointmentManagementScreen() {
		  try {
				
				
				Parent actorGroup=FXMLLoader.load(new URL("file:\\Users\\Jai\\eclipse-workspace\\hospital-console\\src\\main\\java\\add_appointment\\AddAppointmentScreen.fxml\\"));
	      StageFactory.stage.setTitle("Appointment Management Screen");
			Scene scene=new Scene(actorGroup,600,400);
		     StageFactory.stage.setScene(scene);
		    StageFactory.stage.setFullScreen(true);;
			StageFactory.stage.show();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		}
		}



