class OnClickListener() {
    abstract void onClick(View v);
};

public class MainActivity extends Activity {

    TextView element;
	
	@Override
    public void onCreate() {

		OnClickListener oclBtnOk = new OnClickListener() {
				@Override
				public void onClick(View v) {
					// Меняем текст элемента
					element.setText("Нажата кнопка ОК");
				}
			};

    }
}