package com.example.gestioncommerciale;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0015¨\u0006\u0007"},
        d2 = {"Lcom/example/commerce/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Commerce.app.main"}
)
public final class HomeActivity extends AppCompatActivity {
    @SuppressLint({"MissingInflatedId", "ResourceType"})
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300003);
        Button confirmer = (Button)this.findViewById(1000006);
        final EditText idProduct = (EditText)this.findViewById(1000008);
        final EditText Quantite = (EditText)this.findViewById(1000023);
        confirmer.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                EditText var10000 = idProduct;
                Intrinsics.checkNotNullExpressionValue(var10000, "idProduct");
                String textId = var10000.getText().toString();
                var10000 = Quantite;
                Intrinsics.checkNotNullExpressionValue(var10000, "Quantite");
                String quanit = var10000.getText().toString();
                Intent intentToConfirmeActivity = new Intent((Context)HomeActivity.this, ConfirmerActivity.class);
                HomeActivity.this.startActivity(intentToConfirmeActivity);
            }
        }));
    }
}
