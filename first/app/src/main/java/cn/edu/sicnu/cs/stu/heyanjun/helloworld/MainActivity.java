package cn.edu.sicnu.cs.stu.heyanjun.helloworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 三个按钮分别进入三个国旗界面
        findViewById(R.id.btnChina).setOnClickListener(v ->
                startActivity(new Intent(this, ChinaActivity.class)));

        findViewById(R.id.btnFrance).setOnClickListener(v ->
                startActivity(new Intent(this, FranceActivity.class)));

        findViewById(R.id.btnUs).setOnClickListener(v ->
                startActivity(new Intent(this, UsActivity.class)));
    }
}
