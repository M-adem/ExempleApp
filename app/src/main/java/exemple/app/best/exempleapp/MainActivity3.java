package exemple.app.best.exempleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import exemple.app.best.exempleapp.ui.mainactivity3.MainActivity3Fragment;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity3_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainActivity3Fragment.newInstance())
                    .commitNow();
        }
    }
}
