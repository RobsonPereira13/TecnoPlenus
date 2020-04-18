package com.robsonpereira.empresa.ui.principal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robsonpereira.empresa.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {


    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "A Tecno Plenus tem como missão apoiar organizações " +
                "que desejam alcançar o sucesso atráves da excelência em gestão e " +
                "da busca pela qualidade.";
        Element versao = new Element();
        versao.setTitle( "Versão 1.0" );

        return new AboutPage( getActivity() )
                .setDescription( descricao )
                .addWebsite("https://www.google.com/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("Robson Oliveira", "Facebook")
                .addInstagram("tecnoplenus", "Instagram")
                .addGitHub("RobsonPereira13", "GitHub")
                .addPlayStore("com.facebook.katana", "Download App")

                .addItem( versao )

                .create();
        //return inflater.inflate(R.layout.fragment_principal, container, false);
    }

}
