module com.lojadisco {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lojadisco to javafx.fxml;
    exports com.lojadisco;
}
