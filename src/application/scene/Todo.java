package application.scene;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Todo {
	  @FXML private Button button_dashboard;

	  /** Click handler for the dashboard button. */
	  @FXML
	  private void dashboard() {
	    SceneManager.switchToDashboardScene();
	  }
}
