package co.edu.unab.rozco.holamundo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListadoActivity extends AppCompatActivity {

    private ArrayList<Producto> Productos;
    private RecyclerView rvProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        String email = getIntent().getStringExtra("email");
        setTitle(email);

        rvProductos= findViewById(R.id.rv_productos_listado);

        Productos = new ArrayList<>();
        Cargar();

        ProductoAdapter miAdaptador = new ProductoAdapter(Productos);
        rvProductos.setAdapter(miAdaptador);

        rvProductos.setLayoutManager(new LinearLayoutManager(ListadoActivity.this));
        rvProductos.setHasFixedSize(true);

        miAdaptador.setOnItemClickListener(new ProductoAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(Producto miProducto) {
                Intent miIntencion = new Intent(ListadoActivity.this, DetalleActivity.class);
                miIntencion.putExtra("pro1", miProducto);
                startActivity(miIntencion);
            }
        });
//        rvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Producto miProducto = Productos.get(i);
//                Toast.makeText(ListadoActivity.this, "Hizo clic en " + miProducto.getNombre(), Toast.LENGTH_SHORT).show();
//                Intent miIntencion = new Intent(ListadoActivity.this, DetalleActivity.class);
//                miIntencion.putExtra("pro1", miProducto);
//                startActivity(miIntencion);
//            }
//        });
    }

    private void Cargar(){
        Producto pr1 = new Producto("memoria USB", 7000, "https://st.depositphotos.com/1020341/4233/i/600/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg");
        Productos.add(pr1);
        Producto pr2 = new Producto("teclado", 50000, "https://st.depositphotos.com/1020341/4233/i/600/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg");
        Productos.add(pr2);
        Producto pr3 = new Producto("Memoria Ram", 70000, "https://st.depositphotos.com/1020341/4233/i/600/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg");
        Productos.add(pr3);
        Producto pr4 = new Producto("Pantalla", 700000, "https://st.depositphotos.com/1020341/4233/i/600/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg");
        Productos.add(pr4);
    }
}