package com.example.chandan.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class playedmatches extends AppCompatActivity {
DatabaseReference data;
int check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playedmatches);
        Intent i =getIntent();
        String bundle=i.getStringExtra("team");
        data= FirebaseDatabase.getInstance().getReference(bundle);
        check=1;

            if(data.getKey().toString().equals(bundle))
            {
                data.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (check == 1) {
                            if(dataSnapshot.child("playedmatches").exists()) {
                                for (DataSnapshot dataSnapshot1:dataSnapshot.child("playedmatches").getChildren())
                                {

                                }
                            }
                        }

                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }


    }
}
