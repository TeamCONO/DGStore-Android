package org.devele.study;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Sentence> allData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        EditText etSearch = findViewById(R.id.et_search_text);
        ImageView btnSearch = findViewById(R.id.btn_search);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        Adapter adapter = new Adapter();
        for (int i = 1; i <= 50; i++) {
            adapter.addItem(new Sentence("롤링루트" + i, "406soft"));
            adapter.addItem(new Sentence("TTT" + i, "406soft"));
        }

        allData = adapter.items;
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnSentenceItemClickListener() {
            @Override
            public void onItemClick(Adapter.ViewHolder holder, View view, int position) {
                Sentence item = adapter.getItem(position);
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("title", item.getTitle());
                intent.putExtra("teamName", item.getTeamname());
                startActivity(intent);
            }
        });

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {

                Log.e("adf", "on");

                String searchText = etSearch.getText().toString();

                ArrayList<Sentence> searchArr = new ArrayList(); // 검색 된 결과
                for (Sentence s : allData) {
                    String title = s.title;

                    if (title.contains(searchText)) {
                        searchArr.add(s);
                    }
                }

                adapter.setItems(searchArr);
                adapter.notifyDataSetChanged();
            }
        });
    }
}