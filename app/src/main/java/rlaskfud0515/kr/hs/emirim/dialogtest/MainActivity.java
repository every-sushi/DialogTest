package rlaskfud0515.kr.hs.emirim.dialogtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] itemArr={"루나틱하이","텦투","전성우","빅스도원경"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("루나틱하이");
        dialog.setIcon(R.mipmap.ic_launcher);
       // dialog.setMessage("메세지");
        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) { //자동으로 핸들러가 만들어져요
                //루나틱하이 선택: 0 텦투선택: 1 ...
                butDialog.setText(itemArr[i]);

            }
        });
        dialog.setPositiveButton("Ok",null); //처리자 null -> 버튼을 눌러도 아무 이벤트 없음
        dialog.show();

    }
}
