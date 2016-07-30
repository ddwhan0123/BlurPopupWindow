package wjj.lib.bpwidget;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import bpwidget.lib.wjj.blurpopupwindowlib.widget.BlurPopWin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new BlurPopWin.Builder(MainActivity.this).setContent("该配合你演出的我,眼视而不见,在比一个最爱你的人即兴表演")
                        //Radius越大耗时越长,被图片处理图像越模糊
                        .setRadius(3).setTitle("我是标题")
                        //设置居中还是底部显示
                        .setshowAtLocationType(0)
                        .onClick(new BlurPopWin.PopupCallback() {
                            @Override
                            public void onClick(@NonNull BlurPopWin blurPopWin) {
                                Toast.makeText(MainActivity.this, "中间被点了", Toast.LENGTH_SHORT).show();
                                blurPopWin.dismiss();
                            }
                        }).show(btn);
            }
        });
    }
}
