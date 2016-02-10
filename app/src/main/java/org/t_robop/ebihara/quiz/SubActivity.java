package org.t_robop.ebihara.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    int quiz_num;
    TextView quiz;
    TextView question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        //変数の値を受け取る儀式
        Intent intent=getIntent();
        quiz_num= intent.getIntExtra("quiz_number", 0);
        //TextViewに云々
        quiz = (TextView) findViewById(R.id.textView2);
        quiz.setText(String.valueOf("Q"+quiz_num));//String型に変換して表示
        question=(TextView) findViewById(R.id.textView4);
        switch (quiz_num){
            case 1:
                question.setText(String.valueOf("114○?"));
                break;
            case 2:
                question.setText(String.valueOf("What The ○?"));
            default:
                break;
        }
    }

    public void a514(View v){
        int ans1=1;
        Intent result=new Intent(this,ResultActivity.class);
        result.putExtra("ans", ans1);
        startActivity(result);
    }

    public void n931(View v){
        int ans1=0;
        Intent result=new Intent(this,ResultActivity.class);
        result.putExtra("ans",ans1);
        startActivity(result);
    }

    public void n810(View v){
        int ans1=0;
        Intent result=new Intent(this,ResultActivity.class);
        result.putExtra("ans",ans1);
        startActivity(result);
    }

    public void nfuck_you(View v){
        int ans1=0;
        Intent result=new Intent(this,ResultActivity.class);
        result.putExtra("ans",ans1);
        startActivity(result);
    }
}
