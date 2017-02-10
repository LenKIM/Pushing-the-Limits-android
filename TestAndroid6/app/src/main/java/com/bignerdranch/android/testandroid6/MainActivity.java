package com.bignerdranch.android.testandroid6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageButton mImageButtonTop;
    private ImageButton mImageButtonButtom;
    private ImageButton mImageButtonRight;
    private ImageButton mImageButtonLeft;
    private ImageView mImageView[] = new ImageView[10];

    private int currentIndex = 5;
    private int previousIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVariable();

        mImageButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousIndex = currentIndex;
                currentIndex = previousIndex - 3;
                if (currentIndex > 0) {
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                } else {
                    currentIndex = currentIndex + 9;
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                }
            }
        });

        mImageButtonButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousIndex = currentIndex;
                currentIndex = previousIndex + 3;
                if (currentIndex <= 9) {
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                } else {
                    currentIndex = currentIndex - 9;
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                }
            }
        });

        mImageButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousIndex = currentIndex;
                currentIndex = previousIndex - 1;
                if (currentIndex > 0) {
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                } else {
                    currentIndex = currentIndex + 9;
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                }
            }
        });

        mImageButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previousIndex = currentIndex;
                currentIndex = previousIndex + 1;
                if (currentIndex <= 9) {
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                } else {
                    currentIndex = currentIndex - 9;
                    mImageView[currentIndex].setImageResource(R.drawable.ic_launcher);
                    mImageView[previousIndex].setImageResource(0);
                }
            }
        });

    }

    private void setVariable() {
        mImageButtonTop = (ImageButton) findViewById(R.id.Top_button);
        mImageButtonButtom = (ImageButton) findViewById(R.id.Button_button);
        mImageButtonLeft = (ImageButton) findViewById(R.id.Left_button);
        mImageButtonRight = (ImageButton) findViewById(R.id.Right_button);

        mImageView[1] = (ImageView) findViewById(R.id.ImageView1);
        mImageView[2] = (ImageView) findViewById(R.id.ImageView2);
        mImageView[3] = (ImageView) findViewById(R.id.ImageView3);
        mImageView[4] = (ImageView) findViewById(R.id.ImageView4);
        mImageView[5] = (ImageView) findViewById(R.id.ImageView5);
        mImageView[6] = (ImageView) findViewById(R.id.ImageView6);
        mImageView[7] = (ImageView) findViewById(R.id.ImageView7);
        mImageView[8] = (ImageView) findViewById(R.id.ImageView8);
        mImageView[9] = (ImageView) findViewById(R.id.ImageView9);
    }
}
