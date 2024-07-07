package SortingAlgorithm;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.chart.XYChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;


public class testGraph {

    @FXML
    private Button sort;

    @FXML
    private CheckBox insertion;

    @FXML
    private CheckBox heap;

    @FXML
    private CheckBox counting;

    @FXML
    private CheckBox radix;

    @FXML
    private CheckBox merge;

    @FXML
    private CheckBox quick;

    @FXML
    private CheckBox NSquare;

    @FXML
    private CheckBox NLogN;

    @FXML
    private Label label1;


    @FXML
    private TextField InputNo;


    @FXML
    private CheckBox kplusn;

    @FXML
    private CheckBox dkplusdn;

    @FXML
    private CheckBox bubble;

    @FXML
    void event2(ActionEvent event) throws IOException {
        int fileSize;
        try {
            fileSize = Integer.parseInt(InputNo.getText());
            RandomNumber.GenerateNums(fileSize);
            System.out.println("ok");
        } catch (Exception e) {
            return;
        }

    }


    @FXML
    private LineChart<String, Number> graph;

    @FXML
    void showGraph(ActionEvent event) throws IOException {
        graph.getData().clear();
        graph.cacheProperty().unbind();


        int array[] = RandomNumber.call();
        int[] steps;
        if (insertion.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            InsertionSort algo = new InsertionSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("insertion");
            graph.getData().add(series);

        }
        if (heap.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            HeapSort algo = new HeapSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }

            series.setName("heap");
            graph.getData().add(series);

        }
        if (counting.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            CountingSort algo = new CountingSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }

            series.setName("counting");
            graph.getData().add(series);
        }
        if (radix.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            RadixSort algo = new RadixSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("radix");
            graph.getData().add(series);

        }
        if (merge.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            MergeSort algo = new MergeSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("merge");
            graph.getData().add(series);
        }
        if (quick.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            QuickSort algo = new QuickSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }

            series.setName("quick");
            graph.getData().add(series);
        }
        if (NSquare.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            nSquared algo = new nSquared(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("n_Squared");
            graph.getData().add(series);
        }
        if (NLogN.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            nlogn algo = new nlogn(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("n_log_n");
            graph.getData().add(series);
        }
        if (kplusn.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            k_plus_n algo = new k_plus_n(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("k_plus_n");
            graph.getData().add(series);
        }
        if (dkplusdn.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            dk_plus_dn algo = new dk_plus_dn(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }
            series.setName("dk_plus_dn");
            graph.getData().add(series);
        }
        if (bubble.isSelected()) {
            XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
            BubbleSort algo = new BubbleSort(array);
            steps = algo.getArraySteps();
            for (int j = 0; j < steps.length; j++) {
                series.getData().add(new XYChart.Data<String, Number>(String.valueOf(j), steps[j]));
            }

            series.setName("bubble");
            graph.getData().add(series);
        }
    }
}



