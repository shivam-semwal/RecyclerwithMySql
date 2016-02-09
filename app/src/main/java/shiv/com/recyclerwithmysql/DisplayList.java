package shiv.com.recyclerwithmysql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_list);
BackgroundTask backgroundTask=new BackgroundTask();
        backgroundTask.execute();
    }
}
