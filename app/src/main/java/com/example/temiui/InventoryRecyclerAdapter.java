package com.example.temiui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InventoryRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecyclerItem;

    public InventoryRecyclerAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {


        private TextView name;
        private TextView shape;
        private TextView color;
        private TextView size;
        private TextView weight;
        private TextView generalizedName;
        private TextView brand;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            shape = (TextView) itemView.findViewById(R.id.shape);
            color = (TextView) itemView.findViewById(R.id.color);
            size = (TextView) itemView.findViewById(R.id.size);
            weight = (TextView) itemView.findViewById(R.id.weight);
            generalizedName = (TextView) itemView.findViewById(R.id.generalizedName);
            brand = (TextView) itemView.findViewById(R.id.brand);

        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:

            default:

                View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.inventory_list_items, viewGroup, false);

                return new ItemViewHolder((layoutView));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        int viewType = getItemViewType(i);

        switch (viewType) {
            case TYPE:
            default:

                ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                Inventory inventory = (Inventory) listRecyclerItem.get(i);

                itemViewHolder.name.setText(inventory.getName());
                itemViewHolder.shape.setText(inventory.getShape());
                itemViewHolder.brand.setText(inventory.getBrand());
                itemViewHolder.size.setText(inventory.getSize());
                itemViewHolder.weight.setText(inventory.getWeight());
                itemViewHolder.generalizedName.setText(inventory.getGeneralizedName());
                itemViewHolder.color.setText(inventory.getColor());
        }

    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}