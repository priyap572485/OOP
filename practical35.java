import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GradeBarChart extends Application {
    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(30); 
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        VBox projectBar = createBar("Projects - 20%", 100, Color.RED);
        VBox quizBar = createBar("Quizzes - 10%", 50, Color.BLUE);
        VBox midtermBar = createBar("Midterm Exams - 30%", 150, Color.GREEN);
        VBox finalBar = createBar("Final Exam - 40%", 200, Color.ORANGE);
        hbox.getChildren().addAll(projectBar, quizBar, midtermBar, finalBar);
        Scene scene = new Scene(hbox, 600, 300);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }
    private VBox createBar(String text, double height, Color color) {
        Rectangle bar = new Rectangle(60, height);
        bar.setFill(color);
        Label label = new Label(text);
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(bar, label);
        return vbox;
    }
    public static void main(String[] args) {
        launch(args);
    }
}