module javafxguice {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    // DI対応
    requires com.google.guice;
    requires jakarta.inject;

    opens org.javafxguice to
            javafx.fxml,
            com.google.guice;

    exports org.javafxguice;
}
