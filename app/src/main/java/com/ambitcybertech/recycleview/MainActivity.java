package com.ambitcybertech.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.ambitcybertech.recycleview.Contact;
import com.ambitcybertech.recycleview.ContactAdapter;
import com.ambitcybertech.recycleview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvContacts;
    ArrayList<Contact> contactArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvContacts=(RecyclerView) findViewById(R.id.rvContacts);
        contactArrayList=new ArrayList<Contact>();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        savedDataItems();
        ContactAdapter adapter=new ContactAdapter(MainActivity.this,contactArrayList);
        rvContacts.setLayoutManager(linearLayoutManager);
        rvContacts.setHasFixedSize(true);

        rvContacts.setAdapter(adapter);

    }

    private void savedDataItems()
    {
        Contact contact=new Contact();
        contact.setName("srinath");
        contact.setEmailid("abc@gmail.com");
        contact.setAddress("H.n0:4455-565,gdk");
        contact.setPhonenumber("+91-99999999");
        contactArrayList.add(contact);

         contact=new Contact();
        contact.setName("srinath");
        contact.setEmailid("abc@gmail.com");
        contact.setAddress("H.n0:4455-565,gdk");
        contact.setPhonenumber("+91-99999999");
        contactArrayList.add(contact);

        contact=new Contact();
        contact.setName("sai");
        contact.setEmailid("abc@gmail.com");
        contact.setAddress("H.n0:4455-565,gdk");
        contact.setPhonenumber("+91-99999999");
        contactArrayList.add(contact);

        contact=new Contact();
        contact.setName("krish");
        contact.setEmailid("abc@gmail.com");
        contact.setAddress("H.n0:4455-565,gdk");
        contact.setPhonenumber("+91-99999999");
        contactArrayList.add(contact);

        contact=new Contact();
        contact.setName("srav");
        contact.setEmailid("abc@gmail.com");
        contact.setAddress("H.n0:4455-565,gdk");
        contact.setPhonenumber("+91-99999999");
        contactArrayList.add(contact);




    }
}
