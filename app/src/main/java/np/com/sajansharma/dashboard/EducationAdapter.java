package np.com.sajansharma.dashboard;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import np.com.sajansharma.dashboard.databinding.ItemStudyBinding;


public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.EducationViewHolder>{

    private List<DashboardModel> education;

    public EducationAdapter(List<DashboardModel> education) {
        this.education = education;
    }

    @NonNull
    @Override
    public EducationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemStudyBinding itemStudyBinding= ItemStudyBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new EducationViewHolder(itemStudyBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull EducationViewHolder holder, int position) {

        holder.setEducation(education.get(position));
    }

    @Override
    public int getItemCount() {
        return education.size();
    }

    class EducationViewHolder extends RecyclerView.ViewHolder{

        ItemStudyBinding binding;

        EducationViewHolder(ItemStudyBinding itemStudyBinding){
            super(itemStudyBinding.getRoot());
            binding=itemStudyBinding;
        }

        void setEducation(DashboardModel education){

            binding.roundimage.setImageResource(education.getImageId());
            binding.title.setText(education.getTitle());
            binding.cardViewColor.setCardBackgroundColor(education.getColor());
        }
    }
}
