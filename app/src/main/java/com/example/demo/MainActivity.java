package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String building="";
    static String room="";
    static String classRoomNo="";
    static String date="";
    static String classSeq="";
    static String courseNo="";
    static String userNo="";
    static String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        EditText editText1 = (EditText) findViewById(R.id.et1);
        EditText editText2 = (EditText) findViewById(R.id.et2);
        EditText editText3 = (EditText) findViewById(R.id.et3);
        EditText editText4 = (EditText) findViewById(R.id.et4);
        EditText editText5 = (EditText) findViewById(R.id.et5);
        EditText editText6 = (EditText) findViewById(R.id.et6);
        EditText editText7 = (EditText) findViewById(R.id.et7);
        EditText editText8 = (EditText) findViewById(R.id.et8);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                building = editText1.getText().toString();
                room = editText2.getText().toString();
                date = editText3.getText().toString();
                classSeq = editText4.getText().toString();
                courseNo = editText5.getText().toString();
                userNo = editText6.getText().toString();
                if (building.equals("教1")) classRoomNo = "101500" + room;
                if (building.equals("教2")) classRoomNo = "101600" + room;
                if (building.equals("教3")) classRoomNo = "101700" + room;
                if (building.equals("教4")) classRoomNo = "101800" + room;
                if (building.equals("教5")) classRoomNo = "101900" + room;
                if (building.equals("学1")) classRoomNo = "100100" + room;
                url = "https://zhjx.zafu.edu.cn/vapp/classRoomVideo/video.jhtm" + "?classRoomNo=" + classRoomNo + "X&date=" + date + "&classSeq=" + classSeq + "&courseNo=" + courseNo + "&userNo=" + userNo;
                editText7.setText(url);
                copyClieck(url);
                Toast.makeText(MainActivity.this, "园艺202李翔开发ψ(｀∇´)ψ", Toast.LENGTH_SHORT).show();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                building = editText1.getText().toString();
                room = editText2.getText().toString();
                date = editText3.getText().toString();
                classSeq = editText4.getText().toString();
                courseNo = editText5.getText().toString();
                userNo = editText6.getText().toString();
                if (building.equals("教1")) classRoomNo = "101500" + room;
                if (building.equals("教2")) classRoomNo = "101600" + room;
                if (building.equals("教3")) classRoomNo = "101700" + room;
                if (building.equals("教4")) classRoomNo = "101800" + room;
                if (building.equals("教5")) classRoomNo = "101900" + room;
                if (building.equals("学1")) classRoomNo = "100100" + room;
                url = "https://vod.zafu.edu.cn/" + date + "/" + classRoomNo + "X/1/" + classSeq + "_hls.m3u8";
                copyClieck(url);
                editText8.setText(url);
                Toast.makeText(MainActivity.this, "配合idm+可以下载视频", Toast.LENGTH_SHORT).show();

            }
        });
    }
        public void copyClieck(String text) {
            Context context = getApplicationContext();
            // 获取系统剪贴板
            ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            // 创建一个剪贴数据集，包含一个普通文本数据条目（需要复制的数据）
            ClipData clipData = ClipData.newPlainText(null, text);
            // 把数据集设置（复制）到剪贴板
            clipboard.setPrimaryClip(clipData);

    }
    private boolean isModuleActive(){
        return false;
    }
}
