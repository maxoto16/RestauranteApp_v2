module app.restaurantev2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens app.restaurantev2 to javafx.fxml;
    exports app.restaurantev2;
}