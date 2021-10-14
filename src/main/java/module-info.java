module com.example.hellovistulanimera {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.hellovistulanimera to javafx.fxml;
    exports com.example.hellovistulanimera;
}