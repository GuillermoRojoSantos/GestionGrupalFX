module com.example.gestiongrupalfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires mysql.connector.java;
    requires java.sql;

    opens com.example.gestiongrupalfx to javafx.fxml;
    exports com.example.gestiongrupalfx;
}