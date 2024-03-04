package hw2.exercise3.selectionSort;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Map;
import java.util.Set;

public class DrawLineChart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(createChart(putData()));
        stage.setScene(new Scene(pane, 1500, 500));
        stage.show();
    }

    public Map<Integer, Double> putData() {
        Data data = new Data();
        Map<Integer, Double> dataMap = data.runtimeStatistics();
        return dataMap;
    }


    public Node createChart(Map<Integer, Double> dataMap) {
        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Number of elements");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Time");

        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.setName("SelectionSort");

        Set<Integer> set = dataMap.keySet();
        for (Integer key : set) {
            System.out.println(key + ":" + dataMap.get(key));
            dataSeries.getData().add(new XYChart.Data(key, dataMap.get(key)));
        }
        LineChart chart = new LineChart(xAxis, yAxis);
        chart.getData().addAll(dataSeries);
        chart.setTitle("Running times of SelectionSort");
        return chart;
    }
}
