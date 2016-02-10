package org.t_robop.ebihara.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quiz_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        quiz_num=quiz_num+1;
        Intent intent=new Intent(this,SubActivity.class);
        intent.putExtra("quiz_number",quiz_num);
        startActivity(intent);
    }
}
