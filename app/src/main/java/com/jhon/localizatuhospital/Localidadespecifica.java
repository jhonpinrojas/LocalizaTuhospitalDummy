package com.jhon.localizatuhospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.jhon.localizatuhospital.R;

import java.util.ArrayList;

public class Localidadespecifica extends AppCompatActivity {
    private TextView tv1;
    private  ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localidadespecifica);
        Bundle extras = getIntent().getExtras();
        String local = extras.getString("localidad");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_foreground);
        tv1 = findViewById(R.id.textView);
        lv1 = findViewById(R.id.Listview1);
        switch (local) {
            case "ENGATIVA":
                tv1.setText(" LOCALIDAD ENGATIVA ");
                Engativa();
                break;
            case "SUBA":
                tv1.setText(" LOCALIDAD SUBA ");
                suba ();
                break;
            case "USAQUÉN":
                tv1.setText(" LOCALIDAD USAQUÉN ");
                Usaquen();
                break;
            case "CHAPINERO":
                tv1.setText(" LOCALIDAD CHAPINERO ");
                Chapinero ();
                break;
            case "SANTA FE":
                tv1.setText(" LOCALIDAD SANTA FE ");
                SantaFe();
                break;
            case "SAN CRISTÓBAL":
                tv1.setText(" LOCALIDAD SAN CRISTÓBAL ");
                Sancristobal ();
                break;
            case "FONTIBÓN":
                tv1.setText(" LOCALIDAD FONTIBÓN ");
                Fontibon ();
                break;
            case "BARRIOS UNIDOS":
                tv1.setText(" LOCALIDAD BARRIOS UNIDOS ");
                Barriosunidos ();
                break;
            case "USME":
                tv1.setText(" LOCALIDAD USME ");
                Usme ();
                break;
            case "TUNJUELITO":
                tv1.setText(" LOCALIDAD TUNJUELITO ");
                Tunjuelito();
                break;
            case "BOSA":
                tv1.setText(" LOCALIDAD BOSA ");
                Bosa ();
                break;
            case "KENNEDY":
                tv1.setText(" LOCALIDAD KENNEDY ");
                Kennedy ();
                break;
            case "TEUSAQUILLO":
                tv1.setText(" LOCALIDAD TEUSAQUILLO ");
                Teusaquillo();
                break;
            case "LOS MÁRTIRES":
                tv1.setText(" LOCALIDAD LOS MÁRTIRES ");
                Martires();
                break;
            case "ANTONIO NARIÑO":
                tv1.setText(" LOCALIDAD ANTONIO NARIÑO");
                AntonioNariño ();
                break;
            case "PUENTE ARANDA":
                PuenteAranda ();
                tv1.setText(" LOCALIDAD PUENTE ARANDA");
                break;
            case "LA CANDELARIA":
                tv1.setText(" LOCALIDAD LA CANDELARIA ");
                Candelaria();
                break;
            case "RAFAEL URIBE URIBE":
                tv1.setText(" LOCALIDAD RAFAEL URIBE URIBE");
                Rafaeluribe ();
                break;
            case "CIUDAD BOLÍVAR":
                tv1.setText(" LOCALIDAD CIUDAD BOLÍVAR");
                Ciudadbolivar ();
                break;
            case "SUMAPAZ":
                tv1.setText(" LOCALIDAD SUMAPAZ");
                Sumapaz ();
                break;
        }
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
         Intent intent1 = new Intent(getApplicationContext(), Mapashospitales.class);
         String j = lv1.getItemAtPosition(i).toString();
         intent1.putExtra("localidad",j);
        startActivity(intent1);
            }
        });
    }
    public void Engativa () {
        String engativa []= {  "HOSPITAL ENGATIVA","UPA QUIRIGUA","UNIDAD DE SALUD PUBLICA PARIS GAITAN","UPA ALAMOS","CAMI EMAUS", "UPA MINUTO DE DIOS"
                         ,"UPA BACHUE","UPA ESPAÑOLA", "UPA BOYACA REAL", "CAMI FERIAS", "UPA BELLAVISTA","UPA ESTRADA", "HOSPITAL CALLE 80",
                            "UPA GARCES NAVAS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,engativa);
        lv1.setAdapter(adapter);
    }
    public void suba () {
        String Suba []= {"HOSPITAL SUBA","CLINICA DE MEDICINA FISICA Y REHABILITACION FRAY BARTOLOME DE LAS CASAS",
                "UPA NUEVA ZELANDIA","CENTRO DE ATENCION PRIMARIA JB SCALABRINI","UPA RINCON","HOSPITAL CENTRO DE SERVICIOS ESPECIALIZADOS",
                " CAMI PRADO VERANIEGO","CAMI GAITANA","CAMI SUBA","CENTRO DE ATENCION PRIMARIA SAN CAYETANO",
                "CENTRO DE ATENCION PRIMARIA SAN CARLOS"," CENTRO DE SERVICIOS  ESPECIALIZADOS", "UPA GAITANA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Suba);
        lv1.setAdapter(adapter);
    }
    public void Kennedy () {
        String kenedy []=  {"HOSPITAL DEL SUR","UPA 91 CLASS","UPA 63 ALQUERIA","UBA VISION DE COLOMBIA","UPA 10 CENTRO GERIATRICO ABASTOS",
                "UBA 65 DINDALITO"," UPA  72 ARGELIA","UPA 68 BRITALIA","UPA 37 PIO XII","UPA 30 BOMBEROS","UPA 79 CARVAJAL",
                "CAMI 71 PATIO BONITO"," UPA 105 CATALINA", " UBA 50 MEXICANA","UPA 29  KENNEDY","UPA 92 PATIOS","UNIDAD DE SALUD MENTAL FLORALIA",
                "HOSPITAL OCCIDENTE DE KENNEDY"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,kenedy);
        lv1.setAdapter(adapter);

    }
    public void PuenteAranda () {
        String puenteAranda []=  {"HOSPITAL DEL SUR","UPA 11 PUENTE ARANDA","UPA 35  CUNDINAMARCA","UPA 26 ALCALA MUZU",
                "CAMI 17 TRINIDAD GALAN","  CAMI 17 TRINIDAD GALAN"," UPA 36 ASUNCION BOCHICA","UPA 46 SANTA RITA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,puenteAranda);
        lv1.setAdapter(adapter);
    }
    public void Fontibon () {
        String fontibon []=  {"HOSPITAL FONTIBON","UPA CENTRO DIA","UBA SANIDAD PORTUARIA TERMINAL TERRESTRE","UPA 50 PUERTA DE TEJA",
                "  UBA CENTRO DE SANIDAD PORTUARIA TERMINAL AEREO"," UPA 49 INTERNACIONAL"," CAMI SAN PABLO","CAMI 2 FONTIBON",
                " UNIDAD MEDICA AMBULATORIA","UPA 48 SAN PABLO","UPA GRAN ESTACION"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,fontibon);
        lv1.setAdapter(adapter);
    }
    public void Sumapaz () {
        String sumapaz []=  {"HOSPITAL NAZARETH","CENTRO DE DESARROLLO DEL POTENCIAL HUMANO",
                "CAMI I NAZARETH"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sumapaz);
        lv1.setAdapter(adapter);
    }
    public void Usme () {
        String usme []=  {"HOSPITAL NAZARETH","HOSPITAL DE USME","UPA SAN JUAN DE SUMAPAZ","UPA YOMASA","UPA SAN JUAN BAUTISTA",
                "UPA LORENZO ALCANTUZ", "UBA ARRAYANES", "UPA LA FLORA", "UPA SANTA MARTA","UBA DESTINO",
                "UPA DANUBIO AZUL","UPA BETANIA","UPA LA REFORMA","UPA LA FISCALA - SAN CAMILO", "CAMI SANTA LIBRADA",
                "SEDE II CONSULTA SANTA LIBRADA", "UPA MARICHUELA","CAMI USME"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,usme);
        lv1.setAdapter(adapter);

    }
    public void Bosa () {
        String bosa []=  {"HOSPITAL PABLO VI BOSA","CENTRO DE SALUD Y DESARROLO HUMANO EL PARAISO","CAMI I NAZARETH",
                " UPA JOSE MARIA CARBONELL", " UPA LAURELES"," UPA OLARTE" , " UPA LA ESTACION","UBA EL JARDIN",
                "PABLIFARMACIA", "UPA PALESTINA","CENTRO DE SALUD Y DESARROLLO HUMANO BARRIO EL RECREO",
                "UPA CABAÑAS", "CAMI PABLO VI BOSA", "UPA PIAMONTE", " UPA EL PORVENIR","UBA SAN JOAQUIN" ,
                "CENTRO DE SALUD Y DESARROLLO HUMANO SANTA FE", "UBA EL TOCHE","UBA SAN BERNARDINO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,bosa);
        lv1.setAdapter(adapter);
    }
    public void AntonioNariño () {
        String antonio []=  {"HOSPITAL RAFAEL URIBE URIBE","CENTRO DE EXCELENCIA DE ATENCION PRIMARIA EN SALUD SAN JUAN DE DIOS",
                "HOSPITAL SANTA CLARA","HOSPITAL LA VICTORIA SEDE MATERNO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,antonio);
        lv1.setAdapter(adapter);
    }
    public void Rafaeluribe () {
        String rafael []=  {"HOSPITAL RAFAEL URIBE URIBE","CAMI CHIRCALES","UPA GRANJAS DE SAN PABLO", "UPA LOMAS" ,
                "UPA SAN JORGE", "UPA BRAVO PAEZ","CAMI DIANA TURBAY", "CAMI OLAYA","UPA QUIROGA", "UPA SAN JOSE OBRERO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,rafael);
        lv1.setAdapter(adapter);
    }
    public void Barriosunidos () {
        String barrios []=  {"HOSPITAL CHAPINERO","UPA SAN FERNANDO", "CAMI CHAPINERO", "UPA RIONEGRO",
                "UPA LORENCITA VILLEGAS DE SANTOS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,barrios);
        lv1.setAdapter(adapter);
    }
    public void Chapinero () {
        String chapinero []=  {"HOSPITAL CHAPINERO","UBA MARISCAL SUCRE","CAMI CHAPINERO","UPA SAN FERNANDO",
                "UPA SAN LUIS" ,"UPA LORENCITA VILLEGAS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,chapinero);
        lv1.setAdapter(adapter);
    }
    public void Teusaquillo() {
        String teusaquillo []=  {"HOSPITAL CHAPINERO","UPA SAN LUIS","HOSPITAL LA VICTORIA UNIDAD DE CRONICOS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,teusaquillo);
        lv1.setAdapter(adapter);
    }
    public void Sancristobal () {
        String sancristobal []=  {"HOSPITAL LA VICTORIA","HOSPITAL ESE SAN CRISTOBAL","UPA LOS ALPES", "UPA 1° DE MAYO", "UPA LA VICTORIA",
                "UBA CARCEL DISTRITAL", "CAMI ALTAMIRA","UPA BELLO HORIZONTE","CENTRO DE ATENCION EN DROGADICCION DESPERTAR",
                "SAN BLAS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sancristobal);
        lv1.setAdapter(adapter);
    }
    public void Usaquen() {
        String usaquen []=  {"HOSPITAL SIMON BOLIVAR","HOSPITAL DE USAQUEN","UPA SAN CRISTOBAL","UPA SERVITA","CAMI VERBENAL",
                "UBA SANTA CECILIA", "UBA BUENAVISTA", "UPA USAQUEN", "UPA CODITO", "UPA ORQUIDEAS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,usaquen);
        lv1.setAdapter(adapter);
    }
    public void Ciudadbolivar () {
        String ciudadbolivar []=  {"HOSPITAL VISTA HERMOSA","UPA LA ESTRELLA", "UPA SIERRA MORENA", "UPA MOCHUELO","UPA PASQUILLA",
                "CAMI VISTA HERMOSA", "UPA CASA DE TEJA","UPA CANDELARIA LA NUEVA","CAMI MANUELA BELTRAN","CAMI JERUSALEN",
                "UPA POTOSI","CENTRO DE ATENCION PRIMARIA EN SALUD PROGRAMAS JUVENILES","CENTRO DE ATENCION PRIMARIA EN SALUD MANUELA BELTRAN",
                "CENTRO DE ATENCION PRIMARIA EN SALUD CANDELARIA","UPA SAN FRANCISCO","UBA SAN ISIDRO","UBA PARAISO", "CENTRO DE ATENCION PRIMARIA EN SALUD JERUSALEN",
                "UPA LIMONAR" , "UPA ISMAEL PERDOMO","HOSPITAL MEISSEN SEDE PRINCIPAL","HOSPITAL MEISSEN SEDE FARMACIA Y LABORATORIO CLINICO",
                "HOSPITAL MEISSEN SEDE CONSULTA EXTERNA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ciudadbolivar);
        lv1.setAdapter(adapter);
    }
    public void Tunjuelito() {
        String tunjuelo []=  {"HOSPITAL EL TUNAL","HOSPITAL TUNJUELITO","UNIDAD AMBULATORIA SALUDABLE", "UNIDAD DE SALUD MENTAL SAN BENITO", "UNIDAD ISLA DEL SOL",
                "UNIDAD DE MEDICINA INTERNA","UNIDAD MATERNO INFANTIL EL CARMEN", "UNIDAD QUIRURGICA VENECIA","UNIDAD DE REHABILITACION", "CLINICA ODONTOLOGICA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tunjuelo);
        lv1.setAdapter(adapter);
    }
    public void Candelaria() {
        String candelaria []=  {"HOSPITAL CENTRO ORIENTE","SEDE ASISTENCIAL CANDELARIA", "SEDE ASISTENCIAL LOURDES"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,candelaria);
        lv1.setAdapter(adapter);
    }
    public void Martires() {
        String martires []=  {"HOSPITAL CENTRO ORIENTE","SEDE ASISTENCIAL SAMPER MENDOZA", "SEDE ASISTENCIAL LA FAYETTE","SEDE ASISTENCIAL RICAURTE"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,martires);
        lv1.setAdapter(adapter);
    }
    public void SantaFe() {
        String santafe []=  {"HOSPITAL CENTRO ORIENTE","SEDE ASISTENCIAL LACHES", "SEDE ASISTENCIAL CRUCES","SEDE JORGE ELIECER GAITAN CENTRO DE ESPECIALISTAS","SEDE ASISTENCIAL PERSEVERANCIA","SEDE ASISTENCIAL SANTA ROSA DE LIMA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,santafe);
        lv1.setAdapter(adapter);
    }
}