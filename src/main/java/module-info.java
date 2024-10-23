module io.github.gooosexe.relasim {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens io.github.gooosexe.relasim to javafx.fxml;
    exports io.github.gooosexe.relasim;
}