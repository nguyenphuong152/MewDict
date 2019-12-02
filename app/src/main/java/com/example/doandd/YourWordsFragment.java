package com.example.doandd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class YourWordsFragment extends Fragment {

    private FragmentListener listener;

    public YourWordsFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_your_words, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setHasOptionsMenu(true);

        ListView yourwordsList =  (ListView) view.findViewById(R.id.yourwordsList);
        final YourWordsAdapter adapter = new YourWordsAdapter(getActivity(),getListOfWords());
        yourwordsList.setAdapter(adapter);

        adapter.setOnItemClick(new ListItemListener() {
            @Override
            public void onItemClick(int position) {
                if(listener!=null)
                   listener.onItemClick(String.valueOf(adapter.getItem(position)));
            }
        });

        adapter.setOnItemDeleteClick(new ListItemListener() {
            @Override
            public void onItemClick(int position) {
                adapter.removeItem(position);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void setOnFragmentListener(FragmentListener listener){
        this.listener = listener;
    }

    String[] getListOfWords() {
        String[] source = new String[]{
                "a","b","c","d","e","f","g"
                ,"h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
        };
        return source;
    }


    //@Override
//    public void onCreateOptionsMenu( Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.menu_clear,menu);
//    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_clear,menu);
    }
}

