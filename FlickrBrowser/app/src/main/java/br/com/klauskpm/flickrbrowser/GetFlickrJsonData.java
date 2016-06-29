package br.com.klauskpm.flickrbrowser;

import android.net.Uri;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klaus.machado on 24/06/2016.
 */
public class GetFlickrJsonData extends GetRawData {

    private String TAG = GetFlickrJsonData.class.getSimpleName();
    private List<Photo> mPhotos;
    private Uri mDestinationUri;

    public GetFlickrJsonData(String searchCriteria, boolean matchAll) {
        super(null);
        createAndUpdateUri(searchCriteria, matchAll);
        mPhotos = new ArrayList<Photo>();
    }

    public void execute() {
        super.setmRawUrl(mDestinationUri.toString());
        DownloadJsonData downloadJsonData = new DownloadJsonData();
        Log.v(TAG, "Built URI = " + mDestinationUri.toString());
        downloadJsonData.execute(mDestinationUri.toString());
    }

    private boolean createAndUpdateUri(String searchCriteria, boolean matchAll) {
        final String FLICKR_API_BASE_URL = "https://api.flickr.com/services/feeds/photos_public.gne";
        final String TAGS_PARAM = "tags";
        final String TAGMODE_PARAM = "tagmode";
        final String FORMAT_PARAM = "format";
        final String NO_JSON_CALLBACK_PARAM = "nojsoncallback";

        mDestinationUri = Uri.parse(FLICKR_API_BASE_URL).buildUpon()
                .appendQueryParameter(TAGS_PARAM, searchCriteria)
                .appendQueryParameter(TAGMODE_PARAM, matchAll ? "all" : "any")
                .appendQueryParameter(FORMAT_PARAM, "json")
                .appendQueryParameter(NO_JSON_CALLBACK_PARAM, "1")
                .build();

        return mDestinationUri != null;
    }

    public List<Photo> getmPhotos() {
        return mPhotos;
    }

    public void processResult() {
        if (getDownloadStatus() != DownloadStatus.OK) {
            Log.e(TAG, "Error downloading raw file");
            return;
        }

        final String FLICKR_ITEMS = "items";
        final String FLICKR_TITLE = "title";
        final String FLICKR_MEDIA = "media";
        final String FLICKR_PHOTO_URL = "m";
        final String FLICKR_AUTHOR = "author";
        final String FLICKR_AUTHOR_ID = "author_id";
        final String FLICKR_LINK = "link";
        final String FLICKR_TAGS = "tags";

        try {
            JSONObject jsonData = new JSONObject(getData());
            JSONArray itemsArray = jsonData.getJSONArray(FLICKR_ITEMS);

            for(int i=0; i<itemsArray.length(); i++) {
                JSONObject jsonPhoto = itemsArray.getJSONObject(i);
                JSONObject jsonMedia = jsonPhoto.getJSONObject(FLICKR_MEDIA);

                Photo photo = new Photo(
                        jsonPhoto.getString(FLICKR_TITLE),
                        jsonPhoto.getString(FLICKR_AUTHOR),
                        jsonPhoto.getString(FLICKR_AUTHOR_ID),
                        jsonPhoto.getString(FLICKR_LINK),
                        jsonPhoto.getString(FLICKR_TAGS),
                        jsonMedia.getString(FLICKR_PHOTO_URL)
                );

                this.mPhotos.add(photo);
            }

            for(Photo singlePhoto: mPhotos) {
                Log.v(TAG, singlePhoto.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.e(TAG, "processResult: ", e);
        }


    }

    public class DownloadJsonData extends DownloadRawData {
        protected void onPostExecute(String webData) {
            super.onPostExecute(webData);
            processResult();
        }

        @Override
        protected String doInBackground(String... params) {
            String[] par = { mDestinationUri.toString() };
            return super.doInBackground(par);
        }
    }
}
