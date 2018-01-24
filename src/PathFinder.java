import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;

public class PathFinder extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(final Stage stage) {
		WebView webView = new WebView();
		
		final WebEngine webEngine = webView.getEngine();

		webEngine.setJavaScriptEnabled(true);
		webEngine.load("http://dersprogramimapp.zz.vc");
		
		stage.setTitle("PathFinder");

		VBox root = new VBox();
		root.setFillWidth(true);
		root.setMinSize(1920* 2/3, 1080 * 2/3);
		webView.setPrefWidth(1920 * 2/3);
		webView.setPrefHeight(1080 * 2/3);
		root.getChildren().add(webView);

		Scene scene = new Scene(root);
		stage.setScene(scene);

		stage.show();
	}
}