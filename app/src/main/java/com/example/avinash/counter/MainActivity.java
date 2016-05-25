package com.example.avinash.counter;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button press;
    public TextView txt;
    public int count=0;
    public RelativeLayout mlo;
    public int test=0;

    public Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlo=(RelativeLayout)findViewById(R.id.screen);

        b2=(Button)findViewById(R.id.button2);
        press=(Button)findViewById(R.id.button);
        txt=(TextView)findViewById(R.id.textView);
        txt.setText(""+count);
    }



    public void press(View v){
    count++;
        txt.setText(""+count);
        test=count%6;


        switch(test){
            case 1:mlo.setBackgroundColor(0xEECE3106);
                break;
            case 2:mlo.setBackgroundColor(0xeece0632);
                break;
            case 3:mlo.setBackgroundColor(0xEECEB706);
                break;
            case 4:mlo.setBackgroundColor(0xEE1CB652);
                break;
            case 5:mlo.setBackgroundColor(0xEE1B807A);
                break;
            case 6:mlo.setBackgroundColor(0xEEA41CB6);
                break;
            default:mlo.setBackgroundColor(0xe60a657d);
        }

    }

    public void reset(View vu)
    {txt.setText(""+0);
    mlo.setBackgroundColor(0xe60a657d);}


/*    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();


        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }*/
}
