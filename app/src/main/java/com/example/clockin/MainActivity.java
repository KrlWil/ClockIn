package com.example.clockin;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
  Button btnAankomst;
  
  Button btnVertrek;

  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_main);
    this.btnAankomst = (Button)findViewById(R.id.btnAankomst);
    this.btnVertrek = (Button)findViewById(R.id.btnVertrek);

    this.btnAankomst.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            Calendar calendar = Calendar.getInstance();
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra("beginTime", calendar.getTimeInMillis());
            intent.putExtra("allDay", false);
            intent.putExtra("endTime", calendar.getTimeInMillis());
            intent.putExtra("title", "Aankomst werk");
            MainActivity.this.startActivity(intent);
          }
        });
    this.btnVertrek.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            Calendar calendar = Calendar.getInstance();
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra("beginTime", calendar.getTimeInMillis());
            intent.putExtra("allDay", false);
            intent.putExtra("endTime", calendar.getTimeInMillis());
            intent.putExtra("title", "Vertrek werk");
            MainActivity.this.startActivity(intent);
          }
        });
  }
}
