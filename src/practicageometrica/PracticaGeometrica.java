
package practicageometrica;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PracticaGeometrica extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();   
        Scene scene = new Scene(root, 600, 400, Color.AZURE);
        primaryStage.setTitle("Ventana!");
        primaryStage.setScene(scene);
        primaryStage.show();
        Rectangle rectanguloBase = new Rectangle(100,50,Color.BLUE);
        rectanguloBase.setX(250);
        rectanguloBase.setY(200);
        Rectangle rectanguloEsquinas = new Rectangle(50,100,Color.BLUE);
        rectanguloEsquinas.setArcWidth(10);
        rectanguloEsquinas.setArcHeight(10);
        rectanguloEsquinas.setX(275);
        rectanguloEsquinas.setY(90);
        Circle circuloCorte = new Circle(10,10,5,Color.AQUA);
        circuloCorte.setCenterX(310);
        circuloCorte.setCenterY(120);
        Rectangle rectanguloCorte = new Rectangle(55,10,Color.RED);
        rectanguloCorte.setX(273);
        rectanguloCorte.setY(100);
        Rectangle rectanguloPierna = new Rectangle(10,20,Color.RED);
        rectanguloPierna.setX(280);
        rectanguloPierna.setY(180);
        rectanguloPierna.setArcWidth(5);
        rectanguloPierna.setArcHeight(5);
        Rectangle rectanguloPierna1 = new Rectangle(10,20,Color.RED);
        rectanguloPierna1.setX(310);
        rectanguloPierna1.setY(180);
        rectanguloPierna1.setArcWidth(5);
        rectanguloPierna1.setArcHeight(5); 
        Polygon trianguloUno = new Polygon();
        trianguloUno.getPoints().addAll(new Double[]{
        0.0, 0.0,
        20.0, 10.0,
        10.0, 20.0 });
        trianguloUno.setFill(Color.RED);
        trianguloUno.setTranslateX(255);
        trianguloUno.setTranslateY(90);
        root.getChildren().add(rectanguloBase);
        root.getChildren().add(rectanguloEsquinas);
        root.getChildren().add(circuloCorte);
        root.getChildren().add(rectanguloCorte);
        root.getChildren().add(rectanguloPierna);
        root.getChildren().add(rectanguloPierna1);
        root.getChildren().add(trianguloUno);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
