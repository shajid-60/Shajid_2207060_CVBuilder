module com.shajid.app.shajid2207060 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.shajid.app.shajid2207060 to javafx.fxml;
    exports com.shajid.app.shajid2207060;
    exports com.shajid.app.shajid2207060.controller;
    opens com.shajid.app.shajid2207060.controller to javafx.fxml;
}