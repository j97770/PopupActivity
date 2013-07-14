PopupActivity
=============

/*
 * 팝업 액티비티 라이브러리
 * 제작 : 2013년 7월 9일
 * 
 * Copyleft 2013 서동길, 엔젤로이드.
 * 
 * 이 라이브러리는 팝업 액티비티를 편하고 빠르게 만들 수 있는 라이브러리입니다.
 * 이 라이브러리를 사용하기 위해서는 상속 후 만드려는 액티비티의 속성을 PopupActivity로 바꿔주세요.
 * 예) public class MainActivity extends PopupActivity
 * 현재 팝업 액티비티 라이브러리로 커스텀 뷰를 포함한 액티비티 뷰를 만들 수 있습니다.
 * 
 * 라이브러리를 사용하려고 하면, popupscreen라는 이름을 가진 RelativeLayout를 만들어주시고, 아래 소스를 넣어주세요.
  
           <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="300dip" // 크기 조절이 가능합니다
            android:layout_height="240dip" // 크기 조절이 가능합니다
            android:layout_centerInParent="true"
            android:id="@+id/popupscreen" >
    
            // 여기에 뷰를 넣어주세요. 텍스트 뷰나 에디트 뷰, 웹 뷰 등 액티비티 뷰라면 전부 가능합니다.
            </RelativeLayout>

 * 그리고 AndroidManifest.xml의 액티비티 속성에 아래 소스를 넣어주세요.
 *          android:configChanges="orientation|keyboardHidden"
            android:windowSoftInputMode="stateHidden"
            android:theme="@android:style/Theme.Dialog" 또는
            android:theme="@android:style/Theme.Holo.Dialog" 
            (하위 버전 지원시 HoloAnywhere 상속 필요!)
     
 * 그리고 속성을 설정하면 됩니다.
 * 
 * 본 라이브러리는 Apache 2.0 License에 의거합니다. 
 * 그 외에, 당신이 이 라이브러리를 사용했다는 점만 명시해 두면 더 좋을 바가 없겠지요!
 * 팝업 액티비티 라이브러리에 대한 리포트는 팝업 액티비티 라이브러리(http://github.com/angeloidteam/PopupActivity)의 이슈에 넣어주세요.
 * 보내주신 Pull Request나 Issue는 라이브러리의 발전에 지대한 영향을 미칩니다.
 */
