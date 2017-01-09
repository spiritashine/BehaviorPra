package com.hujie.behaviorpra;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;

/**
 * Created by hujie on 2017/1/9.
 */

public class BottomDialog extends BottomSheetDialog {
    public BottomDialog(@NonNull Context context) {
        super(context);
    }

    public BottomDialog(@NonNull Context context, @StyleRes int theme) {
        super(context, theme);
    }

    protected BottomDialog(@NonNull Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


}
