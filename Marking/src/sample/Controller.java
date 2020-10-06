package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public ListView<Perso> aList;

    public void listMethod(MouseEvent mouseEvent) {
        List<Perso> perso = aList.getItems();
    }

    public void addTest(ActionEvent actionEvent) {
        Perso perso = new Perso();
        perso.name="test";
        aList.getItems().add(perso);
    }
}
