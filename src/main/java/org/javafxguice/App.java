package org.javafxguice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
         * GuiceのInjectorの生成
         */
        Injector injector = Guice.createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                /*
                 * DIの設定
                 */
                bind(BusinessLogic.class).to(BusinessLogicImpl.class);
            }
        });

        FXMLLoader loader = new FXMLLoader(
                this.getClass().getResource("JavaFXGuiceMain.fxml"), null, null,
                injector::getInstance); // コントローラーファクトリーの指定
        Parent root = loader.load();

        primaryStage.setTitle("JavaFX and Guice");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
