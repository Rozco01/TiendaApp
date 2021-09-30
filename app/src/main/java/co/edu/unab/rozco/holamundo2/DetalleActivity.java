package co.edu.unab.rozco.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetalleActivity extends AppCompatActivity {
    private TextView TexDetalle;
    private ImageView ivProducto;
    private TextView TexPrecio;
    private TextView TexDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        TexDetalle = findViewById(R.id.tv_titulo_detalle);
        ivProducto = findViewById(R.id.imageView2);
        TexPrecio = findViewById(R.id.tv_precio_detalle);
        TexDescripcion = findViewById(R.id.tv_descripcion_detalle);
        Object prueba = 2;
        int otro = (int) prueba;

        Producto Miproducto = (Producto) getIntent().getSerializableExtra("pro1");

        TexDetalle.setText(getString(R.string.txt_titulo_detalle, Miproducto.getNombre()));
        TexPrecio.setText(String.valueOf(Miproducto.getPrecio()));
        TexDescripcion.setText(Miproducto.getDescripcion());
        Glide.with(DetalleActivity.this).load(Miproducto.getUrlImagen()).into(ivProducto);





    }
}