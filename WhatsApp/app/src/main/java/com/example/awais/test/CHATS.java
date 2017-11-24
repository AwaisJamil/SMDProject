package com.example.awais.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;



public class CHATS extends Fragment implements ChatAdapter.ViewHolder.ClickListener{
    private RecyclerView mRecyclerView;
    private ChatAdapter mAdapter;
    private TextView tv_selection;

    public CHATS(){
        setHasOptionsMenu(true);
    }
    public void onCreate(Bundle a){
        super.onCreate(a);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null, false);

        getActivity().supportInvalidateOptionsMenu();
        //((MainActivity)getActivity()).changeTitle(R.id.toolbar, "Messages");

        tv_selection = (TextView) view.findViewById(R.id.tv_selection);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new ChatAdapter(getContext(),setData(),this);
        mRecyclerView.setAdapter (mAdapter);

        return view;
    }
    public List<Chat> setData(){
        List<Chat> data = new ArrayList<>();
        String name[]= {"Laura Owens", "Angela Price", "Donald Turner", "Kelly", "Julia Harris", "Laura Owens", "Angela Price", "Donald Turner", "Kelly", "Julia Harris" };
        String lastchat[]= {"Hi This is Fast", "Let the game begin", "Is this SMD Project?", "Ow this awesome", "Ragra Days?", "Alpha,Beta,Gemma", "How are you?", "Ow this awesome", "Pindi Boys?", "I  need your helf" };
        @DrawableRes int img[]= {R.drawable.userpic , R.drawable.user1, R.drawable.user2, R.drawable.user3, R.drawable.user4 , R.drawable.userpic , R.drawable.user1, R.drawable.user2, R.drawable.user3, R.drawable.user4 };
        boolean online[] = {true, false, true, false, true, true, true, false, false, true};

        for (int i = 0; i<10; i++){
            Chat chat = new Chat();
            chat.setmTime("5:04pm");
            chat.setName(name[i]);
            chat.setImage(img[i]);
            chat.setOnline(online[i]);
            chat.setLastChat(lastchat[i]);
            data.add(chat);
        }
        return data;
    }

    @Override
    public void onItemClicked (int position) {

//        Intent intent = new Intent("com.example.awais.test.updateProfileF");
//        startActivity(intent);

       // startActivity(new Intent(getActivity(), Conversation.class));

        try{
            startActivity(new Intent(getActivity(), Conversation.class));
        }
        catch (Exception e){
            //Toast.makeText(CHATS.this,"Exception in intent",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onItemLongClicked (int position) {
        toggleSelection(position);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    private void toggleSelection(int position) {
        mAdapter.toggleSelection (position);
        if (mAdapter.getSelectedItemCount()>0){
            tv_selection.setVisibility(View.VISIBLE);
        }else
            tv_selection.setVisibility(View.GONE);


        getActivity().runOnUiThread(new Runnable() {
            public void run()
            {
                tv_selection.setText("Delete ("+mAdapter.getSelectedItemCount()+")");
            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.nav_settings:
                Intent intent = new Intent("com.example.awais.test.setting");
                startActivity(intent);
                return true;
            case R.id.nav_logout:
                Toast.makeText(getContext(),"Logout",Toast.LENGTH_SHORT).show();
                //finishAffinity();
                return true;
             default:
                return super.onOptionsItemSelected(item);

        }

    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_edit, menu);
    }
}
