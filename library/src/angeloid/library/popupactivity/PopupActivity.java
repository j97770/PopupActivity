package angeloid.library.popupactivity;

/*
 * �˾� ��Ƽ��Ƽ ���̺귯��
 * ���� : 2013�� 7�� 9��
 * 
 * Copyleft 2013 ������, �������̵�.
 * 
 * �� ���̺귯���� �˾� ��Ƽ��Ƽ�� ���ϰ� ������ ���� �� �ִ� ���̺귯���Դϴ�.
 * �� ���̺귯���� ����ϱ� ���ؼ��� ��� �� ������� ��Ƽ��Ƽ�� �Ӽ��� PopupActivity�� �ٲ��ּ���.
 * ��) public class MainActivity extends PopupActivity
 * ���� �˾� ��Ƽ��Ƽ ���̺귯���� Ŀ���� �並 ������ ��Ƽ��Ƽ �並 ���� �� �ֽ��ϴ�.
 * ���̺귯���� ����Ϸ��� �ϸ�, popupscreen��� �̸��� ���� RelativeLayout�� ������ֽð�, �Ʒ� �ҽ��� �־��ּ���.
 * <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="300dip" // ũ�� ������ �����մϴ�
    android:layout_height="240dip" // ũ�� ������ �����մϴ�
    android:layout_centerInParent="true"
    android:id="@+id/popupscreen" >
    
    // ���⿡ �並 �־��ּ���. �ؽ�Ʈ �䳪 ����Ʈ ��, �� �� �� ��Ƽ��Ƽ ���� ���� �����մϴ�.
    </RelativeLayout>
 * �׸��� AndroidManifest.xml�� ��Ƽ��Ƽ �Ӽ��� �Ʒ� �ҽ��� �־��ּ���.
 *          android:configChanges="orientation|keyboardHidden"
            android:windowSoftInputMode="stateHidden"
            android:theme="@android:style/Theme.Dialog" �Ǵ�
            android:theme="@android:style/Theme.Holo.Dialog" 
            (���� ���� ������ HoloAnywhere ��� �ʿ�!)
     
 * �׸��� �Ӽ��� �����ϸ� �˴ϴ�.
 * 
 * �� ���̺귯���� Apache 2.0 License�� �ǰ��մϴ�. 
 * �� �ܿ�, ����� �� ���̺귯���� ����ߴٴ� ���� ����� �θ� �� ���� �ٰ� ��������!
 * �˾� ��Ƽ��Ƽ ���̺귯���� ���� ����Ʈ�� �˾� ��Ƽ��Ƽ ���̺귯��(http://github.com/angeloidteam/PopupActivity)�� �̽��� �־��ּ���.
 * �����ֽ� Pull Request�� Issue�� ���̺귯���� ������ ������ ������ ��Ĩ�ϴ�.
 */

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class PopupActivity extends Activity {

	/*
	 * ���� ���� ����
	 */
	WindowManager.LayoutParams mlp;
	RelativeLayout mla;

	@Override
	protected void onCreate(Bundle SavedInstanceState) {
		super.onCreate(SavedInstanceState);
		mlp = new WindowManager.LayoutParams();
			}

	/*
	 * ���̾ƿ��� �����մϴ�.
	 * �˾� ��Ƽ��Ƽ�� RelativeLayout ����� �����մϴ�.
	 * @param setContentView(R.layout.popupscreen);
	 */
	public void setContentView(Layout layout) {
		setContentView(layout);
		
	}
	
	/*
	 * ���̾ƿ� id�� �����մϴ�.
	 * �˾� ��Ƽ��Ƽ�� RelativeLayout ����� �����մϴ�.
	 * @param getLayout();
	 */
	public void getLayout() {
		mla = (RelativeLayout) findViewById(R.id.popupscreen);
	}

	/*
	 * �˾� ��Ƽ��Ƽ �̿� �κп� �� ȿ���� �����մϴ�
	 * �� ȿ���� £�� ���� ��� �� dimAmout = 0.7f �κ��� �����ϼ���.
	 * (0.0f [���� ��Ӱ�] ~ 1.0f [�� ȿ�� ����])
	 * @param isBind(true)
	 * @param mlp.dimAmount = 0.5f
	 */
	public boolean isBind(Boolean bind) {
		if (bind == true) {
			mlp.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
			mlp.dimAmount = 0.7f;
		}
		return bind;
	}
	
	/*
	 * ������ ������ ������ �� ����մϴ�. 
	 * ���� setContentView(Layout) ���� ���Դϴ�.
	 * @param setOutsideTouch(true)
	 */
	public void WindowBuild() {
		getWindow().setAttributes(mlp);
	}
	
	/*
	 * ���̾ƿ��� �ٱ� �� ��ġ�� �������� �����մϴ�.
	 * ����ڿ� ���� SharedPreferences�� �̿��� ���� ����� �����ϼ���
	 * @param setOutsideTouch(true)
	 */
	public boolean setOutsideTouch(Boolean outside) {
		if (!(outside == true)) {
			mlp.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
		}
		return outside;
	}
	
	
	
	/*
	 * �˾� ��Ƽ��Ƽ�� ���ȭ���� �����մϴ�
	 * @param setBackground(R.drawable.popupBackground.9);
	 */
	public void setBackground(Drawable drawable) {
		mla.setBackground(drawable);
	}
	
	/*
	 * �˾� ��Ƽ��Ƽ�� �������� �����մϴ�.
	 * @param setBackground(R.color.Red);
	 */
	public void setBackground(int color) {
		mla.setBackgroundColor(color);
	}
	
	/*
	 * �˾� ��Ƽ��Ƽ�� Ÿ��Ʋ�� ǥ������ �����մϴ�.
	 * @param isOnTitle(false);
	 */
	public boolean isOnTitle(boolean title) {
		if (!(title == true)) {
			requestWindowFeature(Window.FEATURE_NO_TITLE);
		}
		return title;
	}
	
	/*
	 * �˾� ��Ƽ��Ƽ�� Ÿ��Ʋ�� �����մϴ�.
	 * @param setTitle("�˾� �޸�");
	 */
	public void setTitle(String title) {
		setTitle(title);
	}
}