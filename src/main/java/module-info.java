module com.example.myfavoritessites {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfavoritessites to javafx.fxml;
    exports com.example.myfavoritessites;
}