package cn.edu.gdmec.s07150716.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
    }
    public void myClick(View v){
        Toast.makeText(this,"第四式",Toast.LENGTH_LONG).show();
    }
}
