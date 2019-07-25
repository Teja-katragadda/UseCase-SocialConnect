package com.example.socialconnect;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialconnect.databinding.GoogleduoBinding;
import com.example.socialconnect.databinding.ViberBinding;
import com.example.socialconnect.databinding.WhatsappBinding;

import java.util.List;

public class SocialConnectRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<SocialConnectItemViewModel> socialConnectItemViewModelList;

    public SocialConnectRecyclerViewAdapter(List<SocialConnectItemViewModel> socialConnectItemViewModelList) {
        this.socialConnectItemViewModelList = socialConnectItemViewModelList;

    }public int getItemViewType(int position){
        return socialConnectItemViewModelList.get(position).getContactType();

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        switch (i)
        {
            case 0:
                LayoutInflater viberInflate =  LayoutInflater.from(viewGroup.getContext());
                ViberBinding viberBinding = DataBindingUtil.inflate(viberInflate,R.layout.viber,viewGroup,false);
                return new ViberViewHolder(viberBinding);

            case 1:
                LayoutInflater whatsappInflate =  LayoutInflater.from(viewGroup.getContext());
                WhatsappBinding whatsappBinding  = WhatsappBinding.inflate(whatsappInflate,viewGroup,false);
                return new WhatsappViewHolder(whatsappBinding);

            case 2:
                LayoutInflater googleDuo =  LayoutInflater.from(viewGroup.getContext());
                GoogleduoBinding googleduoBinding = GoogleduoBinding.inflate(googleDuo,viewGroup,false);
                return new GoogleDuoViewHolder(googleduoBinding);

        }
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        switch (viewHolder.getItemViewType()){

            case 0:
                ViberViewHolder viberViewHolder = (ViberViewHolder)viewHolder;
                SocialConnectItemViewModel socialConnectItemViewModel1 = socialConnectItemViewModelList.get(i);
                viberViewHolder.bind(socialConnectItemViewModel1);
                break;

            case 1:
                WhatsappViewHolder whatsappViewHolder = (WhatsappViewHolder)viewHolder;
                SocialConnectItemViewModel socialConnectItemViewModel2 = socialConnectItemViewModelList.get(i);
                whatsappViewHolder.bind(socialConnectItemViewModel2);
                break;

            case 2:
                GoogleDuoViewHolder googleDuoViewHolder = (GoogleDuoViewHolder)viewHolder;
                SocialConnectItemViewModel socialConnectItemViewModel3 = socialConnectItemViewModelList.get(i);
                googleDuoViewHolder.bind(socialConnectItemViewModel3);
                break;


        }

    }

    @Override
    public int getItemCount() {
        return socialConnectItemViewModelList.size();
    }

    public class ViberViewHolder extends RecyclerView.ViewHolder {
        private ViberBinding viberBinding;

        public ViberViewHolder(ViberBinding viberBinding) {
            super(viberBinding.getRoot());
            this.viberBinding = viberBinding;
        }

        public void bind(SocialConnectItemViewModel socialConnectItemViewModel1) {
            viberBinding.setItemViewModel(socialConnectItemViewModel1);
            viberBinding.executePendingBindings();
        }
    }

    public class WhatsappViewHolder extends RecyclerView.ViewHolder {
        private WhatsappBinding whatsappBinding;

        public WhatsappViewHolder(WhatsappBinding whatsappBinding) {
            super(whatsappBinding.getRoot());
            this.whatsappBinding = whatsappBinding;
        }

        public void bind(SocialConnectItemViewModel socialConnectItemViewModel2) {
            whatsappBinding.setItemViewModel(socialConnectItemViewModel2);
            whatsappBinding.executePendingBindings();
        }
    }

    public class GoogleDuoViewHolder extends RecyclerView.ViewHolder {
        private GoogleduoBinding googleduoBinding;

        public GoogleDuoViewHolder(GoogleduoBinding googleduoBinding) {
            super(googleduoBinding.getRoot());
            this.googleduoBinding = googleduoBinding;
        }


        public void bind(SocialConnectItemViewModel socialConnectItemViewModel3) {
            googleduoBinding.setItemViewModel(socialConnectItemViewModel3);
            googleduoBinding.executePendingBindings();
        }
    }
}
