module programa8 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.media;

    opens programa8 to javafx.fxml;
    exports programa8;
}
