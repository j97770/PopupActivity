package angeloid.example.popupactivity;

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

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import angeloid.library.popupactivity.PopupActivity;

public class PopupScreen extends PopupActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		isOnTitle(false);
		isBind(true);
		setOutsideTouch(true);
		WindowBuild();
		setContentView(R.layout.popupscreen);
		getLayout();
		setBackground(new ColorDrawable(0xfffee4f6));
	}

}
