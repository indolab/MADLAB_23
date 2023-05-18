import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView selectedLanguageTextView;
    private ImageView languageMenuImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedLanguageTextView = findViewById(R.id.selectedLanguageTextView);
        languageMenuImageView = findViewById(R.id.languageMenuImageView);

        // Register the ImageView for the context menu
        registerForContextMenu(languageMenuImageView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        // Inflate the context menu
        getMenuInflater().inflate(R.menu.language_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // Handle menu item selection
        switch (item.getItemId()) {
            case R.id.menu_item_english:
                selectedLanguageTextView.setText("English");
                return true;
            case R.id.menu_item_french:
                selectedLanguageTextView.setText("French");
                return true;
            case R.id.menu_item_spanish:
                selectedLanguageTextView.setText("Spanish");
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
