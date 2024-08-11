## Swipe-Button
![GitHub release (latest by date)](https://img.shields.io/github/v/release/nemosofts/swipe-btn)
<a href="https://github.com/nemosofts/swipe-btn">
    <img src="https://komarev.com/ghpvc/?username=nemosofts&style=flat&color=red">
</a>

<img src="https://raw.githubusercontent.com/nemosofts/swipe-btn/master/screenshot/btn3.png">

Library of an android button activated by swipe. 

- Easy to use. 
- Makes your app look great
- Better UX in sensitive button

#### 1. Add module dependencies
For example you can add dependencies on the modules like this:
`build.gradle.kts`

```kotlin
implementation("com.github.nemosofts:swipe-btn:1.X.X")
```

Or in Gradle Groovy DSL `build.gradle`:

```groovy
implementation 'com.github.nemosofts:swipe-btn:1.X.X'
```

```xml
<com.nemosofts.swipebutton.SwipeButton
    android:id="@+id/swipe_btn"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginStart="20dp"
    android:layout_marginEnd="20dp"
    app:inner_text="Slide to Unlock"
    app:inner_text_color="#FFFFFF"
    app:inner_text_size="16sp"
    app:inner_text_top_padding="18dp"
    app:inner_text_bottom_padding="18dp"
    app:inner_text_background="@drawable/shape_rounded_new"
    app:button_image_height="60dp"
    app:button_image_width="100dp"
    app:button_image_disabled="@drawable/ic_lock_open"
    app:button_image_enabled="@drawable/ic_lock"
    app:button_left_padding="20dp"
    app:button_right_padding="20dp"
    app:button_top_padding="20dp"
    app:button_bottom_padding="20dp"
    app:button_background="@drawable/shape_button_new"
    app:initial_state="disabled"
    app:has_activate_state="true" />
```

where `1.X.X` is your preferred version. All modules must be the same version.
