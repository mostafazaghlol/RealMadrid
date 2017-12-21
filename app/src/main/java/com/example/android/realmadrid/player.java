package com.example.android.realmadrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Toast.makeText(this, "Click to get more information", Toast.LENGTH_SHORT).show();
          /*
                    -add the data of the players
                    -link is http://www.realmadrid.com/en/football/squad
                     public PlayerObject(name,position,number,Image,Age,PlaceOfBirth,weight,height)
        */
        final ArrayList<PlayerObject> players=new ArrayList<>();
        players.add(new PlayerObject("Keylor Navas","Goalkeeper",1,R.drawable.keylor,"15/12/1986","San Isidro (Costa Rica)",78.0,1.85));
        players.add(new PlayerObject("K. Casilla","Goalkeeper",13,R.drawable.casilla,"02/10/1986","Alcover (Tarragona)",84.0,1.91));
        players.add(new PlayerObject("Luca","Goalkeeper",30,R.drawable.luca_zidane,"13/05/1998","Marseille (France)",75.8,1.82));
        players.add(new PlayerObject("Carvajal","Defender",2,R.drawable.carvajal,"11/01/1992","Leganés (Madrid)",73,1.73));
        players.add(new PlayerObject("Vallejo","Defender",3,R.drawable.vallejo,"05/01/1997","Zaragoza",0.0,1.83));
        players.add(new PlayerObject("Sergio Ramos","Defender",4,R.drawable.ramos,"30/03/1986","Camas (Sevilla, Spain)",75,1.83));
        players.add(new PlayerObject("Varane","Defender",5,R.drawable.varane,"25/04/1993","Lille (France)",78,1.91));
        players.add(new PlayerObject("Nacho","Defender",6,R.drawable.nacho,"18/01/1990","Madrid",75,1.79));
        players.add(new PlayerObject("Marcelo","Defender",12,R.drawable.marcelo,"12/05/1988","Río de Janeiro (Brazil)",75,1.74));
        players.add(new PlayerObject("Theo","Defender",15,R.drawable.theo,"06/10/1997","Marseille (France)",0.0,1.84));
        players.add(new PlayerObject("Achraf","Defender",19,R.drawable.achraf_hakimi,"04/11/1998","Madrid",68.2,1.79));
        players.add(new PlayerObject("Kroos","Midfielder",8,R.drawable.kroos,"04/01/1990","Greifswald (Germany)",78,1.82));
        players.add(new PlayerObject("Modric","Midfielder",10,R.drawable.modric,"09/09/1985","Zadar (Croatia)",65,1.74));
        players.add(new PlayerObject("Casemiro","Midfielder",14,R.drawable.casemiro,"23/02/1992","Sao Paulo (Brazil)",80,1.84));
        players.add(new PlayerObject("M. Llorente","Midfielder",18,R.drawable.llorente,"30/01/1995","Madrid",0.0,1.82));
        players.add(new PlayerObject("Asensio","Midfielder",20,R.drawable.asensio,"21/01/1996","Palma de Mallorca",75,1.80));
        players.add(new PlayerObject("Isco","Midfielder",22,R.drawable.isco,"21/04/1992","Benalmádena (Málaga, Spain)",74,1.76));
        players.add(new PlayerObject("Kovacic","Midfielder",23,R.drawable.kovacic,"06/05/1994","Linz(Austria)",77,1.78));
        players.add(new PlayerObject("D. Ceballos","Midfielder",24,R.drawable.ceballos_ficha,"07/08/1996","Utrera(Sevilla)",0.0,1.76));
        players.add(new PlayerObject("Ronaldo","Forward",7,R.drawable.ronaldo,"05/02/1985","Funchal(Portugal)",80,1.85));
        players.add(new PlayerObject("Benzema","Forward",9,R.drawable.benzema,"19/12/1987","Lyon(France)",79,1.87));
        players.add(new PlayerObject("Bale","Forward",11,R.drawable.bale,"16/07/1989","Cardiff (Wales)",74,1.83));
        players.add(new PlayerObject("Lucas Vázquez","Forward",17,R.drawable.lucas,"01/07/1991","Curtis (A Coruña)",70,1.73));
        players.add(new PlayerObject("B. Mayoral","Forward",21,R.drawable.mayoral,"05/04/1997","Parla (Madrid)",68,1.81));


        playerArrayAdapter playerAdapter=new playerArrayAdapter(this,players);

        ListView list=(ListView)findViewById(R.id.list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i1=new Intent(player.this,playerdate.class);
                i1.putExtra("positon",players.get(position).getmImage());
                i1.putExtra("name",players.get(position).getmName());
                i1.putExtra("age",players.get(position).getmAge());
                i1.putExtra("placeOfBirth",players.get(position).getmPlaceOfBirth());
                i1.putExtra("weight",players.get(position).getmWeight());
                i1.putExtra("height",players.get(position).getmHeight());
                startActivity(i1);
            }
        });

        list.setAdapter(playerAdapter);



    }
}
