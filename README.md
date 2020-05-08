# Software Configuration Management #

## Extension of the exercise Drinks template with subclasses ###

...
In the project we have derived a subclass **AppleJuice.java**  from the class *Drinks/SimpleDrink*. 
We have imported the following collections:
* java.util.ArrayList;
* java.util.List;


Further we have implemented an exception for the AppleJuice.java class. 

We created Unit Tests for the functionality of *SimpleDrink* 
and managed to get a 100% test covering. 

To all methods we have added JavaDoc comments. 

Of interest is the implemented *exception* which in case of volume smaller or equal zero will be thrown: 

```java
 private void checkVolume(String name, double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("liquid " + name + " must have a volume > 0");
        }
    }
```

![](https://media.giphy.com/media/xTiQytOEqr2U33lYkg/giphy.gif)