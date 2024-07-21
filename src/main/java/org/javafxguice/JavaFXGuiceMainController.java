package org.javafxguice;

import com.google.inject.Inject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class JavaFXGuiceMainController {

    @FXML
    private Button fxButton;

    @FXML
    private ListView<String> fxListView;

    private final BusinessLogic businessLogic;

    /*
     * Guiceによるコンストラクターインジェクション
     */
    @Inject
    JavaFXGuiceMainController(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    /*
     * コントローラーの初期設定
     */
    public void initialize() {

        /*
         * ボタンアクションの設定
         */
        fxButton.setOnAction(event -> {
            /*
             * ビジネスロジックの結果をListViewに追加
             */
            String dateTimeString = businessLogic.getDateTimeString();
            fxListView.getItems().add(dateTimeString);
        });
    }

}
