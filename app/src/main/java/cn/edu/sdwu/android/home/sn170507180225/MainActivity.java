package cn.edu.sdwu.android.home.sn170507180225;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载界面，不要写文件名，使用资源ID来引用资源
        setContentView(R.layout.activity_main);
        int a=1;
        //1）获取普通界面组件
        //Button button=(Button) findViewById(R.id.button1);
        //2)实现事件监听类，该监听类是一个特殊的Java类，
        //必须实现一个XXXListener接口；
        //3）调用事件源的setXXXListener方法注册事件监听器
    }
    class MyClickListener implements View.OnClickListener{
        public void onClick(View view){
            //输出日志，两个参数，tag，message
            Log.i(MainActivity.class.toString(),"content");
        }
    }
}
