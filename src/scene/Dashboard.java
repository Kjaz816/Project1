package scene;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Dashboard {
	  @FXML private Button button_dashboard;

	  @FXML private Button button_notes;

	  @FXML private Button button_todo;

	  @FXML private Button button_drawboard;
	  
	  @FXML private Button button_timer;
	  
	  /** Click handler for the notes button. */
	  @FXML
	  private void notes() {
	    SceneManager.switchToNotesScene();
	  }
	  
	  /** Click handler for the notes button. */
	  @FXML
	  private void todo() {
	    SceneManager.switchToTodoScene();
	  }
	  
	  /** Click handler for the notes button. */
	  @FXML
	  private void drawboard() {
	    SceneManager.switchToDrawboardScene();
	  }
	  
	  /** Click handler for the notes button. */
	  @FXML
	  private void timer() {
	    SceneManager.switchToTimerScene();
	  }
}
