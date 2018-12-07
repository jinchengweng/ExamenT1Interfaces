package application;


import application.view.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


/**
 * @author Jincheng Weng
 * @version 1.0
 * @see clase: ExamenJavaFX.fxml , ExamenJavaFX_Menu.fxml , Controller.java
 */
public class Main extends Application {
	Stage stage;



	@Override
	public void start(Stage myStage) throws Exception {

		stage = myStage;

		MainWindow();

	}
/**
 * @see metodo para enlazar con el fichero FXML y el controlador
 * 
 */
	private void MainWindow() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"./view/ExamenJavaFX.fxml"));
			AnchorPane pane = loader.load();
		
			Scene scene = new Scene(pane);
			
			loader.setController(new Controller());
		
			
			stage.setResizable(true);
			stage.setScene(scene);
		
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeStage() {
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}