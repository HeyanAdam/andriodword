package cn.edu.sicnu.cs.stu.heyanjun.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 中国界面：显示中国国旗，点击按钮后出现"我已点击！"
 */
public class ChinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        TextView tvResult = findViewById(R.id.tvResult);

        // 点击按钮后显示"我已点击！"
        Button btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(v -> tvResult.setVisibility(View.VISIBLE));

        // 返回主页
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
