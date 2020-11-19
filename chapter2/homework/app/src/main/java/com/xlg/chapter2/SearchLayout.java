package com.xlg.chapter2;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SearchLayout extends FrameLayout {
    private OnInputChangedListener onInputChangedListener;
    public SearchLayout(@NonNull Context context) {
        super(context);
        init();
    }

    public SearchLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SearchLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init(){
        inflate(getContext(),R.layout.search_layout,this);
        EditText input=findViewById(R.id.input);
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(onInputChangedListener!=null){
                    onInputChangedListener.onChanged(s.toString());
                }
            }
        });
    }
    public void setOnInputChangedListener(OnInputChangedListener Listener){
        this.onInputChangedListener=Listener;
    }
    public static interface OnInputChangedListener{
        void onChanged(String text);
    }
}
