package com.ladoo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.facebook.share.ShareApi;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;
import com.facebook.share.widget.ShareDialog;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class FacebookFragment extends Fragment {
    private CallbackManager callbackManager;
    ProfilePictureView profilePictureView;
    LoginButton loginButton;
    TextView FacebookWelcomeText;
    ShareDialog shareDialog;
    Button FacebookPostButton;
private FacebookCallback<Sharer.Result> ShareCallback = new FacebookCallback<Sharer.Result>()
    {

    @Override
    public void onSuccess(Sharer.Result result) {


    }

    @Override
    public void onCancel() {

    }

    @Override
    public void onError(FacebookException error) {

    }
};
    public FacebookFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
        callbackManager=CallbackManager.Factory.create();



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_facebook,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loginButton=(LoginButton)view.findViewById(R.id.FacebookLoginButton);
        FacebookWelcomeText=(TextView)view.findViewById(R.id.FacebookWelcomText);
        profilePictureView=(ProfilePictureView)view.findViewById(R.id.FaceBookProfilePicture);
        FacebookPostButton=(Button)view.findViewById(R.id.FaceBookPostButton);
        loginButton.setReadPermissions("user_friends");
        loginButton.setFragment(this);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                FacebookPostButton.setVisibility(View.VISIBLE);
                AccessToken loginAccessToken = loginResult.getAccessToken();

                Profile profile = Profile.getCurrentProfile();

                UpdateProfileInformation(profile);

            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

        shareDialog = new ShareDialog(this);
        shareDialog.registerCallback(callbackManager, ShareCallback);
        FacebookPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postStatusUpdate();

            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();

        Profile profile=Profile.getCurrentProfile();
        UpdateProfileInformation(profile);
    }

    public void UpdateProfileInformation(Profile profile) {
        if (profile != null) {

            profilePictureView.setProfileId(profile.getId());
            FacebookWelcomeText.setText("Welcome " + profile.getName());
        }


    }
    private void postStatusUpdate() {
        ShareLinkContent linkContent = new ShareLinkContent.Builder()
                .setContentTitle("KLECET Media")
                .setContentDescription(
                        "Share our Facebook page")
                .setContentUrl(Uri.parse("https://www.facebook.com/klescetmedia/?fref=ts"))
                .build();
            shareDialog.show(linkContent);
        ShareApi.share(linkContent, ShareCallback);

    }

}
