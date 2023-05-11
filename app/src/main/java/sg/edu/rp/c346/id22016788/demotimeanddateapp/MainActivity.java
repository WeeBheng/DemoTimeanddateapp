package sg.edu.rp.c346.id22016788.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnResetTimeandDate;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.DatePicker);
        tp = findViewById(R.id.TimePicker);
        btnDisplayDate = findViewById(R.id.ButtonDisplayDate);
        btnDisplayTime = findViewById(R.id.ButtonDisplayTime);
        tvDisplay = findViewById(R.id.textViewdisplay);
        btnResetTimeandDate = findViewById(R.id.resetButton);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Hour = tp.getHour();
                int Minute = tp.getMinute();
                String stringtime = "Time is " + Hour + ":" + Minute;

                tvDisplay.setText(stringtime);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Year = dp.getYear();
                int Month = dp.getMonth();
                int Day = dp.getDayOfMonth();
                String date = "Date is " + Day + "/" + (Month+1) + "/" + Year;
                tvDisplay.setText(date);



            }
        });

        btnResetTimeandDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tp.setHour(12);
                tp.setMinute(0);
                dp.updateDate(2020, 0, 1);


            }
        });



    }
}