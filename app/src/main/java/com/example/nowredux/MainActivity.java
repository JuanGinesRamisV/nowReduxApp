package com.example.nowredux;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn;

    //<editor-fold desc="getters and setters">
    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
    //</editor-fold>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);
    }


    @Override
    public void onClick(View view) {
        updateTime();
    }

    private void updateTime(){
        btn.setText(new Date().toString());
    }
}