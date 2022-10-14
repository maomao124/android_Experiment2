package mao.android_experiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view ->
        {

            toastShow("201913030234-button1!");

        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view ->
        {

            toastShow("201913030234-alignParentRight/centerVertical!");

        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view ->
        {

            toastShow("201913030234-alignParentLeft/centerVertical!");

        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view ->
        {

            toastShow("201913030234-alignParentBottom!");

        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(view ->
        {

            toastShow("201913030234-centerInParent!");

        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(view ->
        {

            toastShow("201913030234-centerHorizontal!");

        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(view ->
        {

            toastShow("201913030234-alignParentRight!");

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