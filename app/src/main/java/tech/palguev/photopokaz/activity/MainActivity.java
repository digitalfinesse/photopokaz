package tech.palguev.photopokaz.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import tech.palguev.photopokaz.R;
import tech.palguev.photopokaz.adapter.GalleryAdapter;
import tech.palguev.photopokaz.app.AppController;
import tech.palguev.photopokaz.model.Image;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private static final String endpoint = "http://evk-turizm.ru/1.json";
    private ArrayList<Image> images;
    private ProgressDialog progressDialog;
    private GalleryAdapter mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate!");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        progressDialog = new ProgressDialog(this);
        images = new ArrayList<Image>();
        mAdapter = new GalleryAdapter(getApplicationContext(), images);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new GalleryAdapter.RecyclerTouchListener(
                getApplicationContext(),
                recyclerView,
                new GalleryAdapter.ClickListener() {
                    @Override
                    public void onClick(View view, int position) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("images", images);
                        bundle.putInt("position", position);

                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        SlideshowDialogFragment newFragment = SlideshowDialogFragment.newInstance();
                        newFragment.setArguments(bundle);
                        newFragment.show(ft, "slideshow");
                    }
                    @Override
                    public void onLongClick(View view, int position) { }
                }));
        loadImages();
    }

    private void loadImages() {
        progressDialog.setMessage("Загружаю картинки");
        progressDialog.show();

        JsonArrayRequest request = new JsonArrayRequest(endpoint,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        progressDialog.dismiss();
                        images.clear();
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject object = response.getJSONObject(i);

                                Image image = new Image();
                                image.setLargeImageURL(object.getString("largeImageURL"));
                                image.setWebformatHeight(object.getString("webformatHeight"));
                                image.setWebformatWidth(object.getString("webformatWidth"));
                                image.setLikes(object.getString("likes"));
                                image.setImageWidth(object.getString("imageWidth"));
                                image.setId(object.getString("id"));
                                image.setUser_id(object.getString("user_id"));
                                image.setViews(object.getString("views"));
                                image.setComments(object.getString("comments"));
                                image.setPageURL(object.getString("pageURL"));
                                image.setImageHeight(object.getString("imageHeight"));
                                image.setWebformatURL(object.getString("webformatURL"));
                                image.setType(object.getString("type"));
                                image.setPreviewHeight(object.getString("previewHeight"));
                                image.setTags(object.getString("tags"));
                                image.setDownloads(object.getString("downloads"));
                                image.setUser(object.getString("user"));
                                image.setFavorites(object.getString("favorites"));
                                image.setImageSize(object.getString("imageSize"));
                                image.setPreviewWidth(object.getString("previewWidth"));
                                image.setUserImageURL(object.getString("userImageURL"));
                                image.setPreviewURL(object.getString("previewURL"));

                                images.add(image);
                            } catch (JSONException e) {
                                Log.e(TAG, "Json parsing error: " + e.getMessage());
                            }
                        }
                        mAdapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Error Volley: " + error.getMessage());
                progressDialog.dismiss();
            }
        });

        AppController.getInstance().addToRequestQueue(request);
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy!");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause!");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart!");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume!");
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart!");
    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop!");
    }

    @Override
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Log.d(TAG, "onRestoreInstanceState!!!");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState!!!");
    }
}
