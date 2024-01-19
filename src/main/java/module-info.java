module com.example.radiaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.radiaapp to javafx.fxml;
    exports com.example.radiaapp;
}