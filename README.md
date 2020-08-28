# Carousel View

### Installation
	     	        
```sh
	        implementation 'com.github.waihanko:CarouselView:Tag'
```

```sh
repositories {
  google()
  jcenter()
  maven { url 'https://jitpack.io' }
}
```
### Usages
```sh
<com.singlecell.carousel.ui.Slider
                        android:id="@+id/sl_carousel"
                        android:layout_width="match_parent"
                        android:layout_height="@dimen/slider_card_height"
                        app:animateIndicators="true"
                        app:defaultIndicators="circle"
                        app:indicatorSize="@dimen/spacing_8dp"
                        app:intervalSecond="5"
                        app:loopSlides="true"
                        app:sliderImageHeight="@dimen/slider_card_height"
                         />
```

| Attributes   |      Values      |
|----------|:-------------:|
|indicatorSize|dimension|
|pageMargin|dimension|
|paddingTop|dimension|
|paddingLeft|dimension|
|paddingRight|dimension|
|paddingBottom|dimension|
|selected_slideIndicator|reference|
|unselected_slideIndicator|reference|
|defaultIndicators|integer|        
|animateIndicators|boolean|
|intervalSecond|integer|
|loopSlides|boolean|
|hideIndicators|boolean|
|sliderPlaceholderImage|reference|
|sliderErrorImage|reference|
|sliderImageHeight|dimension|
|defaultTransition|integer |  
|defaultTransform|integer|   
|indicatorActiveColor|color|
|indicatorInactiveColor|color|


    
