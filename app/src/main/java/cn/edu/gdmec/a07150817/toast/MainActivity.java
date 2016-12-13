package cn.edu.gdmec.a07150817.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View v){
       Toast t =  Toast.makeText(this,"Toast 直接显示",Toast.LENGTH_LONG);
        t.show();
    }
    public void button2(View v){
        //Context 报错
       // LayoutInflater lf = (LayoutInflater)getSystemService(Context, LAYOUT_INFLATER_SERVICE);
        LayoutInflater lf = getLayoutInflater();
        View vroot = lf.inflate(R.layout.toastroot,null);
        LinearLayout ll = (LinearLayout) vroot.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastroot,ll);
        Toast tost = new Toast(this);
        tost.setView(vroot);
        tost.show();
    }
    public void button3(View v){
        Toast toast = Toast.makeText(this,"我是小黄人-图文显示",Toast.LENGTH_LONG);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mimage = new ImageView(this);
        mimage.setImageResource(R.drawable.yellowman);
        View toastView = toast.getView();
        ll.addView(mimage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();

    }

}
