package com.green_station_20.problem3.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.green_station_20.problem3.Adapter.RecyclerViewAdapter;
import com.green_station_20.problem3.Model.Medicine;
import com.green_station_20.problem3.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private String URL_JSON = "https://alhasan.dev/interns/services/medicine-list.php";
    private JsonArrayRequest jsonArrayRequest;
    RecyclerViewAdapter recyclerViewAdapter;
    private RequestQueue requestQueue;
    private List<Medicine> medicineList = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        setUpRecyclerView();
        JsonRequest();

    }

    private void JsonRequest() {

        String URL_JSON = "https://alhasan.dev/interns/services/medicine-list.php";
        requestQueue = Volley.newRequestQueue(MainActivity.this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, URL_JSON, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                //  Log.d("TAG", "onResponse: " + response);

                try {
                    JSONArray medicines = response.getJSONArray("medicines");

                    for (int i = 0; i < medicines.length(); i++) {
                        JSONObject medicine = medicines.getJSONObject(i);

                        Medicine m = new Medicine();
                        m.setDrugs(medicine.getString("drugs"));
                        m.setIndications(medicine.getString("indications"));
                        m.setTherapeutic_class(medicine.getString("therapeutic_class"));
                        m.setPharmacology(medicine.getString("pharmacology"));
                        m.setDosage(medicine.getString("dosage"));
                        m.setInteraction(medicine.getString("interaction"));
                        m.setContraindications(medicine.getString("contraindications"));
                        m.setSide_effects(medicine.getString("side_effects"));
                        m.setPregnancy(medicine.getString("pregnancy"));
                        m.setPrecautions(medicine.getString("precautions"));
                        m.setStorage(medicine.getString("storage"));


                  //      Log.d("TAG", "onResponse: " + medicine.getString("drugs"));

                        medicineList.add(m);
                    }
                    recyclerViewAdapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("TAG", "onErrorResponse: " + error.getMessage());
            }
        });

        requestQueue.add(jsonObjectRequest);
    }


    private void setUpRecyclerView() {

        recyclerViewAdapter = new RecyclerViewAdapter(this, medicineList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}