// Generated by view binder compiler. Do not edit!
package com.example.myhomeapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myhomeapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView agentIcon;

  @NonNull
  public final ImageView apartmentIcon;

  @NonNull
  public final ImageView exitIcon;

  @NonNull
  public final ImageView homeIcon;

  @NonNull
  public final ImageView houseIcon;

  @NonNull
  public final TextView mtvAgent;

  @NonNull
  public final TextView mtvApartment;

  @NonNull
  public final TextView mtvExit;

  @NonNull
  public final TextView mtvHome;

  @NonNull
  public final TextView mtvHouses;

  @NonNull
  public final TextView mtvOwners;

  @NonNull
  public final TextView mtvTitle;

  @NonNull
  public final ImageView ownersIcon;

  private ContentMainBinding(@NonNull RelativeLayout rootView, @NonNull ImageView agentIcon,
      @NonNull ImageView apartmentIcon, @NonNull ImageView exitIcon, @NonNull ImageView homeIcon,
      @NonNull ImageView houseIcon, @NonNull TextView mtvAgent, @NonNull TextView mtvApartment,
      @NonNull TextView mtvExit, @NonNull TextView mtvHome, @NonNull TextView mtvHouses,
      @NonNull TextView mtvOwners, @NonNull TextView mtvTitle, @NonNull ImageView ownersIcon) {
    this.rootView = rootView;
    this.agentIcon = agentIcon;
    this.apartmentIcon = apartmentIcon;
    this.exitIcon = exitIcon;
    this.homeIcon = homeIcon;
    this.houseIcon = houseIcon;
    this.mtvAgent = mtvAgent;
    this.mtvApartment = mtvApartment;
    this.mtvExit = mtvExit;
    this.mtvHome = mtvHome;
    this.mtvHouses = mtvHouses;
    this.mtvOwners = mtvOwners;
    this.mtvTitle = mtvTitle;
    this.ownersIcon = ownersIcon;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.agent_icon;
      ImageView agentIcon = ViewBindings.findChildViewById(rootView, id);
      if (agentIcon == null) {
        break missingId;
      }

      id = R.id.apartment_icon;
      ImageView apartmentIcon = ViewBindings.findChildViewById(rootView, id);
      if (apartmentIcon == null) {
        break missingId;
      }

      id = R.id.exit_icon;
      ImageView exitIcon = ViewBindings.findChildViewById(rootView, id);
      if (exitIcon == null) {
        break missingId;
      }

      id = R.id.home_icon;
      ImageView homeIcon = ViewBindings.findChildViewById(rootView, id);
      if (homeIcon == null) {
        break missingId;
      }

      id = R.id.house_icon;
      ImageView houseIcon = ViewBindings.findChildViewById(rootView, id);
      if (houseIcon == null) {
        break missingId;
      }

      id = R.id.mtvAgent;
      TextView mtvAgent = ViewBindings.findChildViewById(rootView, id);
      if (mtvAgent == null) {
        break missingId;
      }

      id = R.id.mtvApartment;
      TextView mtvApartment = ViewBindings.findChildViewById(rootView, id);
      if (mtvApartment == null) {
        break missingId;
      }

      id = R.id.mtvExit;
      TextView mtvExit = ViewBindings.findChildViewById(rootView, id);
      if (mtvExit == null) {
        break missingId;
      }

      id = R.id.mtvHome;
      TextView mtvHome = ViewBindings.findChildViewById(rootView, id);
      if (mtvHome == null) {
        break missingId;
      }

      id = R.id.mtvHouses;
      TextView mtvHouses = ViewBindings.findChildViewById(rootView, id);
      if (mtvHouses == null) {
        break missingId;
      }

      id = R.id.mtvOwners;
      TextView mtvOwners = ViewBindings.findChildViewById(rootView, id);
      if (mtvOwners == null) {
        break missingId;
      }

      id = R.id.mtvTitle;
      TextView mtvTitle = ViewBindings.findChildViewById(rootView, id);
      if (mtvTitle == null) {
        break missingId;
      }

      id = R.id.owners_icon;
      ImageView ownersIcon = ViewBindings.findChildViewById(rootView, id);
      if (ownersIcon == null) {
        break missingId;
      }

      return new ContentMainBinding((RelativeLayout) rootView, agentIcon, apartmentIcon, exitIcon,
          homeIcon, houseIcon, mtvAgent, mtvApartment, mtvExit, mtvHome, mtvHouses, mtvOwners,
          mtvTitle, ownersIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
