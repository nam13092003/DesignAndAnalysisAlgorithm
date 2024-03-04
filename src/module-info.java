module DesignAndAnalysisAlgorithm {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;

    opens hw0.exercise1 to javafx.fxml;
    opens hw2.exercise3.selectionSort to javafx.fxml;
    opens hw2.exercise3.bubbleSort to javafx.fxml;


    exports hw0.exercise1;
    exports hw2.exercise3.selectionSort;
    exports hw2.exercise3.bubbleSort;

}