package com.example.socialconnect;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialconnect.databinding.ItemActivityBinding;

import java.util.List;

public class SocialConnectRecyclerViewAdapter extends RecyclerView.Adapter<SocialConnectRecyclerViewAdapter.ViewHolder> {

    private List<SocialConnectItemViewModel> socialConnectItemViewModelList;

    public SocialConnectRecyclerViewAdapter(List<SocialConnectItemViewModel> socialConnectItemViewModelList) {
        this.socialConnectItemViewModelList = socialConnectItemViewModelList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        ItemActivityBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_activity, viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        SocialConnectItemViewModel socialConnectItemViewModel = new SocialConnectItemViewModel();
        viewHolder.binding(socialConnectItemViewModel);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemActivityBinding binding;

        public ViewHolder(ItemActivityBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void binding(SocialConnectItemViewModel socialConnectItemViewModel) {
            binding.setItemModel(socialConnectItemViewModel);
            binding.executePendingBindings();
        }
    }
}
