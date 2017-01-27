package com.ambitcybertech.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by srinath on 1/27/2017.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder>
{

    Context mCxt;
    ArrayList<Contact> contactArrayList;
    public ContactAdapter(Context mContext, ArrayList<Contact> contactArrayList) {

        this.mCxt=mContext;
        this.contactArrayList=contactArrayList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(mCxt).inflate(R.layout.contact_row,parent,false);
        MyViewHolder myViewHolder =new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        holder.tvContactName.setText(contactArrayList.get(position).getName());
        holder.tvContactEmail.setText(contactArrayList.get(position).getEmailid());
        holder.tvContactAddress.setText(contactArrayList.get(position).getAddress());



    }

    @Override
    public int getItemCount() {
        return contactArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvContactName,tvContactEmail,tvContactAddress,tvContactPhone;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvContactName = (TextView) itemView.findViewById(R.id.tvContactName);
            tvContactEmail = (TextView) itemView.findViewById(R.id.tvContactEmail);
            tvContactAddress = (TextView) itemView.findViewById(R.id.tvContactAddress);
            tvContactPhone = (TextView) itemView.findViewById(R.id.tvContactPhone);
        }
    }

}