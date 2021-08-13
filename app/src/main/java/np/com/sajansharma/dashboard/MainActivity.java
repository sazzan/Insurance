package np.com.sajansharma.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;

import java.util.Arrays;

import np.com.sajansharma.dashboard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        DashboardModel[] dashboard = new DashboardModel[]{
                new DashboardModel("Two Wheeler Insurance", R.drawable.motorcycle,R.color.bettersweet),
                new DashboardModel("Car Insurance", R.drawable.car,R.color.cardview_shadow_start_color),
                new DashboardModel("Health Insurance", R.drawable.heartbeat,R.color.design_default_color_error),
                new DashboardModel("Travel Insurance", R.drawable.globe,R.color.design_default_color_secondary_variant),
                new DashboardModel("Family Trip Insurance", R.drawable.family_trip,R.color.lightgreen),
                new DashboardModel("Store Insurance", R.drawable.store,R.color.orange),
        };
        AdapterDashboard adapter = new AdapterDashboard(Arrays.asList(dashboard));
        binding.dashboardid.setHasFixedSize(true);
        binding.dashboardid.setAdapter(adapter);
    }
}














   /** private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DashboardModel[] dashboard = new DashboardModel[]{
                new DashboardModel("Two Wheeler Insurance",R.drawable.bycicle),
                new DashboardModel("Car Insurance",R.drawable.car),
                new DashboardModel("Van Insurance", R.drawable.delivery),
                new DashboardModel("Travel Insurance", R.drawable.globe),
                new DashboardModel("Health Insurance", R.drawable.healthcare),

        };
        AdapterDashboard adapter = new AdapterDashboard(Arrays.asList(dashboard));
        binding.dashboardRv.setHasFixedSize(true);
        binding.dashboardRv.setAdapter(adapter);**/
