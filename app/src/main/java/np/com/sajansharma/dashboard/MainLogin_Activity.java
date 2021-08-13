package np.com.sajansharma.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.gson.JsonElement;

import org.json.JSONObject;

import np.com.sajansharma.dashboard.databinding.ActivityMainLoginBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainLogin_Activity extends AppCompatActivity {
private ActivityMainLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

   binding.buttonlevel.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
          onBackPressed();
       }

   });
       binding.skiplogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), EducationActivity.class);
               startActivity(intent);
           }
       });

       binding.login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               validateData();
           }
       });
    }
private String email="", password="";
    private void validateData() {
        email= binding.username1.getText().toString().trim();
        password = binding.password1.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            Toast.makeText(getApplicationContext(), "Email Address is not empty", Toast.LENGTH_SHORT).show();
        }else if(TextUtils.isEmpty(password)){
            Toast.makeText(getApplicationContext(), "Wrong Password", Toast.LENGTH_SHORT).show();
        }else {
            loginUser(email, password);
        }

}

    private void loginUser(String email, String password) {


        Call<LoginModel> loginModelCall =ApiClient.getInstance().getApiService().login(email, password);
        loginModelCall.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if           (response.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                           startActivity(new Intent(getApplicationContext(),EducationActivity.class));
                        }
                    },100);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {

                Toast.makeText(getApplicationContext(), "failed"+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });


           }}
