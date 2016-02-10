package org.t_robop.ebihara.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    int ans1;
    TextView result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent result=getIntent();
        ans1= result.getIntExtra("ans",0);
        if(ans1==1){
            result1=(TextView) findViewById(R.id.textView3);
            result1.setText(String.valueOf("正解だゾ"));
        }
        else if(ans1==0){
            result1=(TextView) findViewById(R.id.textView3);
            result1.setText(String.valueOf("不正解だゾ"));
        }
    }

    public void restart(View v){
        Intent restart=new Intent(this,MainActivity.class);
        startActivity(restart);
    }
}
