module DesignAndAnalysisAlgorithm {
  requires javafx.fxml;
  requires javafx.controls;
    requires java.desktop;

    opens hw1.exercise1 to javafx.fxml;

  exports  hw1.exercise1;
}