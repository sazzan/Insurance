package np.com.sajansharma.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.Arrays;

import np.com.sajansharma.dashboard.databinding.ActivityEducationBinding;
import np.com.sajansharma.dashboard.databinding.ActivityMainBinding;

public class EducationActivity extends AppCompatActivity {
private ActivityEducationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEducationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        DashboardModel[] dashboard = new DashboardModel[]{
                new DashboardModel("Adobe XD protyping", R.drawable.xd, R.color.bettersweet),
                new DashboardModel("Sketch shortcuts and tricks", R.drawable.ae,R.color.cardview_shadow_start_color),
                new DashboardModel("Androidstudio", R.drawable.androidstudio,R.color.design_default_color_error),
                new DashboardModel("photoshop", R.drawable.photoshop,R.color.design_default_color_secondary_variant),
                new DashboardModel("Quality Assurance", R.drawable.qa,R.color.lightgreen)

        };

        EducationAdapter adapter = new EducationAdapter(Arrays.asList(dashboard));
        binding.xdRv.setHasFixedSize(true);
        binding.xdRv.setAdapter(adapter);
    }
}