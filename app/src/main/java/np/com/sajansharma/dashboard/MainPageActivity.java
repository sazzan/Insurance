package np.com.sajansharma.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import np.com.sajansharma.dashboard.databinding.ActivityMainBinding;
import np.com.sajansharma.dashboard.databinding.ActivityMainPageBinding;

public class MainPageActivity extends AppCompatActivity {
private ActivityMainPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        binding.buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainLogin_Activity.class);
                startActivity(intent);
            }
        });

        binding.skip.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(),EducationActivity.class);
            startActivity(intent);

        });
        binding.signuplevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
            }
        });
    }

}