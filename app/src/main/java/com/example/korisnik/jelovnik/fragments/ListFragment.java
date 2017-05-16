package com.example.korisnik.jelovnik.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.korisnik.jelovnik.R;
import com.example.korisnik.jelovnik.provider.JeloProvider;

import java.util.List;

/**
 * Created by Korisnik on 16.5.2017..
 */

public class ListFragment extends Fragment {

    OnItemSelectedListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(), "ListFragment.onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toast.makeText(getActivity(), "ListFragment.onActivityCreated()", Toast.LENGTH_SHORT).show();

        final List<String> jeloNaziv = JeloProvider.getJeloNaziv();

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, jeloNaziv);
        ListView listView = (ListView) getActivity().findViewById(R.id.listofJelo);

        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onItemSelected(position);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "ListFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        if (container == null) {
            return null;
        }

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Toast.makeText(getActivity(), "ListFragment.onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        Toast.makeText(getActivity(), "ListFragment.onAttach()", Toast.LENGTH_SHORT).show();

        try {
            listener = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    public interface OnItemSelectedListener {

        public void onItemSelected(int position);
    }
}
