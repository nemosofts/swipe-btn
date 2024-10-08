## Swipe-Button
![GitHub release (latest by date)](https://img.shields.io/github/v/release/nemosofts/swipe-btn)
<a href="https://github.com/nemosofts/swipe-btn">
    <img src="https://komarev.com/ghpvc/?username=nemosofts&style=flat&color=red">
</a>
[![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23)
[![CodeFactor](https://www.codefactor.io/repository/github/nemosofts/swipe-btn/badge)](https://www.codefactor.io/repository/github/nemosofts/swipe-btn)

<img src="https://raw.githubusercontent.com/nemosofts/swipe-btn/master/screenshot/btn7.png">

Library of an android button activated by swipe. 

- Easy to use. 
- Makes your app look great
- Better UX in sensitive button

#### 1. Add module dependencies
For example you can add dependencies on the modules like this:
`build.gradle.kts`

```kotlin
implementation("com.github.nemosofts:swipe-btn:1.0.0")
```

Or in Gradle Groovy DSL `build.gradle`:

```groovy
implementation 'com.github.nemosofts:swipe-btn:1.0.0'
```
## How to use
Add the button in your layout file and customize it the way you like it.
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
    app:inner_text_background="@drawable/shape_rounded"
    app:button_image_height="60dp"
    app:button_image_width="100dp"
    app:button_image_disabled="@drawable/ic_lock_open"
    app:button_image_enabled="@drawable/ic_lock"
    app:button_left_padding="20dp"
    app:button_right_padding="20dp"
    app:button_top_padding="20dp"
    app:button_bottom_padding="20dp"
    app:button_background="@drawable/shape_button"
    app:initial_state="disabled"
    app:has_activate_state="true" />
```
### Setting the sliding button size
You can set the size of the moving part of the button by changing the app:button_image_width and app:button_image_height properties.

### Setting the text part size
You can set the size of the fixed part of the button by setting the text size of the setting the padding in this part.

## Listening for changes
You can set a listener for state changes
```java
SwipeButton enableButton1 =  findViewById(R.id.swipe_btn);
enableButton1.setOnStateChangeListener(new OnStateChangeListener() {
    @Override
    public void onStateChange(boolean active) {
        Toast.makeText(MainActivity.this, "State: " + active, Toast.LENGTH_SHORT).show();
    }
});
```
Or listen for the activation of the button
```java
swipeButtonNoState.setOnActiveListener(new OnActiveListener() {
    @Override
    public void onActive() {
        Toast.makeText(MainActivity.this, "Active!", Toast.LENGTH_SHORT).show();
    }
});
```

## Configure XML

 - button_image_width: Change the width of the moving part of the button
 - button_image_height: Change the height of the moving part of the button
 - inner_text: Text in the center of the button. It disapears when swiped
 - inner_text_color: Color of the text
 - inner_text_size: Size of the text
 - inner_text_[direction]_padding: Sets the padding of the text inside the button. You can set how big this part of the button will by setting text size and padding.
 - button_image_disabled: Icon of the button when disabled. This is the initial state. 
 - button_image_enabled: Icon of the button when disabled. This is the initial expanded state. 
 - button_[direction]_padding: Sets the padding of the button the slide with the touch. You can set how big the button will be by setting the image and the padding
 - initial_state: Initial state. Default state is disabled.
 - has_activate_state: Set if the button stops in the "active" state. If false, the button will only come back to the initial state after swiped until the end of its way. Use OnActiveListener if you set the parameter to false.
 - button_trail_enabled: Set trailing effect enabled. 
 - button_trail_drawable: Set the color of the trailing effect.

<img src="https://raw.githubusercontent.com/nemosofts/swipe-btn/master/screenshot/btn4.png">

where `1.X.X` is your preferred version. All modules must be the same version.
