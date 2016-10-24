package cn.edu.gdmec.s07150716.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act3 extends AppCompatActivity {
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        btn3= (Button) findViewById(R.id.button3);
        btn3.setText("匿名内部类");
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(Act3.this,"第三式",Toast.LENGTH_LONG).show();
            }
        });
    }
}
