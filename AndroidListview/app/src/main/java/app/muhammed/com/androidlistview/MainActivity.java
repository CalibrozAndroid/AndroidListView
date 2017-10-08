package app.muhammed.com.androidlistview;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

import app.muhammed.com.androidlistview.model.ContactModel;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListViewCompat mContactListViewCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUI();


    }

    private void setUI() {


        mContactListViewCompat = (ListViewCompat) findViewById(R.id.contactListView);
        mContactListViewCompat.setDivider(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        mContactListViewCompat.setDividerHeight(1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, getContactString());


        mContactListViewCompat.setAdapter(arrayAdapter);


        mContactListViewCompat.setOnItemClickListener(this);


    }


    public ArrayList<ContactModel> getContact() {
        ArrayList<ContactModel> contactModels = new ArrayList<>();


        // Contact one

        ContactModel contactModelOne = new ContactModel();
        contactModelOne.setName("Muhammed");
        contactModelOne.setPhone("8086461927");


        // Contact two
        ContactModel contactModelTwo = new ContactModel();
        contactModelTwo.setName("Muhammed");
        contactModelTwo.setPhone("8086461927");


        // Contact three
        ContactModel contactModelThree = new ContactModel();
        contactModelThree.setName("Muhammed");
        contactModelThree.setPhone("8086461927");

        contactModels.add(contactModelOne);
        contactModels.add(contactModelTwo);
        contactModels.add(contactModelThree);


        return contactModels;
    }


    public ArrayList<String> getContactString() {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Thasneem");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");
        strings.add("Muhammed");

        return strings;

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String itemAtPosition = (String) adapterView.getItemAtPosition(i);

        Toast.makeText(this, itemAtPosition + " pos : " + i, Toast.LENGTH_SHORT).show();


    }
}
