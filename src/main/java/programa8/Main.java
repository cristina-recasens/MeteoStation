package programa8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.scene.layout.Pane;

public class Main extends Application {

	public void start(Stage teatre) {
		try {
			FXMLLoader loader1 = new FXMLLoader(getClass().getResource("programaEstacioMeteo.fxml"));
			Parent decorat1 = loader1.load();
			Scene escenari1 = new Scene(decorat1);

			teatre.setScene(escenari1);
			teatre.setTitle("Estació meteorològica");
			teatre.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

