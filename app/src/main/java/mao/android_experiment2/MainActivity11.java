package mao.android_experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view ->
        {
            toastShow("201913030234-1");
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view ->
        {
            toastShow("201913030234-2");
        });
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view ->
        {
            toastShow("201913030234-3");
        });
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view ->
        {
            toastShow("201913030234-4");
        });
    }

    /**
     * 显示消息
     *
     * @param message 消息
     */
    private void toastShow(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}