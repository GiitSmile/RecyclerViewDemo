package com.muyang.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by muyang on 2016/5/13.
 */
public class DescActivity extends AppCompatActivity {

    private ImageView manage_image;
    private TextView manage_title;
    private TextView manage_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc_layout);

        manage_image = (ImageView) findViewById(R.id.manage_image);
        manage_title = (TextView) findViewById(R.id.manage_title);
        manage_content = (TextView) findViewById(R.id.manage_content);

        Intent intent=getIntent();
        Model model= (Model) intent.getSerializableExtra("Desc");
        manage_image.setImageResource(model.getImgId());
        manage_title.setText(model.getTitle());
        manage_content.setText(getString(R.string.DescContent));
    }
}
