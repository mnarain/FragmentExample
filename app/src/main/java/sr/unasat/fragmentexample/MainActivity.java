package sr.unasat.fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new FirstFragment());
    }

    public void selectFragment(View view) {
        if (view == findViewById(R.id.fragOneButton)) {
            loadFragment(new FirstFragment());
        }
        if (view == findViewById(R.id.fragTwoButton)) {
            loadFragment(new SecondFragment());
        }
        if (view == findViewById(R.id.fragThreeButton)) {
            loadFragment(new ThirdFragment());
        }

    }

    private void loadFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }

}
