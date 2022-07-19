package org.devele.study;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        ImageView detail_image = findViewById(R.id.detail_image);
        detail_image.setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.MULTIPLY);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String teamName = intent.getStringExtra("teamName");
        TextView detail_title = findViewById(R.id.detail_title);
        TextView detail_teamname = findViewById(R.id.detail_teamname);
        detail_title.setText(title);
        detail_teamname.setText(teamName);
    }

}