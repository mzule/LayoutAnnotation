## 功能
一个支持 @Layout 指定布局的库，支持在任意 class 上使用。

## 集成

``` groovy
buildscript {
  dependencies {
    classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
  }
}
```
``` groovy
apply plugin: 'android-apt'

dependencies {
    compile 'com.github.mzule.layoutannotation:library:1.0.3'
    apt 'com.github.mzule.layoutannotation:compiler:1.0.3'
}
```

## 使用

``` java
@Layout(R.layout.activity_main)
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutBinder.bind(this);
    }
}
```

``` java
@Layout(R.layout.fragment_main)
public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return LayoutBinder.inflate(this);
    }
}
```

集成在 BaseActivity 和 ButterKnife 一起使用效果更佳。

``` java
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutBinder.bind(this);
        ButterKnife.bind(this);
    }
}
```

## 混淆配置

``` groovy
-keep class com.github.mzule.layoutannotation.** { *; }
```

## 许可

Apache License  2.0

## 联系我

任何相关问题都可以通过以下方式联系我。

1. 提 issue
1. 新浪微博 http://weibo.com/mzule
1. 邮件 "mzule".concat("4j").concat("@").concat("gmail.com")