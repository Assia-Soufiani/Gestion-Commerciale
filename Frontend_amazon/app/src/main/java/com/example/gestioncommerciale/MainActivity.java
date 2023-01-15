package com.example.gestioncommerciale;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0015¨\u0006\u0007"},
        d2 = {"Lcom/example/commerce/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Commerce.app.main"}
)
public final class MainActivity extends AppCompatActivity {
    @SuppressLint({"SetTextI18n", "MissingInflatedId", "ResourceType"})
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300002);
        Button connect = (Button)this.findViewById(1000021);
        final EditText email = (EditText)this.findViewById(1000000);
        final EditText password = (EditText)this.findViewById(1000022);
        final TextView error = (TextView)this.findViewById(1000009);
        TextView CreerCompte = (TextView)this.findViewById(1000002);
        connect.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                TextView var10000 = error;
                Intrinsics.checkNotNullExpressionValue(var10000, "error");
                var10000.setVisibility(8);
                EditText var8 = email;
                Intrinsics.checkNotNullExpressionValue(var8, "email");
                String textEmail = var8.getText().toString();
                var8 = password;
                Intrinsics.checkNotNullExpressionValue(var8, "password");
                String textpassword = var8.getText().toString();
                CharSequence var4 = (CharSequence)StringsKt.trim((CharSequence)textEmail).toString();
                if (var4.length() != 0) {
                    var4 = (CharSequence)StringsKt.trim((CharSequence)textpassword).toString();
                    if (var4.length() != 0) {
                        String correctEmail = "aa@gmail.com";
                        String correctPassword = "123";
                        if (Intrinsics.areEqual(textEmail, correctEmail) && Intrinsics.areEqual(textpassword, correctPassword)) {
                            Intent intentToHomeActivity = new Intent((Context)MainActivity.this, HomeActivity.class);
                            MainActivity.this.startActivity(intentToHomeActivity);
                        } else {
                            var10000 = error;
                            Intrinsics.checkNotNullExpressionValue(var10000, "error");
                            var10000.setText((CharSequence)"Email ou Mot de passe n'est pas valide!");
                            var10000 = error;
                            Intrinsics.checkNotNullExpressionValue(var10000, "error");
                            var10000.setVisibility(0);
                        }

                        return;
                    }
                }

                var10000 = error;
                Intrinsics.checkNotNullExpressionValue(var10000, "error");
                var10000.setText((CharSequence)"Champ invalid !");
                var10000 = error;
                Intrinsics.checkNotNullExpressionValue(var10000, "error");
                var10000.setVisibility(0);
            }
        }));
        CreerCompte.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intentToCreatCompteActivity = new Intent((Context)MainActivity.this, CreerCompteActivity.class);
                MainActivity.this.startActivity(intentToCreatCompteActivity);
            }
        }));
    }
}
