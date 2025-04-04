package fi.arcada.codechallenge;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//test
public class MainActivity extends AppCompatActivity {

    TextView hello;
    TextView resultTextView;
    Button calculateButton;
    ArrayList<Double> numbers;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.hello);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton = findViewById(R.id.calculateButton);



        hello.setText("Min app funkar!");

        numbers = new ArrayList<>();

        numbers.add(10.10);
        numbers.add(20.20);
        numbers.add(30.30);
        numbers.add(40.40);
        numbers.add(50.50);

        calculateButton.setOnClickListener(v -> calculate());
    }

    public void calculate() {
        // from class Statistics
        double mean = Statistics.calcMean(numbers);

        resultTextView.setText("Medelvärde är: " + mean);
    }
}






