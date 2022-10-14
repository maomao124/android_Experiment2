package mao.android_experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity5 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        TextView textView = findViewById(R.id.TextView);
        TimePicker timePicker = findViewById(R.id.TimePicker);
        timePicker.setIs24HourView(true);

        findViewById(R.id.Button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();
                String s = "201913030234 – Selected Time: " + hour + ":" + minute + "";
                textView.setText(s);
            }
        });
    }
}