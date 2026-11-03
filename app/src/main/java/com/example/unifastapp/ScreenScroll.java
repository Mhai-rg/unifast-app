package com.example.unifastapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

public final class ScreenScroll {
    private ScreenScroll() {}

    public static void enable(Activity activity, int rootId) {
        View root = activity.findViewById(rootId);
        if (root == null) return;

        // The XML layouts already use ScrollView. Do not wrap them a second time,
        // because doing so discards the original ScrollView background and settings.
        if (root.getParent() instanceof ScrollView) return;

        if (!(root.getParent() instanceof ViewGroup)) return;

        ViewGroup parent = (ViewGroup) root.getParent();
        android.graphics.drawable.Drawable originalBackground = parent.getBackground();
        parent.removeView(root);

        ScrollView scrollView = new ScrollView(activity);
        scrollView.setFillViewport(true);
        scrollView.setClipToPadding(false);
        if (originalBackground != null) scrollView.setBackground(originalBackground);
        root.setLayoutParams(new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        scrollView.addView(root);
        activity.setContentView(scrollView);
    }
}
