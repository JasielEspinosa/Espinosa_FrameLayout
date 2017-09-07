package com.iics.ust.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_Change;
    ImageView iv_Image1, iv_Image2, iv_Image3, iv_Image4, iv_Image5, iv_Image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Change = (Button) findViewById(R.id.btnChange);
        iv_Image1 = (ImageView) findViewById(R.id.ivImage1);
        iv_Image2 = (ImageView) findViewById(R.id.ivImage2);
        iv_Image3 = (ImageView) findViewById(R.id.ivImage3);
        iv_Image4 = (ImageView) findViewById(R.id.ivImage4);
        iv_Image5 = (ImageView) findViewById(R.id.ivImage5);
        iv_Image6 = (ImageView) findViewById(R.id.ivImage6);
        btn_Change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (iv_Image1.getVisibility() == View.VISIBLE) {
                    iv_Image1.setVisibility(View.GONE);
                    iv_Image2.setVisibility(View.VISIBLE);
                    iv_Image3.setVisibility(View.GONE);
                    iv_Image4.setVisibility(View.GONE);
                    iv_Image5.setVisibility(View.GONE);
                    iv_Image6.setVisibility(View.GONE);
                } else if (iv_Image2.getVisibility() == View.VISIBLE) {
                    iv_Image1.setVisibility(View.GONE);
                    iv_Image2.setVisibility(View.GONE);
                    iv_Image3.setVisibility(View.VISIBLE);
                    iv_Image4.setVisibility(View.GONE);
                    iv_Image5.setVisibility(View.GONE);
                    iv_Image6.setVisibility(View.GONE);
                } else if (iv_Image3.getVisibility() == View.VISIBLE) {
                    iv_Image1.setVisibility(View.GONE);
                    iv_Image2.setVisibility(View.GONE);
                    iv_Image3.setVisibility(View.GONE);
                    iv_Image4.setVisibility(View.VISIBLE);
                    iv_Image5.setVisibility(View.GONE);
                    iv_Image6.setVisibility(View.GONE);
                } else if (iv_Image4.getVisibility() == View.VISIBLE) {
                    iv_Image1.setVisibility(View.GONE);
                    iv_Image2.setVisibility(View.GONE);
                    iv_Image3.setVisibility(View.GONE);
                    iv_Image4.setVisibility(View.GONE);
                    iv_Image5.setVisibility(View.VISIBLE);
                    iv_Image6.setVisibility(View.GONE);
                } else if (iv_Image5.getVisibility() == View.VISIBLE) {
                    iv_Image1.setVisibility(View.GONE);
                    iv_Image2.setVisibility(View.GONE);
                    iv_Image3.setVisibility(View.GONE);
                    iv_Image4.setVisibility(View.GONE);
                    iv_Image5.setVisibility(View.GONE);
                    iv_Image6.setVisibility(View.VISIBLE);
                } else if (iv_Image6.getVisibility() == View.VISIBLE) {
                    iv_Image1.setVisibility(View.VISIBLE);
                    iv_Image2.setVisibility(View.GONE);
                    iv_Image3.setVisibility(View.GONE);
                    iv_Image4.setVisibility(View.GONE);
                    iv_Image5.setVisibility(View.GONE);
                    iv_Image6.setVisibility(View.GONE);
                }
            }
        });
    }
}
