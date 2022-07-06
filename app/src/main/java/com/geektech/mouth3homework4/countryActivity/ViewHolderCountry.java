package com.geektech.mouth3homework4.countryActivity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.mouth3homework4.R;
import com.geektech.mouth3homework4.countryActivity.Country;

public class ViewHolderCountry extends RecyclerView.ViewHolder {

    private ImageView imageCountry;
    private TextView tvCountry, tvCapital;

    public ViewHolderCountry(@NonNull View itemView) {
        super(itemView);
        imageCountry = itemView.findViewById(R.id.imageViewCountry);
        tvCountry = itemView.findViewById(R.id.textViewCountry);
        tvCapital = itemView.findViewById(R.id.textViewCapital);
    }

    public void onBind(Country country, Context context) {
        Glide.with(context).load(country.getImageCountry()).into(imageCountry);
        tvCountry.setText(country.getTvCountry());
        tvCapital.setText(country.getTvCapital());
    }
}
