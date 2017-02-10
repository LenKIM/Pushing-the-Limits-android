package com.yyy.xxx.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Boolean [] bool = new Boolean[9];
    private ImageButton [] one = new ImageButton[9];


    private ImageButton up, down, right, left;

    private ArrayList<ImageButton> list;

    private int first = 4;
    private int previousIndex;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < bool.length; i++) {
            bool[i] = false;
        }

        list = new ArrayList<>();

        Init();

        up.setOnClickListener(this);
        down.setOnClickListener(this);
        right.setOnClickListener(this);
        left.setOnClickListener(this);

        bool[first] = true;
        isChecked(bool[first],one[first]);



        list.add(index, one[first]);

    }

    private boolean isChecked(Boolean isChecked, ImageButton button) {
        if (isChecked){
            button.setBackgroundColor(Color.BLACK);
            return isChecked;
        } else {
            button.setBackgroundColor(Color.GRAY);
            return isChecked;
        }
    }

    private void Init() {

        one[0] = (ImageButton) findViewById(R.id.one);
        one[1] = (ImageButton) findViewById(R.id.two);
        one[2] = (ImageButton) findViewById(R.id.three);
        one[3] = (ImageButton) findViewById(R.id.four);
        one[4] = (ImageButton) findViewById(R.id.five);
        one[5]= (ImageButton) findViewById(R.id.six);
        one[6] = (ImageButton) findViewById(R.id.seven);
        one[7] = (ImageButton) findViewById(R.id.eight);
        one[8] = (ImageButton) findViewById(R.id.nine);

        up = (ImageButton) findViewById(R.id.up);
        right = (ImageButton) findViewById(R.id.right);
        left = (ImageButton) findViewById(R.id.left);
        down = (ImageButton) findViewById(R.id.down);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.up :

                previousIndex = first;
                first = previousIndex - 3;


                if (first > 0) {
                    bool[first] = true;
                    if (isChecked(bool[first],one[first])){
                        bool[previousIndex] = false;
                        isChecked(bool[previousIndex],one[previousIndex]);

                    }

                } else if (first < 0){
                    first = first + 9;
                    bool[first] = true;
                    if (isChecked(bool[first],one[first])) {
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex], one[previousIndex]);
                    }
                }

                break;

            case R.id.down :

                previousIndex = first;
                first = previousIndex + 3;

                if (first < 9) {
                    bool[first] = true;
                    if (isChecked(bool[first],one[first])){
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex],one[previousIndex]);
                    }
                } else {
                    first = first - 9;
                    bool[first] = true;
                    if (isChecked(bool[first], one[first])) {
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex], one[previousIndex]);
                    }
                }
                break;

            case R.id.right :

                previousIndex = first;
                first = previousIndex + 1;

                if (first < 9) {
                    bool[first] = true;
                    if (isChecked(bool[first],one[first])){
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex],one[previousIndex]);

                    }

                } else {
                    first = first - 9;
                    bool[first] = true;
                    if (isChecked(bool[first], one[first])) {
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex], one[previousIndex]);
                    }
                }
                break;

            case R.id.left :

                previousIndex = first;
                first = previousIndex - 1;

                if (first >= 0) {
                    bool[first] = true;
                    if (isChecked(bool[first],one[first])){
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex],one[previousIndex]);
                    }
                } else {
                    first = first + 9;
                    bool[first] = true;
                    if (isChecked(bool[first], one[first])) {
                        bool[previousIndex] = false;
//                        list.add(++index, one[previousIndex]);
                        isChecked(bool[previousIndex], one[previousIndex]);
                    }
                }
                break;
        }
    }
}
