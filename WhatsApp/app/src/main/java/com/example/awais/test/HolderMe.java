package com.example.awais.test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

//import com.uiresource.messenger.R;


public class HolderMe extends RecyclerView.ViewHolder {

    private TextView time, chatText;

    public HolderMe(View v) {
        super(v);
        time = (TextView) v.findViewById(R.id.tv_time);
        chatText = (TextView) v.findViewById(R.id.tv_chat_text);
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }

    public TextView getChatText() {
        return chatText;
    }

    public void setChatText(TextView chatText) {
        this.chatText = chatText;
    }
}
